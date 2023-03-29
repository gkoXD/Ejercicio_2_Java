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
public class ejercicio_extra_2 {
    public static void main(String[] args) {
        int A,B,C,D, aux;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 valores (A/B/C/D");
        A = leer.nextInt();
        B = leer.nextInt();
        C = leer.nextInt();
        D = leer.nextInt();
        System.out.println("el valor de A: "+A);
        System.out.println("el valor de B: "+B);
        System.out.println("el valor de C: "+C);
        System.out.println("el valor de D: "+D);
        aux = B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("--------------------");
        System.out.println("el valor de A: "+A);
        System.out.println("el valor de B: "+B);
        System.out.println("el valor de C: "+C);
        System.out.println("el valor de D: "+D);        
    }
}
