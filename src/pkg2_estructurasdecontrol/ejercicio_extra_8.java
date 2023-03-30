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
public class ejercicio_extra_8 {
        public static void main(String[] args) {
            int i=0,cont=0,contP=0,contI=0;
            boolean salida = false;
            short num;
            Scanner leer = new Scanner(System.in);
            
            do{
                System.out.println("Ingrese un numero");
                num = leer.nextShort();
                
                if (num>0){
                    cont++;
                    if(num%2 == 0){
                        contP++;
                    }else{
                        contI++;
                    }
                }
                
                if (num%5 == 0){
                    salida=true;
                }
            }while(!salida);

            System.out.println("-----------------------------------------");
            System.out.println("la cantidad total de numero positivos es: "+cont);
            System.out.println("la camntidad de numeros Pares es: "+contP);
            System.out.println("la camntidad de numeros Impares es: "+contI);
        }
}
