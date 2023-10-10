/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import herencia.Persona;
import herencia.Empleado;
import herencia.Cliente;
import java.util.Date;
import javax.swing.JOptionPane;

public class Herencia {


    
    
    public static void main(String[] args) {

    
    Cliente cliente1=new Cliente(
            new Date(),
            true,
            JOptionPane.showInputDialog("Ingresa el nombre del cliente"), 
            Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del cliente")), 
            JOptionPane.showInputDialog("Ingresa el género (M/F/X)").charAt(0), 
            JOptionPane.showInputDialog("Ingresa una direccion"));
    
    JOptionPane.showMessageDialog(null, cliente1);
    
    }
    
}
