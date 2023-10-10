/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;
import javax.swing.JOptionPane;

public class Persona {
    
    protected String nombre;
    private int edad;
    private char genero;
    private String direccion;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public Persona(String nombre, int edad, char genero, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
    }

    
    
    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public char getGenero() {
        return this.genero;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{ \n" + "nombre=" + nombre +"\n"+
                ", edad=" + edad +"\n"+
                ", genero=" + genero +"\n"+
                ", direccion=" + direccion + '}';
    }
    
    
    
    
    
}
