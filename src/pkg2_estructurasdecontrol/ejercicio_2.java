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
public class ejercicio_2 {
    public static void main(String[] args) {
        String frase, eureka ="eureka";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        if (frase.equals(eureka)) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
