/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico3;

/**
 *
 * @author Usuario
 */
public abstract class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private String direccion;
    
    public Persona(){
    
    }
    
    
    public void setDni(int e){
        this.dni = e;
    }
    
    public void setNombre(String e){
        this.nombre = e;
    }
    
    public void setApellido(String e){
        this.apellido = e;
    }
    
    public void setDireccion(String e){
        this.direccion = e;
    }
        
       
    
    
    public int getDni(){
        return this.dni;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
}
