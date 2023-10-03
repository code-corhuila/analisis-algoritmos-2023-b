/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double n1 = 0.0;
        Double n2 = 0.0;
        Double n3 = 0.0;
        Double nMen = 0.0;
        Double nMed = 0.0;
        Double nMay = 0.0;
        
        //Capturar los datos
        n1 = Capturar("Digite el valor para n1: ");
        n2 = Capturar("Digite el valor para n2: ");
        n3 = Capturar("Digite el valor para n3: ");
        
        //¿Cómo ordenarlos?        
        //Ordenar los datos.
        //Conocer el orden de los datos.
        //Dónde n1 es mayor
        if (n1.equals(n2) || n1.equals(n3) || n2.equals(n3)) {
            System.out.println("No se permite repetir números.");
        } else {
            //Caso n1
            if (n1 > n2 && n1 > n3) {
                nMay = n1;
            } else if (n1 < n2 && n1 < n3) {
                nMen = n1;
            } else {
                nMed = n1;
            }

            //Caso n2
            if (n2 > n1 && n2 > n3) {
                nMay = n2;
            } else if (n2 < n1 && n2 < n3) {
                nMen = n2;
            } else {
                nMed = n2;
            }

            //Caso n3
            if (n3 > n1 && n3 > n2) {
                nMay = n3;
            } else if (n3 < n1 && n3 < n2) {
                nMen = n3;
            } else {
                nMed = n3;
            }

            //Si n1 es par, entonces descendente.
            if (n1 % 2 == 0) {
                System.out.println("Número n1 es par, por lo tanto salida 'descendente':");
                System.out.println("Mayor: " + nMay);
                System.out.println("medio: " + nMed);
                System.out.println("Menor: " + nMen+"\n");
            }

            //Si n2 es impar, entonces ascendente.
            if (n2 % 2 != 0) {
                System.out.println("Número n2 es impar, por lo tanto salida 'ascendente':");
                System.out.println("Menor: " + nMen);
                System.out.println("medio: " + nMed);
                System.out.println("Mayor: " + nMay);
            }

            //Si se cumpliera las dos condiciones, entonces se mostraría los dos resutlados{
        }

    }
    
    public static Double Capturar(String mensaje){
        Scanner scanner = new Scanner(System.in);
        Double x = 0.0;
        Boolean bandera = true;
        do {            
            try {
                System.out.print(mensaje);
                x = Double.parseDouble(scanner.next());
                bandera = false;
            } catch (Exception e) {
                System.out.println("Dato no válido");
                x = 0.0;
            }
        } while (bandera == true);
        return x;
    }
}
