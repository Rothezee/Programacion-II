/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona {
    private int numLegajo;
    private List<String> materiaAp;
    private List<String> materiaDesAp = new ArrayList<>();
    
    public void setNumLegajo(int e){
        this.numLegajo = e;
    }
    
    public void agregarMateria(String e){
        materiaAp.add(e);
    }
    
    public void eliminarMateria(String e){
        materiaAp.removeIf(m -> m.equalsIgnoreCase(e));
    }

}
