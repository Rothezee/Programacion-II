package practico1;

public class Cheque {
    private final String numeroDeCheque;

    public Cheque(String numero) {
        this.numeroDeCheque = numero;
    }

    public boolean esFalso() {
        boolean tresCeros = numeroDeCheque.matches(".*[0]{3}.*");
        boolean cuatroNoCeros = numeroDeCheque.matches(".*[1-9]{4,}.*");
        return tresCeros || cuatroNoCeros;
    }
}
