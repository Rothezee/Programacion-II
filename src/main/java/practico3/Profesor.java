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
public class Profesor extends PersonA{
    private int id;
    private List<String> MateriasDict = new ArrayList<>();
    
    public Profesor(){
        super();
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int e){
        this.id = e;
    }
    
    public void agregarMateria(String e){
        this.MateriasDict.add(e);
    }
    
    public void eliminarMateria(String e){
        this.MateriasDict.removeIf(m -> m.equalsIgnoreCase(e));
    }
    
    public void eliminarPrimeraMateria(){
        this.MateriasDict.removeFirst();
    }
    
    public void eliminarUltimaMateria(){
        this.MateriasDict.removeLast();
    }
    
    public void mostrar(){
        super.mostrarPersona();
        System.out.println("Materias:" + this.MateriasDict);
    }
}
