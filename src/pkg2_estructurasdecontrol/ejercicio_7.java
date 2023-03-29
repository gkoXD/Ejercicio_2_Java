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
public class ejercicio_7 {
    public static void main(String[] args) {
        String cadena, FDE="&&&&&";
        boolean salida = false;
        int contC=0,contI=0;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese la cadena");
            cadena = leer.next();

            if(cadena.equals(FDE)){
                salida = true;
                System.out.println("Sliendo del programa");
            }else{
                System.out.println(cadena.substring(4, 5));
                if ((cadena.length() == 5) && (cadena.substring(0, 1).equals("X")) && (cadena.substring(4, 5).equals("O"))){
                    contC++;
                }else{
                    contI++;
                }
            }
        }while (!salida);
        System.out.println("----------------");
        System.out.println("Informe");
        System.out.println("Cadenas Correctas "+contC);
        System.out.println("Cadenas Incorrectas "+contI);
    }
}
