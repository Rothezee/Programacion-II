package practico1;

public class SerieUtil {
    private SerieUtil() {
    }

    public static void fibonacciWhile(int cantidad) {
        int a = 1;
        int b = 1;
        int i = 0;
        while (i < cantidad) {
            System.out.print(a + (i < cantidad - 1 ? ", " : "\n"));
            int siguiente = a + b;
            a = b;
            b = siguiente;
            i++;
        }
    }

    public static void fibonacciDoWhile(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        int a = 1;
        int b = 1;
        int i = 0;
        do {
            System.out.print(a + (i < cantidad - 1 ? ", " : "\n"));
            int siguiente = a + b;
            a = b;
            b = siguiente;
            i++;
        } while (i < cantidad);
    }

    public static void fibonacciFor(int cantidad) {
        int a = 1;
        int b = 1;
        for (int i = 0; i < cantidad; i++) {
            System.out.print(a + (i < cantidad - 1 ? ", " : "\n"));
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }

    public static void fooBarBaz() {
        for (int i = 1; i <= 50; i++) {
            StringBuilder texto = new StringBuilder();
            texto.append(i);

            if (i % 3 == 0) {
                texto.append(" foo");
            }
            if (i % 5 == 0) {
                texto.append(" bar");
            }
            if (i % 7 == 0) {
                texto.append(" baz");
            }

            System.out.println(texto);
        }
    }
}
