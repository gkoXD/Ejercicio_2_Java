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
public class ejercicio_extra_9 {
    public static void main(String[] args) {
        int cont=0,num1,num2,aux=0;
        boolean salida = false;
        Scanner leer = new Scanner(System.in);

        do{
            System.out.println("Ingrese dos valores positivos");
            num1 = leer.nextShort();
            num2 = leer.nextShort();

            if (num1>0 && num2>0){
                salida=true;
            }else{
                System.out.println("Error, numero ingresado es Incorrecto");
            }
        }while (!salida);

        salida = false;
        do{
            if (cont==0){
                if(num1<num2){
                    salida=true;
                }else{
                    aux=(num1-num2);
                    cont++;
                    System.out.println(num1+" - "+num2+" = "+aux);
                }                    
            }else if(aux<num2){
                salida=true;
            }else{
                aux=(aux-num2);
                cont++;
                System.out.println(num1+" - "+num2+" = "+aux);
            }

        }while(!salida);
        
        System.out.println("dado que "+aux+" es menor que "+num2+", entonces: el residuo es "+aux+" y el cociente es "+cont);
    }
}
