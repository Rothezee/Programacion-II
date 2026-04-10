/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

/**
 * Clase base: métodos comunes; las subclases pueden sobreescribirlos (polimorfismo).
 *
 * @author Usuario
 */
public class Roedor {

    private final String especie;

    public Roedor(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void correr() {
        System.out.println(especie + " corre sobre sus patas traseras.");
    }

    public void comer() {
        System.out.println(especie + " roe semillas y granos.");
    }

    public void dormir() {
        System.out.println(especie + " se acurruca para dormir.");
    }
}
