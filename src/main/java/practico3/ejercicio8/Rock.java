/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico3.ejercicio8;

/**
 *
 * @author usuario
 */
public class Rock extends Ecualizacion{
    public Rock(){
        super();
    }
    
    @Override
    public void devolverSonido() {        
        System.out.println("Agudos: " + super.getAgudos());
        System.out.println("Graves: " + super.getGraves());
    }
    
}
