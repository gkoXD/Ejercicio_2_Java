/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2_estructurasdecontrol;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author xrod2
 */
public class ejercicio_extra_10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(10-1)+1;
        int num2 = rand.nextInt(10-1)+1;
        int resp;
        String sino;
        boolean salida=false;
        Scanner leer =new Scanner(System.in);
        
        do{
//            System.out.println("el resultado siempre fue "+num1*num2);
            System.out.println("Adivine el valor de la multiplicacion");
            resp = leer.nextInt();
            if (resp == (num1*num2)){
                salida=true;
                System.out.println("Felicidades encontraste el resultado");
            }else{
                System.out.println("Desa intentar adivinar el valor (S/N)");
                sino=leer.next();
                sino=sino.toLowerCase();
                if (sino.substring(0, 1).equals("n")){
                    salida=true;
                }
            }
        }while(!salida);
        System.out.println("-----------------------------");
        System.out.println("siempre fue "+num1*num2);
        System.out.println("gracias por jugar");
    }
}
