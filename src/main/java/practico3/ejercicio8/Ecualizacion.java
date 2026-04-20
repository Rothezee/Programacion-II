/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico3.ejercicio8;

import practico3.ejercicio7.Sonido;

/**
 *
 * @author usuario
 */
public abstract class Ecualizacion implements Sonido {
    private int graves;
    private int agudos;
    
    
    public void ajustarGraves(int e){
        this.graves = e;
    }
    
    public void ajustarAgudos(int e){
        this.agudos = e;
    }
    
    public int getGraves(){
        return this.graves;
    }
    
    public int getAgudos(){
        return this.agudos;
    }
    
    
}
