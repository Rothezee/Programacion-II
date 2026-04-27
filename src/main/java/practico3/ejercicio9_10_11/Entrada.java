/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico3.ejercicio9_10_11;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class Entrada extends Alimento{
    private Map<String, Integer> elementos;
    
    public Entrada(){
        super();
        elementos = new HashMap();
        elementos.put("Pasta", 100);
        elementos.put("Fiambre", 500);
        elementos.put("Empanada", 50);
        elementos.put("Copetin", elementos.get("Pasta") + elementos.get("Fiambre") + (elementos.get("Empanada") * 2));
    }

    @Override
    public void devolverCalorias(String n) {
        System.out.println("Calorias: " + elementos.get(n));
    }

}
