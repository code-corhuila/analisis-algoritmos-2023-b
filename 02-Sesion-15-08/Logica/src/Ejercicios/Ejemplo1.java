/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); 
        Double n1;
        Double n2;
        Double n3;
        Double n4;
        Double n5;

        System.out.print("Digite la nota 1: ");
        n1 = x.nextDouble();
        
        if(n1==5.0){
            System.out.println("Recibe bonificación de 0.3");
        }else{
            System.out.print("Digite la nota 2: ");
            n2 = x.nextDouble();
            if(n2 == 5){
                System.out.println("Recibe bonificación de 0.3");
            }else{
                System.out.print("Digite la nota 3: ");
                n3 = x.nextDouble();
                if(n3 == 5){
                    System.out.println("Recibe bonificación de 0.3");
                }
            }
        }
        
        
        
    }
}
