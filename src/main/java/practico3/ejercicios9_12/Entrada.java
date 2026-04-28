/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico3.ejercicios9_12;

/**
 *
 * @author Usuario
 */
public class Entrada extends Alimento {
    /*private int Ensalada = 100;
    private int Fiambre = 500;
    private int Empanada = 50;
    private int Copetin = 700;*/
    private int total;
    
    public Entrada(){
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
