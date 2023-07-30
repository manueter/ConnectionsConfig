package control;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Connection;
import model.Connection.motores;
/**
 *
 * @author mneter
 */
public class ControlConfigConnection 
{
    VistaConfigConnection vista;    
    Connection connect;
    boolean trying = false;
    //ArrayList<String> motores;
    public void setTrying(boolean trying){this.trying =trying;}
    public ControlConfigConnection(VistaConfigConnection vista)
    {
        connect = new Connection();
        
        this.vista = vista;
    }
    
    public void cargarMotoresDisponibles()
    {
       ArrayList<String> motores_list = new ArrayList<>();
       for(motores m:motores.values()){motores_list.add(m.name());}
       vista.mostrarMotoresDisponibles(motores_list);
    }
    
    public void setMotor(String motor_selected)
    {
        for(motores m:motores.values()){if(m.name().equals(motor_selected)) connect.setMotor(m);}
        vista.cargarPuertoXDefecto(connect.getPort());
    }
    
    public void setConnection(String motor,String server,int port,String db,String user,char[] pss)
    {
        //controlar vacios
        
        motores mm=null;
        
        if("".equals(motor))
        {
            vista.error("Debe seleccionar un motor.");
        }
        else if("".equals(server) || "".equals(user) || "".equals(db))
        {
            vista.error("Hay campos obligatorios vacios.");
        }
        else if(motor!=null)
        {
            for(motores m:motores.values())
            {
                if(motor.equals(m.name()))
                    mm = m;
            }
            String msg = connect.set(mm, server, port, db, user, pss);
            if(!trying) vista.showMessage(msg);
        }
    }
    
    public void tryConnection()
    {
        trying=true;
        try 
        {
            connect.tryConnect();
            //vista.showMessage(msg);
            trying=false;
        } 
        catch (SQLException ex) 
        {
            vista.error(ex.getMessage());
            trying=false;
            //Logger.getLogger(ControlConfigConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
