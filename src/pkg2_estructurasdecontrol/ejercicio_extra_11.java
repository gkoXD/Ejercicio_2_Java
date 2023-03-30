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
public class ejercicio_extra_11 {
    public static void main(String[] args) {
        int num,aux,cont=0;
        //float aux;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor nuemrico");
        num=leer.nextInt();
        aux=num;
        do{
            //System.out.println(aux);
            if (aux>0){
                aux = aux/10;
                aux = Math.round(aux);
                cont++;
            }
        }while(aux>0);
        System.out.println("la cantidad de digitos es: "+cont);
    }
}
