package practico1;

public class Conjunto {
    private final Object[] elementos;

    public Conjunto(Object[] elementos) {
        this.elementos = elementos;
    }

    public Conjunto interseccion(Conjunto otro) {
        Object[] temporal = new Object[this.elementos.length];
        int count = 0;

        for (Object e1 : this.elementos) {
            for (Object e2 : otro.elementos) {
                if (e1.equals(e2)) {
                    temporal[count++] = e1;
                    break;
                }
            }
        }

        Object[] resultado = new Object[count];
        System.arraycopy(temporal, 0, resultado, 0, count);
        return new Conjunto(resultado);
    }

    public void mostrar() {
        System.out.print("Interseccion: ");
        for (Object o : elementos) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}