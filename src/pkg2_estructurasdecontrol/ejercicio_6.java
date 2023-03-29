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
public class ejercicio_6 {
    public static void main(String[] args) {
        float aux1, aux2;
        int num1, num2, op;
        String res;
        boolean salida = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 Numero (positivo)");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        do{
            System.out.println("--------------------");
            System.out.println("MENU");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción: ");
            op = leer.nextInt();

            switch (op){
                case 1:
                    System.out.println("la Suma es: "+(num1+num2));
                    break;
                case 2:
                    System.out.println("la Resta es: "+(num1-num2));
                    break;
                case 3:
                    System.out.println("la Multiplicacion es: "+(num1*num2));
                    break;
                case 4:
                    if (num2 == 0){
                        System.out.println("no se puede dividir si el segundo numero es cero");
                    }else{
                        aux1=num1;
                        aux2=num2;
                        System.out.println("la Divicion es: "+ (aux1/aux2));
                    }
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa (S/N)?");
                    res = leer.next();
                    if (res.substring(0,1).equals("S") || res.substring(0, 1).equals("s")){
                        salida = true;
                    }
                    break;
            }
        }while (salida == false);        
    }
}
