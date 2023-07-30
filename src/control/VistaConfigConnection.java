package control;

import java.util.ArrayList;

/**
 *
 * @author mneter
 */
public interface VistaConfigConnection 
{
    public void error(String msg);
    public void showMessage(String msg);
    public void clearOptions();
    
    public void mostrarMotoresDisponibles(ArrayList<String> motores);
    public void cargarPuertoXDefecto(int puerto);

}
