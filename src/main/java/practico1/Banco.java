package practico1;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final String nombre;
    private final Cliente[] clientesArray;
    private int cantidadClientesArray;
    private final List<Cliente> clientesColeccion;

    public Banco(String nombre, int capacidadArray) {
        this.nombre = nombre;
        this.clientesArray = new Cliente[capacidadArray];
        this.cantidadClientesArray = 0;
        this.clientesColeccion = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean agregarClienteArray(Cliente cliente) {
        if (cantidadClientesArray >= clientesArray.length) {
            return false;
        }
        clientesArray[cantidadClientesArray++] = cliente;
        return true;
    }

    public int getNumeroClientesArray() {
        return cantidadClientesArray;
    }

    public void agregarClienteColeccion(Cliente cliente) {
        clientesColeccion.add(cliente);
    }

    public int getNumeroClientesColeccion() {
        return clientesColeccion.size();
    }
}
