package practico1;

public class Temperatura {
    private final double fahrenheit;

    public Temperatura(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double calcularCelsius() {
        return (fahrenheit - 32) * 5 / 9;
    }
}
