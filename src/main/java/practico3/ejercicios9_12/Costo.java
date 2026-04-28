/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico3.ejercicios9_12;

/**
 *
 * @author Usuario
 */
public class Costo {
    
    public int calcularCosto(Principal p){
        return 3000;
    }
    
    public int calcularCosto(Postre po, Principal p){
        return 5500;
    }
    
    public int calcularCosto(Entrada e, Principal p){
        return 5000;
    }
        
    public int calcularCosto(Entrada e, Principal p, Postre po){
        return 7500;
    }
}
