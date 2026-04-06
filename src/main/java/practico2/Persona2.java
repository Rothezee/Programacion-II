/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;


/**
 *
 * @author Usuario
 */
public class Persona2 {
    private String Nombre;
    private int edad;
    private String Domicilio;
    private int Ecivil;
    
    public String getNombre(){
        return this.Nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String getDomicilio(){
        return this.Domicilio;
    }
    
    public int getEcivil(){
        return this.Ecivil;
    }
    
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setDomicilio(String Domicilio){
        this.Domicilio = Domicilio;
    }
    public void setECivil(int Ecivil){
        this.Ecivil =  Ecivil;
    }           
    
    public Persona2(String N, int e, String D, int E){
        this.Nombre = N;
        this.edad = e;
        this.Domicilio = D;
        this.Ecivil = E;
    }
    
    public Persona2(){
    }
}
