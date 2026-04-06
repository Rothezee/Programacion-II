package practico1;

public class Persona {
    private final int cantidadAnos;

    public Persona(int edad) {
        this.cantidadAnos = edad;
    }

    public void mostrarSegundosVividos() {
        long segundos = (long) cantidadAnos * 365 * 24 * 60 * 60;
        System.out.println("Viviste aprox: " + segundos + " segundos.");
    }
}
