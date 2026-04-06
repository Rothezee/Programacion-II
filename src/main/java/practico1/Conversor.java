package practico1;

public class Conversor {
    private static final double CM_POR_PULGADA = 2.54;

    public double pulgadasAMetros(double pulgadas) {
        return (pulgadas * CM_POR_PULGADA) / 100;
    }
}
