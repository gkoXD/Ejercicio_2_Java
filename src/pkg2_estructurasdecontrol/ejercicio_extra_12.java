/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2_estructurasdecontrol;

import static java.lang.System.console;

/**
 *
 * @author xrod2
 */
public class ejercicio_extra_12 {
    public static void main(String[] args) {
        String impr, imp;
        impr = "X-X-X";
        int a=0,b=0,c=0;
        System.out.println(impr);
        
        imprimir(a,b,c);
    }
    
    public static void imprimir(int a,int b,int c){
        String imp;
        do{
            do{
                do{
                    imp =(a+"-"+b+"-"+c);
                    imp = imp.replace("3", "E");
                    System.out.println(imp);
                    c++;
                }while(c<10);
                c=0;
                b++;
            }while(b<10);
            b=0;
            a++;
        }while(a<10);
    }
}
