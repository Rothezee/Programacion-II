/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

/**
 *
 * @author Usuario
 */
public class Gerbil extends Roedor {

    public Gerbil() {
        super("Gerbil");
    }

    @Override
    public void correr() {
        System.out.println("El gerbil salta y excava túneles en la viruta.");
    }

    @Override
    public void comer() {
        System.out.println("El gerbil come semillas y verduras frescas.");
    }

    @Override
    public void dormir() {
        System.out.println("El gerbil se acurruca bajo la paja en grupo.");
    }
}
