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
public class Ganso extends Ave implements Sonido{

    public Ganso(String n, int e){
        super(n, e, true);
    }
    
    public void mostrar(){
        System.out.println("nombre:" + super.getNombre());
        System.out.println("edad:" + super.getEdad());
        System.out.println("Puede nadar?" + super.getNada());
    }
    
    public void devolverSonido(){
        System.out.println("graznar");
    }
}
