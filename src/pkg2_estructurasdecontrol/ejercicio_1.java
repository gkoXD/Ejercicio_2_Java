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
public class ejercicio_1 {
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un Numero");
        num = leer.nextInt();
        if (num%2 == 1){
            System.out.println("El numero es Impar, el numero es: "+num);
        }else{
            System.out.println("El numero es Par, el numero es: "+num);
        }
    }
}
