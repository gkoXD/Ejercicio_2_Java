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
public class ejercicio_5 {
    public static void main(String[] args) {
        int num, aux = 0, limite, cont=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un Numero Limite (positivo)");
        limite = leer.nextInt();
        
        do{
            System.out.println("Ingrese un Numero");
            num = leer.nextInt();
            aux= aux+num;
            cont++;
        }while (aux<=limite);
        
        System.out.println("se repitio el bucle "+cont+" de veces");
    }
}
