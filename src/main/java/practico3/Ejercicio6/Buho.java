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
    
    public Buho(String n , int e){
        super(n, e, false);
    }
    
    @Override
    public void mostrar(){
        System.out.println("nombre:" + super.getNombre());
        System.out.println("edad:" + super.getEdad());
        System.out.println("Puede nadar?" + super.getNada());
    }
    
    public void devolverSonido(){
        System.out.println("ulular");
    }
}
