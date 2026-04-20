/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico3.Ejercicio6;

/**
 *
 * @author Usuario
 */
public abstract class Ave {
    private String nombre;
    private int edad;
    private boolean nada;
    
    public Ave(boolean nada){
        this.nada = nada;
    }
    
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setEdad(int e){
        this.edad = e;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public boolean getNada(){
        return this.nada;
    }
    
    public abstract void mostrar();
}
