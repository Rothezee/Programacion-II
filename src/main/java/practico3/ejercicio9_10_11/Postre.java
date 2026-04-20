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
public class Postre extends Alimento{
        private Map<String, Integer> elementos;
    
    public Postre(){
        super();
        elementos = new HashMap();
        elementos.put("Fruta", 0);
        elementos.put("Helado", 800);
        elementos.put("Gelatina", 10);
    }
    

    @Override
    public void devolverCalorias(String n) {
        System.out.println("Calorias: " + elementos.get(n));
    }
}
