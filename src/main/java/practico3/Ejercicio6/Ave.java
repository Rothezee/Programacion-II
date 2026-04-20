/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico3.Ejercicio6;

import practico3.ejercicio7.Sonido;

/**
 *
 * @author Usuario
 */
public abstract class Ave implements Sonido{
    private String nombre;
    private int edad;
    private boolean nada;
    
    public Ave(String n , int e, boolean nada){
        this.nada = nada;
        this.edad = e;
        this.nombre = n;
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
