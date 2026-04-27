/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico3.ejercicio9_10_11;

import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class SistemaMenu {
    private Scanner leer = new Scanner(System.in);
    private int op;
    
    public SistemaMenu(){
        System.out.println("=====================");
        System.out.println("======= MENU ========");
        System.out.println("=====================");
        System.out.println("1. Entrada");
        System.out.println("2. Plato Principal");
        System.out.println("3. Postre \n\n");
        
        do{
            this.op = this.leer.nextInt();
            switch(this.op){
                case 1: 
                    System.out.println("Elija los elementos que desee(solo uno de cada)");
                    System.out.println("1. pasta");
                    System.out.println("2. Fiambre");
                    System.out.println("3. Empanadas");
                    System.out.println("4. Copetin");
                    
                    while(this.op != 0){
                        this.op = this.leer.nextInt();
                    }
                    
                    break;
            }
        }while(this.op != 0);
    }
    
    
}
