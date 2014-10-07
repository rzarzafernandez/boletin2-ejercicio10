/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author rzarzafernandez
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int euros;  
        int b100 = 0, b20 = 0, b5 = 0;  //tipos de billete
        
        System.out.print("Introduzca la cantidad en euros, sin céntimos: ");
        Scanner eurosIn = new Scanner(System.in);
        euros = eurosIn.nextInt();
        
        do{
            if((euros/100-1) >= 0){
                b100++;
                euros=euros-100;
            }
            if((euros/20) >= 0){
                b20++;
                euros=euros-20;
            }
            if((euros/5) >= 0){
                b5++;
                euros=euros-5;
            }
        }while(euros >= 5);
        
        System.out.println("Billetes de 100: "+ b100);
        System.out.println("Billetes de 20: "+ b20);
        System.out.println("Billetes de 5: "+ b5);
        System.out.println("Monedas de 1 euro: "+ euros);
        
    }
    
}
