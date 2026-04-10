/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

/**
 *
 * @author Usuario
 */
public class Producto {
    
    private int IDProducto;
    private String Nombre;
    private double Precio;
    
    
    public Producto(int IDProducto, String Nombre, double Precio) {
        this.IDProducto = IDProducto;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }
    
    public int getIDProducto() {
        return this.IDProducto;
    }
    
    public String getNombre() {
        return this.Nombre;
    }
    
    public double getPrecio() {
        return this.Precio;
    }
    
    /*==============Generadodes de atributos===============*/
    
    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void mostrarProducto() {
        System.out.println("ID: " + this.IDProducto + " Nombre: " + this.Nombre + " Precio: " + this.Precio);
    }
    public int getId() {
        return this.IDProducto;
    }
}
