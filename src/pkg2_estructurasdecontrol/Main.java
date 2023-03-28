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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner (System.in);
        System.out.println("Clasifique la peli de 1 al 5 estrellas");
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <=5){
            
            switch (opinion){
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados que no hayas disfrutado de la pelicula");
                    break;
                case 3:
                    System.out.println("Calificaste la pelicula como buena");
                    break;
                case 4:
                    System.out.println("Calificaste la pelicula como muy buena");
                    break;
                case 5:
                    System.out.println("Fantastico");
                    break;
                
            }
        } else if (opinion < 0){
            System.out.println("Taaaan mala es, que bajon");
        } else if (opinion == 0){
            System.out.println("El valor "+opinion+" no es valido");
        } else {
            System.out.println(opinion+" Wow! Se te fue la mano con la calificacion xD");
        }
        
        System.out.println("Hasta la proxima");
    }
    
}
