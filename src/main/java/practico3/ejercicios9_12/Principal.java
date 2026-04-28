/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico3.ejercicios9_12;

/**
 *
 * @author Usuario
 */
public class Principal extends Alimento{
    private int total;
    
    public Principal(){
        super();
        this.total = 0;
    }
    
    public void agregarElemento(int e){
        this.total += e;
    }
    
    public int devolverCalorias(){
        return this.total;
    }
}
