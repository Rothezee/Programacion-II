/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico2;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Kiosco {
    
    /*---- Atributos ----*/
    private List<Compra> compras = new ArrayList<>();
    private List<Producto> productos = new ArrayList<>();
    private List<Cliente2> clientes = new ArrayList<>();
    
    
    public Kiosco() {
        cargarDatosPredeterminados();
    }

    private void cargarDatosPredeterminados() {
        // --- 10 Productos ---
        productos.add(new Producto(101, "Alfajor Fantoche", 800.0f));
        productos.add(new Producto(102, "Caramelos Palitos", 100.0f));
        productos.add(new Producto(103, "Gaseosa 500ml", 1200.0f));
        productos.add(new Producto(104, "Chupetín Pico Dulce", 250.0f));
        productos.add(new Producto(105, "Chocolate Milka", 2100.0f));
        productos.add(new Producto(106, "Chicles Beldent", 600.0f));
        productos.add(new Producto(107, "Agua Mineral", 950.0f));
        productos.add(new Producto(108, "Galletitas Oreo", 1500.0f));
        productos.add(new Producto(109, "Turrón Arcor", 300.0f));
        productos.add(new Producto(110, "Papitas Lay's", 1800.0f));

        // --- 10 Clientes ---
        clientes.add(new Cliente2(45001001, "Alan Rodriguez"));
        clientes.add(new Cliente2(45001002, "Majo Suarez"));
        clientes.add(new Cliente2(45001003, "Juan Perez"));
        clientes.add(new Cliente2(45001004, "Lucia Fernandez"));
        clientes.add(new Cliente2(45001005, "Marcos Galperin"));
        clientes.add(new Cliente2(45001006, "Elena White"));
        clientes.add(new Cliente2(45001007, "Roberto Gomez"));
        clientes.add(new Cliente2(45001008, "Sofia Braun"));
        clientes.add(new Cliente2(45001009, "Mateo Diaz"));
        clientes.add(new Cliente2(45001010, "Valentina Paz"));
    }
    /*---- Metodos ----*/
    public void agregarCompra(Compra e){
        compras.add(e);
    }
    
    public void agregarProducto(Producto e){
        productos.add(e);
    }
    
    public void borrarProducto(int id){
        productos.removeIf(p -> p.getIDProducto() == id);
    }
    
    public void agregarCliente(Cliente2 e){
        clientes.add(e);
    }
    
    public List<Cliente2> getClientes() {
        return this.clientes;
    }
    
    public List<Producto> getProductos() {
        return this.productos;
    }
    
    public Cliente2 getClientes(int id){
        for (Cliente2 cliente : clientes) {
            if (cliente.getDNI() == id) {
                return cliente;
            }
        }
        return null;
    }

    public Producto getProducto(int id){
        for (Producto producto : productos) {
            if (producto.getIDProducto() == id) {
                return producto;
            }
        }
        return null;
    }

    public void borrarCliente(int id){
        clientes.removeIf(c -> c.getDNI() == id);
    }
}
