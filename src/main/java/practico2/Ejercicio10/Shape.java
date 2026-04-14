/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2.Ejercicio10;

/**
 *
 * @author Usuario
 */
public abstract class Shape {
    private String Name;
    
    public Shape(String n){
        this.Name = n;
    }
    
    public abstract String getName();
    public abstract void print();
    public int getArea(int a, int b){
        return a * b;
    }
    
    public int getVolume(){
        return 0;
    }

}
