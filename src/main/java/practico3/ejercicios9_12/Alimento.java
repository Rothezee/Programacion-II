/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico3.ejercicios9_12;

/**
 *
 * @author Usuario
 */
public abstract class Alimento {
    private int calorias;
    private int pedido;
    
    public abstract int devolverCalorias();
    
    public boolean tienePedido(){
        return this.pedido > 0;
    }
}
