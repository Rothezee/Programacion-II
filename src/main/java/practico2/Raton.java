/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

/**
 *
 * @author Usuario
 */
public class Raton extends Roedor {

    public Raton() {
        super("Ratón");
    }

    @Override
    public void correr() {
        System.out.println("El ratón se desliza sigilosamente entre grietas.");
    }

    @Override
    public void comer() {
        System.out.println("El ratón roe queso y restos de comida.");
    }

    @Override
    public void dormir() {
        System.out.println("El ratón duerme en un nido escondido.");
    }
}
