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
public class Estudiante extends PersonA {
    private int numLegajo;
    private List<String> materiaAp = new ArrayList<>();
    private List<String> materiaDesAp = new ArrayList<>();
    
    public Estudiante(){
        super();
    }
    
    public void setNumLegajo(int e){
        this.numLegajo = e;
    }
    
    public void agregarMateria(String e){
        materiaAp.add(e);
    }
    
    public void eliminarMateriaAp(String e){
        materiaAp.removeIf(m -> m.equalsIgnoreCase(e));
    }
    
    public void eliminarMateriaDesAp(String e){
        materiaDesAp.removeIf(m -> m.equalsIgnoreCase(e));
    }
    
    public void mostrar(){
        super.mostrarPersona();
        System.out.println("Materias Aprobadas: " + this.materiaAp);
        System.out.println("Materias Desaprobadas: " + this.materiaDesAp);
    }
}
