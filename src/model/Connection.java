package model;

import java.sql.DriverManager;
import java.sql.SQLException;
import static model.Connection.motores;

/**
 *
 * @author mneter
 */
public class Connection 
{
    java.sql.Connection connection;
    String connectionUrl ="";
    motores motor_seleccionado;
    
    public void setMotor(motores m) 
    {
        motor_seleccionado = m;
        if(null!=motor_seleccionado)
        {
            switch (motor_seleccionado) 
            {
                case mysql -> {
                    port = 3306;
                }
                case sqlserver -> {
                    port = 1433;
                }
                case postgresql -> {
                    port = 5432;
                }
                default -> {
                }
            }
        }
    }
    
    public enum motores {sqlserver,mysql,postgresql};

    public String getConnectionUrl() {return connectionUrl;}
    public String getServer() {return server;}
    public String getDatabase() {return db;}
    public int getPort() {return port;}
    public String getUser() {return user;}
    public char[] getPss() {return pss;}
        
    //String driver = "jdbc:sqlserver";
    String server = "localhost";
    String db = "prueba";
    int port = 1433;
    String user = "sa";
    char[] pss={'s','a'};
    
    public int getPortXMotor()
    {

        return 0;
    }
    public String set(motores motor, String server, int port, String db, String user, char[] pss)
    {
        
        this.server = server;
        this.db = db;
        this.port = port;
        this.user = user;
        this.pss=pss;
        
        String pw="";
        for(char c :pss)
        {pw+=c;}
        
        
        if(null!=motor_seleccionado)
            connectionUrl = switch (motor_seleccionado) 
            {
                case mysql -> "jdbc:mysql://"+server+":"+port+"/"+db+"?serverTimezone=UTC";
                case sqlserver -> "jdbc:sqlserver://"+server+":"+port+";"+"databaseName="+db+";encrypt=false;trustServerCertificate=true;integratedSecurity=false;";    
                //case sqlserver -> "jdbc:sqlserver://"+server+":"+port+";"+"databaseName="+db+";integratedSecurity=true;";
                case postgresql -> "jdbc:postgresql://"+server+":"+port+"/"+db;
                default -> "";
            };
        if("".equals(server) || "".equals(user) || "".equals("pss") || "".equals(db))
        {return "Se debe completar todos los parametros";}
        return "OK";
    }
        
    public String tryConnect( ) throws SQLException
    {
        
        if(server.equals("") || user.equals("") || pss.equals(""))
        {return "Se debe completar todos los parametros";}
        else
        {
            try
            {
                if(!"".equals(connectionUrl))
                {
                    String pw="";
                    for(char c :pss)
                    {pw+=c;}
                    if(motor_seleccionado!=motores.sqlserver)
                    {connection = DriverManager.getConnection(connectionUrl,user,pw);}
                    else
                    {
                        connection = DriverManager.getConnection(connectionUrl,user,pw);
                    }
                    return "OK";
                }
                else{return "Campos incompletos";}
            }
            catch (SQLException e) 
            {
                throw e;
            }
            catch(Exception ex){throw ex;}
        }
    }
    
    public void disconnect() throws SQLException
    {
        if(connection!=null)
        {
            if(connection.isClosed())
            {
                try
                {
                    connection.close();
                }
                catch (SQLException e)
                {
                    throw e;
                }
                catch(Exception ex){throw ex;}
            }
                
        }
    }
        
    
}
