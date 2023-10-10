/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import herencia.Persona;
import java.util.Date;
import javax.swing.JOptionPane;

public class Cliente extends Persona {
    
    private int idCliente=0;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;

    public Cliente(Date fechaRegistro, boolean vip, String nombre,  int edad, char genero, String direccion) {
        super(nombre, edad, genero, direccion);
        
        this.idCliente=++Cliente.contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = this.vip = (JOptionPane.showConfirmDialog(null, "¿Cliente VIP?") == JOptionPane.YES_OPTION) ? true : false;

    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
       this.vip = (JOptionPane.showConfirmDialog(null, "¿Cliente VIP?") == JOptionPane.YES_OPTION) ? true : false;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }


    
    
    
}
