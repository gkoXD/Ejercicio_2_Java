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
public class ejercicio_extra_6 {
    public static void main(String[] args) {
        String res;
        int cont=0,n;
        float altura,sumaT=0, sumaAltura = 0;
        boolean salir = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas que van a medirce");
        n=leer.nextInt();
        
        for (int i=0;i<n;i++){
            System.out.println("Ingrese la altura de la persona");
            altura = leer.nextFloat();
            sumaT=sumaT+altura;
            if (altura < 1.6){
                cont++;
                sumaAltura = sumaAltura + altura;
            }
            
        }
                
        
        System.out.println("Informe ---");
        System.out.println("su promedio en general es de "+(sumaT/n));
        System.out.println("la cantidad de personas que miden menos 1.60mts es de "+cont);
        System.out.println("su promedio es de "+(sumaAltura/cont));
    }
}
