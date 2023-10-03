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
public class Ejemplo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double n1 = 0.0;
        Double n2 = 0.0;
        Double n3 = 0.0;
        Double nMen = 0.0;
        Double nMed = 0.0;
        Double nMay = 0.0;

        //Capturar los datos
        System.out.print("Digite el valor para n1: ");
        n1 = scanner.nextDouble();
        System.out.print("Digite el valor para n2: ");
        n2 = scanner.nextDouble();
        System.out.print("Digite el valor para n3: ");
        n3 = scanner.nextDouble();

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
}
