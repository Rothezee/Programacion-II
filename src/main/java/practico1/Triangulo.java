package practico1;

public class Triangulo {
    private final double cateto1;
    private final double cateto2;

    public Triangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

    public void imprimirHipotenusa() {
        System.out.println("Hipotenusa: " + calcularHipotenusa());
    }
}
