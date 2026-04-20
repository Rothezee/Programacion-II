/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico3.Ejercicio6;

/**
 *
 * @author Usuario
 */
public class Buho extends Ave{
    
    public Buho(){
        super(false);
    }
    
    public void mostrar(){
        System.out.println("nombre:" + super.getNombre());
        System.out.println("edad:" + super.getEdad());
        System.out.println("Puede nadar?" + super.getNada());
    }
}
