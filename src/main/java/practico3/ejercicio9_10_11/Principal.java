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
public class Principal extends Alimento{
    
    private Map<String, Integer> elementos;
    
    public Principal(){
        super();
        elementos = new HashMap();
        elementos.put("Pasta", 200);
        elementos.put("Carne", 200);
        elementos.put("Milanesa", 800);
        elementos.put("Pescado", 0);
    }

    @Override
    public void devolverCalorias(String n) {
        System.out.println("Calorias: " + elementos.get(n));
    }
    
}
