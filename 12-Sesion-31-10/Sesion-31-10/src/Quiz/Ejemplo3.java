/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author ariel
 */
public class Ejemplo3 {
    public static void main(String[] args) {
        //Capturar n cantidad de números reales/enteros. 
        //Guardarlos en un vector
        //Encontrar en número menor, mayor y el promedio de la sumatoria.
        
        int cantidad = 0;        
        cantidad =(int) Math.round(Capturar("Digite la cantidad de números que desa capturar: "));
        Double vector[] = new Double[cantidad];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Capturar("Digite el valor para el vector en posición V["+(i+1)+"]:");                    
        }
        
        double menor=99999, mayor=-999999, promedio=0,sumatoria=0;
        for (int i = 0; i < vector.length; i++) {
           if(menor > vector[i]){
               menor = vector[i];
           }
           if(mayor < vector[i]){
               mayor = vector[i];
           }
           sumatoria+=vector[i];
        }
        promedio = sumatoria / vector.length;
        System.out.println("Mayor: "+mayor);
        System.out.println("Menor: "+menor);
        System.out.println("Promedio: "+promedio);
       
    }
    
    public static Double Capturar(String mensaje){
        Scanner scanner = new Scanner(System.in);
        Double x = 0.0;
        Boolean bandera=true;
        do {            
            try {
                System.out.print(mensaje);
                x = Double.parseDouble(scanner.next());
                bandera = false;
            } catch (Exception e) {
                System.out.print("Dato no válido.");
            }
        } while (bandera=false);
        
        return x;
    }
}
