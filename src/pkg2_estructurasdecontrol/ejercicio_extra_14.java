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
public class ejercicio_extra_14 {
    public static void main(String[] args) {
        int n,m, edad,suma=0,cont=0;
        boolean salir=false;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Familias");
        n=leer.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.println("Cuantos hijos tienen?");
            m=leer.nextInt();
            for(int j=0;j<m;j++){
                System.out.println("Hijo numero "+(j+1)+" que edad tienes?");
                edad=leer.nextInt();
                suma=suma+edad;
                cont++;
            }
            if(i<n){
                System.out.println("Siguiente familia");                
            }
        }
        
        System.out.println("--------");
        System.out.println("Informe");
        System.out.println("la cantidad de hijos en total es de "+cont);
        System.out.println("la edad promedio es de "+(suma/cont)+" años");
    
    }
}
