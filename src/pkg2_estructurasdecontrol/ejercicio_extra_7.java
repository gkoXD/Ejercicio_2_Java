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
public class ejercicio_extra_7 {
    public static void main(String[] args) {
        int n,i=0,cont=0,suma=0;
        short num, max=0, min=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numero a calcular");
        n=leer.nextInt();
        
        while (i<n){
            System.out.println("Ingrese un numero");
            num = leer.nextShort();
            
            if(i==0){
                max=num;
                min=num;
                i++;
            }else{
                i++;

                if(max<num){
                    max=num;
                }
                if(min>num){
                    min=num;
                }
                
            }
            if (num>0){
                suma=suma+num;
                cont++;
            }
        }
        
        System.out.println("El valor Maximo es "+max);
        System.out.println("El valor Minimo es "+min);
        System.out.println("El promedio de todos los valores positivos es "+(suma/cont));
    }
}
