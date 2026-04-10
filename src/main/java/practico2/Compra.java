/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Compra {
    private int idCliente;
    private LocalDate fecha;
    
    // Key: ID del Producto, Value: Cantidad
    private Map<Integer, Integer> productos;

    public Compra(int idCliente, LocalDate fecha) {
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.productos = new HashMap<>();
    }

    // Método principal: Maneja la lógica de suma
    public void agregarProducto(int idProducto, int cantidad) {
        // getOrDefault es clave: si el producto ya estaba, suma a la cantidad vieja.
        // Si no estaba, arranca en 0 y suma la nueva cantidad.
        int cantidadActual = productos.getOrDefault(idProducto, 0);
        productos.put(idProducto, cantidadActual + cantidad);
        
        System.out.println("ID " + idProducto + ": ahora tenés " + (cantidadActual + cantidad) + " unidades.");
    }

    // Sobrecarga: El valor por defecto llama al método de arriba
    public void agregarProducto(int idProducto) {
        this.agregarProducto(idProducto, 1);
    }
    
    public void mostrarCompra(){
        System.out.println("cliente   " + this.idCliente + "\n productos    " + this.productos);
    }
}
