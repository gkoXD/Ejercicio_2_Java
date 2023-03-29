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
public class ejercicio_extra_1 {
    public static void main(String[] args) {
        int minutosIniciales, minutos, horas, dias;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los minutos a calcular");
        minutosIniciales = leer.nextInt();
        
        horas = minutosIniciales/60;
        minutos = minutosIniciales % 60;
        dias = minutos /24;
        horas = horas % 24;
        System.out.println(dias+" dias, "+horas+" horas y "+minutos+" minutos");
    }
}
