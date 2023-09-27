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
public class Ejemplo2 {
    public static void main(String[] args) {
        int cantidad;
        double nota;
        double acumulador=0;
        double bono = 0;
        double promedio = 0;
        double notaNormal;
        double notaApreciativa;
        int i;
        
        Scanner captura = new Scanner(System.in);
        System.out.print("Digite la cantidad de notas a ingresar: ");
        cantidad = captura.nextInt();
        
        //Obtener la nota promedio y también mostrar la definitiva.
        for(i=1; i<=cantidad; i++){
            System.out.print("Digite la nota "+i+": ");
            nota = captura.nextDouble();
            acumulador=acumulador+nota;
            
            if(nota==5.0 && bono == 0.0){
                bono = 0.3;
            }
        }
        promedio = acumulador/cantidad;
        
        notaNormal = promedio;
        notaApreciativa = notaNormal+bono;
        
        //Salida 
        System.out.println("La nota normal es : "+notaNormal);
        System.out.println("La nota definitiva es: "+notaApreciativa);
    }
    
}
