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
    
    
    
    /*---- Metodos ----*/
    public void agregarCompra(Compra e){
        compras.add(e);
    }
    
    public void agregarProducto(Producto e){
        productos.add(e);
    }
    
    public void agregarCliente(Cliente2 e){
        clientes.add(e);
    }
    
    public List<Cliente2> getClientes() {
        return this.clientes;
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

    public void borrarCliente(Cliente2 e){
        clientes.remove(e);
    }
}
