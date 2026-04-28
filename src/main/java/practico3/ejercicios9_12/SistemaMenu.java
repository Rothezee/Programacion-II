/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico3.ejercicios9_12;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SistemaMenu implements Menu {

    
    
    @Override
    public void mostrarMenu() {
        Scanner leer = new Scanner(System.in);
        int op;
        do{
            Entrada dataEntrada = new Entrada();
            Principal dataPrincipal = new Principal();
            Postre dataPostre = new Postre();    
            System.out.println("MENU");
            System.out.println("1. Entrada  | 2. Plato Principal | 3. Postre");
            
            op = leer.nextInt();
            switch(op){
                
                case 1:
                    
                    
                    Scanner entrada = new Scanner(System.in);
                    int opEntrada;
                    int[] elementosEntrada = {  100, 
                                                50, 
                                                500, 
                                                700};
                    do{
                        System.out.println("Entrada");
                        System.out.println("1. Ensalada | 2. Empanada | 3. Fiambre | 4. Copetin");

                        opEntrada = entrada.nextInt();
                        dataEntrada.agregarElemento(elementosEntrada[opEntrada -1]);
                        System.out.println("Agregado");
                    }while(opEntrada != 0);
                    exceso(dataEntrada);
                    dataEntrada.devolverCalorias();
                    break;
                    
                    
                case 2: 
                    
                    Scanner principal = new Scanner(System.in);
                    int opPrincipal;
                    int[] elementosPrincipal = {    
                                                200,
                                                200,
                                                800,
                                                0
                                                };
                    do{
                        System.out.println("Principal");
                        System.out.println("1. Pasta | 2. Carne | 3. Milanesa con Pure | 4. Pescado");

                        opPrincipal = principal.nextInt();
                        dataPrincipal.agregarElemento(elementosPrincipal[opPrincipal -1]);
                        System.out.println("Agregado");
                    }while(opPrincipal == 1);
                    exceso(dataPrincipal);
                    dataPrincipal.devolverCalorias();
                case 3:
                    
                    Scanner postre = new Scanner(System.in);
                    int opPostre;
                    int[] elementosPostre = {   0,
                                                800,
                                                10,  
                                                };
                    
                    System.out.println("Postre");
                    System.out.println("1. Fruta | 2. Helado | 3. Gelatina");

                    opPostre = postre.nextInt();
                    dataPostre.agregarElemento(elementosPostre[opPostre -1]);
                    System.out.println("Agregado");
                    exceso(dataPostre);
                    dataPostre.devolverCalorias();
                    
                    break;
                    
                case 4:
                    Costo calculador = new Costo();
                    int precioFinal = 0;

                    // Lógica de combinación según lo que el usuario cargó
                    if (dataEntrada.tienePedido() && dataPrincipal.tienePedido() && dataPostre.tienePedido()) {
                        precioFinal = calculador.calcularCosto(dataEntrada, dataPrincipal, dataPostre);
                    } 
                    else if (dataEntrada.tienePedido() && dataPrincipal.tienePedido()) {
                        precioFinal = calculador.calcularCosto(dataEntrada, dataPrincipal);
                    } 
                    else if (dataPrincipal.tienePedido() && dataPostre.tienePedido()) {
                        precioFinal = calculador.calcularCosto(dataPostre, dataPrincipal);
                    } 
                    else if (dataPrincipal.tienePedido()) {
                        precioFinal = calculador.calcularCosto(dataPrincipal);
                    } 
                    else {
                        System.out.println("Debe seleccionar al menos un Plato Principal para calcular el costo.");
                    }

                    if (precioFinal > 0) {
                        System.out.println("💰 El costo total de su menú es: $" + precioFinal);
                    }
                    break; 
                case 0: 
                    break;
                default: 
                    System.out.println("Opcion invalida");
            }
        }while(op !=0);
        
    }

    @Override
    public void exceso(Alimento e) {
        if(e.devolverCalorias() >= 1000){
            System.out.println(" Exesoooooo");
        }
        else{return;}
    }
    
    
}
