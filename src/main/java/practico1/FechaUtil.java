package practico1;

public class FechaUtil {
    private FechaUtil() {
    }

    public static boolean esBisiesto(int anio) {
        if (anio % 400 == 0) {
            return true;
        }
        if (anio % 100 == 0) {
            return false;
        }
        return anio % 4 == 0;
    }

    public static int diasDelMes(int mes, int anio) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return esBisiesto(anio) ? 29 : 28;
            default:
                return -1;
        }
    }
}
