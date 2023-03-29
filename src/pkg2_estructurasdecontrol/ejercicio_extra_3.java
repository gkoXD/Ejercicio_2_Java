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
public class ejercicio_extra_3 {
    public static void main(String[] args) {
        String letra;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una letra");
        letra = leer.next();
        letra = letra.toLowerCase();
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("es una vocal");
        }else{
            System.out.println("no es una vocal");
        }
    }
}
