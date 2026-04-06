/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

/**
 *
 * @author Usuario
 */
public class Compra {
    
    private static final int MAXIMO_DE_LINEAS = 50;
    
    private Cliente ClienteDeLaCompra;
    private String Fecha;
    private int[] ArregloIDProducto;
    private int[] ArregloCantidad;
    private int CantidadDeLineas;
    
    public Compra(Cliente ClienteDeLaCompra, String Fecha) {
        this.ClienteDeLaCompra = ClienteDeLaCompra;
        this.Fecha = Fecha;
        this.ArregloIDProducto = new int[MAXIMO_DE_LINEAS];
        this.ArregloCantidad = new int[MAXIMO_DE_LINEAS];
        this.CantidadDeLineas = 0;
    }
    
    public void agregarProducto(int IDProducto, int cantidad) {
        if (this.CantidadDeLineas >= MAXIMO_DE_LINEAS) {
            return;
        }
        if (cantidad <= 0) {
            return;
        }
        this.ArregloIDProducto[this.CantidadDeLineas] = IDProducto;
        this.ArregloCantidad[this.CantidadDeLineas] = cantidad;
        this.CantidadDeLineas = this.CantidadDeLineas + 1;
    }
    
    /**
     * Misma operacion que la otra, con cantidad por defecto = 1.
     */
    public void agregarProducto(int IDProducto) {
        this.agregarProducto(IDProducto, 1);
    }
    
    public Cliente getClienteDeLaCompra() {
        return this.ClienteDeLaCompra;
    }
    
    public String getFecha() {
        return this.Fecha;
    }
    
    public int getCantidadDeLineas() {
        return this.CantidadDeLineas;
    }
    
    public int obtenerIDProductoEnLinea(int indice) {
        return this.ArregloIDProducto[indice];
    }
    
    public int obtenerCantidadEnLinea(int indice) {
        return this.ArregloCantidad[indice];
    }
    
    /*==============Generadodes de atributos===============*/
    
    public void setClienteDeLaCompra(Cliente ClienteDeLaCompra) {
        this.ClienteDeLaCompra = ClienteDeLaCompra;
    }
    
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
}
