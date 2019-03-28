
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.Administrador;
import ec.edu.intsuperior.vista.Login;
import ec.edu.intsuperior.vista.LoginDocente;

/**
 *
 * @author PC-IVAN
 */
public class Controlador {
    Login login = new Login(this);
    Administrador administrador = new Administrador(this);
    LoginDocente ld = new LoginDocente();
    
    
    public void mostrarLogin(){
        login.setVisible(true);
    }
    
    public void mostrarAdministrador(){
        administrador.setVisible(true);
    
    
        login.Escritorio.removeAll();
        login.Escritorio.add(ld);
        login.Escritorio.revalidate();
}
    public void mostrarPanelEstudiante(){
        login.Escritorio.removeAll();
        login.Escritorio.add(ld);
        login.Escritorio.revalidate();
        login.Escritorio.repaint();
    }
}