/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2_estructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author xrod2
 */
public class ejercicio_8 {
    public static void main(String[] args) {
        int lado;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un Numero (positivo)");
        lado = leer.nextInt();
        
        for (int i=0;i<lado;i++){
            System.out.print("*");
        }
        System.out.println("");
        for (int i=0;i<lado-2;i++){
            System.out.print("*");
            for (int j=0;j<lado-2;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i=0;i<lado;i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
