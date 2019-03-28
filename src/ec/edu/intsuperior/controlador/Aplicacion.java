
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Persona;
import ec.edu.intsuperior.vista.Login;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PC-IVAN
 */
public class Aplicacion {
    public static void main(String[] args) {
      
        Persona persona = new Persona();
        persona.setCedula(new Scanner(System.in).nextLine());
        persona.setApellido1(JOptionPane.showInputDialog("ingresa un apellido"));
    }
    
}
