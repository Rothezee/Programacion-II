/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

/**
 *
 * @author Usuario
 */
public class Hamster extends Roedor {

    public Hamster() {
        super("Hamster");
    }

    @Override
    public void correr() {
        System.out.println("El hamster corre en la rueda de su jaula.");
    }

    @Override
    public void comer() {
        System.out.println("El hamster guarda comida en sus cachetes.");
    }

    @Override
    public void dormir() {
        System.out.println("El hamster duerme de día en su madriguera artificial.");
    }
}
