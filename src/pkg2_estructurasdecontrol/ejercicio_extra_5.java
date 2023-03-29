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
public class ejercicio_extra_5 {
    public static void main(String[] args) {
        String socio;
        float costo, descuento;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la letra q reprsenta al socio (A/B/C)");
        socio = leer.next();
        socio = socio.toLowerCase();
        System.out.println("Ingrese el costo por el tratamiento ");
        costo = leer.nextFloat();
        descuento = 0;
        
        if (socio.equals("a")){
            descuento = (costo*50/100);
        }else if(socio.equals("b")){
            descuento = (costo*35/100);
        }
        
        System.out.println("el importe a pegar es de $"+(costo-descuento));
        
        
    }
}
