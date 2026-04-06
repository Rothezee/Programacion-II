package interfaz;

import java.util.Scanner;
import practico1.Banco;
import practico1.Cheque;
import practico1.Cliente;
import practico1.Conjunto;
import practico1.Conversor;
import practico1.FechaUtil;
import practico1.PracticoTeoria;
import practico1.Persona;
import practico1.SerieUtil;
import practico1.Saluda;
import practico1.Temperatura;
import practico1.Triangulo;
import practico1.Validador;
import practico2.Persona2;
import practico2.CuentaCorriente;
import practico2.Producto;
import practico2.Compra;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU PRACTICO 1 ---");
            System.out.println("1. Explicar caracteristicas de Java");
            System.out.println("2. Hola Mundo (Main)");
            System.out.println("3. Hola Mundo (Clase Saluda)");
            System.out.println("4. Menu de ejercicios (este menu)");
            System.out.println("5. Comparar X e Y (Boolean)");
            System.out.println("6. Pulgadas a Metros");
            System.out.println("7. Validar Cheque");
            System.out.println("8. Interseccion de Conjuntos");
            System.out.println("9. Segundos vividos");
            System.out.println("10. Fahrenheit a Celsius");
            System.out.println("11. Hipotenusa de triangulo");
            System.out.println("12. Bisiesto y dias del mes");
            System.out.println("13. Fibonacci y FooBarBaz");
            System.out.println("14. Banco y Cliente");
            System.out.println("15. Respuesta ejercicio teorico");
            System.out.println("16. Persona2 (practico 2)");
            System.out.println("17. Cuenta corriente (practico 2)");
            System.out.println("18. Cliente, Producto y Compra (practico 2)");
            System.out.println("0. Salir");
            System.out.print("Seleccione ejercicio: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Orientado a objetos: usa clases y objetos para modelar problemas.");
                    System.out.println("Multithreaded: puede ejecutar varios hilos en paralelo.");
                    System.out.println("Independiente de plataforma: compila a bytecode y corre en la JVM.");
                    break;
                case 2:
                    System.out.println("Hola Mundo");
                    break;
                case 3:
                    Saluda s = new Saluda();
                    s.escribirHola();
                    break;
                case 4:
                    System.out.println("Este es el menu principal del practico.");
                    break;
                case 5:
                    System.out.print("Ingrese X: ");
                    int x = leer.nextInt();
                    System.out.print("Ingrese Y: ");
                    int y = leer.nextInt();
                    Validador v = new Validador();
                    System.out.println("Resultado: " + v.esMayorPorDos(x, y));
                    break;
                case 6:
                    System.out.print("Pulgadas: ");
                    double pulg = leer.nextDouble();
                    Conversor c = new Conversor();
                    System.out.println("Metros: " + c.pulgadasAMetros(pulg));
                    break;
                case 7:
                    System.out.print("Numero de cheque (10 digitos): ");
                    String num = leer.next();
                    Cheque ch = new Cheque(num);
                    System.out.println("Es falso? " + ch.esFalso());
                    break;
                case 8:
                    Object[] a1 = {1, 2, 3, "Hola"};
                    Object[] a2 = {2, 4, "Hola", 6};
                    Conjunto c1 = new Conjunto(a1);
                    Conjunto c2 = new Conjunto(a2);
                    Conjunto interseccion = c1.interseccion(c2);
                    interseccion.mostrar();
                    break;
                case 9:
                    System.out.print("Edad: ");
                    int edad = leer.nextInt();
                    Persona p = new Persona(edad);
                    p.mostrarSegundosVividos();
                    break;
                case 10:
                    System.out.print("Ingrese temperatura en Fahrenheit: ");
                    double fahrenheit = leer.nextDouble();
                    Temperatura t = new Temperatura(fahrenheit);
                    System.out.println("Celsius: " + t.calcularCelsius());
                    break;
                case 11:
                    System.out.print("Cateto 1: ");
                    double cateto1 = leer.nextDouble();
                    System.out.print("Cateto 2: ");
                    double cateto2 = leer.nextDouble();
                    Triangulo tri = new Triangulo(cateto1, cateto2);
                    tri.imprimirHipotenusa();
                    break;
                case 12:
                    System.out.print("Ingrese anio: ");
                    int anio = leer.nextInt();
                    System.out.println("Es bisiesto? " + FechaUtil.esBisiesto(anio));
                    System.out.print("Ingrese numero de mes (1-12): ");
                    int mes = leer.nextInt();
                    System.out.println("Dias del mes: " + FechaUtil.diasDelMes(mes, anio));
                    break;
                case 13:
                    System.out.println("Fibonacci con while:");
                    SerieUtil.fibonacciWhile(20);
                    System.out.println("Fibonacci con do while:");
                    SerieUtil.fibonacciDoWhile(20);
                    System.out.println("Fibonacci con for:");
                    SerieUtil.fibonacciFor(20);
                    System.out.println("FooBarBaz (1..50):");
                    SerieUtil.fooBarBaz();
                    break;
                case 14:
                    Banco banco = new Banco("Banco TUW", 5);
                    banco.agregarClienteArray(new Cliente("Ana", 123));
                    banco.agregarClienteArray(new Cliente("Luis", 456));
                    System.out.println("Clientes en array: " + banco.getNumeroClientesArray());

                    banco.agregarClienteColeccion(new Cliente("Pedro", 789));
                    banco.agregarClienteColeccion(new Cliente("Sofia", 321));
                    System.out.println("Clientes en coleccion: " + banco.getNumeroClientesColeccion());
                    break;
                case 15:
                    PracticoTeoria.mostrarResultadoEjercicio15();
                    break;
                case 16:
                    Persona2 p1 = new Persona2("santiago", 16, "tomas jofre 1233", 4);
                    Persona2 p2 = new Persona2();
                    p2.setNombre("Matias"); p2.setEdad(17); p2.setDomicilio("asñdlkfj"); p2.setECivil(1);
                    System.out.println("Nombre" + p1.getNombre());
                    System.out.println("Nombre" + p1.getEdad());
                    System.out.println("Nombre" + p1.getDomicilio());
                    System.out.println("Nombre" + p1.getEcivil());
                    
                    break;
                
                case 17:
                    CuentaCorriente Cuenta1 = new CuentaCorriente();
                    Cuenta1.setNumerodeCuenta(12341234); Cuenta1.setNombreCliente("pedrito"); Cuenta1.setDineroDepositadoCliente(100000); Cuenta1.setDineroDeudaCliente(120000);
                    
                    System.out.println("Su saldo es:" + Cuenta1.calcularSaldo());
                    break;
                case 18:
                    Producto prodEj1 = new Producto(1, "Arroz 1kg", 120.0);
                    Producto prodEj2 = new Producto(2, "Aceite 900cc", 450.0);
                    System.out.println("Catalogo de ejemplo: ID " + prodEj1.getIDProducto()
                            + " " + prodEj1.getNombre() + " $" + prodEj1.getPrecio()
                            + " | ID " + prodEj2.getIDProducto()
                            + " " + prodEj2.getNombre() + " $" + prodEj2.getPrecio());
                    System.out.print("DNI del cliente: ");
                    int dniCli = leer.nextInt();
                    leer.nextLine();
                    System.out.print("Nombre del cliente: ");
                    String nombreCli = leer.nextLine();
                    practico2.Cliente cliCompra = new practico2.Cliente(dniCli, nombreCli);
                    System.out.print("Fecha de la compra (ej: 06/04/2026): ");
                    String fechaCompra = leer.nextLine();
                    Compra unaCompra = new Compra(cliCompra, fechaCompra);
                    int idProd;
                    do {
                        System.out.print("ID producto a agregar (-1 para listar y terminar): ");
                        idProd = leer.nextInt();
                        if (idProd == -1) {
                            break;
                        }
                        System.out.print("Cantidad (0 = una unidad por defecto): ");
                        int cantProd = leer.nextInt();
                        if (cantProd == 0) {
                            unaCompra.agregarProducto(idProd);
                        } else {
                            unaCompra.agregarProducto(idProd, cantProd);
                        }
                    } while (true);
                    System.out.println("--- Resumen compra ---");
                    System.out.println("Cliente: " + unaCompra.getClienteDeLaCompra().getNombre()
                            + " DNI: " + unaCompra.getClienteDeLaCompra().getDNI());
                    System.out.println("Fecha: " + unaCompra.getFecha());
                    for (int i = 0; i < unaCompra.getCantidadDeLineas(); i++) {
                        System.out.println("  Linea " + (i + 1) + ": ID producto "
                                + unaCompra.obtenerIDProductoEnLinea(i)
                                + " cantidad " + unaCompra.obtenerCantidadEnLinea(i));
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);

        leer.close();
    }
}
