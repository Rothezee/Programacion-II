/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private int DNI;
    private String Nombre;
    
    public Cliente() {
    }
    
    public Cliente(int DNI, String Nombre) {
        this.DNI = DNI;
        this.Nombre = Nombre;
    }
    
    public int getDNI() {
        return this.DNI;
    }
    
    public String getNombre() {
        return this.Nombre;
    }
    
    /*==============Generadodes de atributos===============*/
    
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
