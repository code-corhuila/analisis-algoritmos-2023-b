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
public class Ejemplo4 {

    public static void main(String[] args) {

        Double n1, n2, n3, intermedio=0.0;
        
        n1 = Capturar("Digite el valor para n1: ");
        n2 = Capturar("Digite el valor para n2: ");
        n3 = Capturar("Digite el valor para n3: ");
        
        if(n1.equals(n2) || n1.equals(n3) || n2.equals(n3)){
            System.out.println("No se permite repetir números. ");
            
        }else{
            if((n1>n2 && n1<n3) || (n1<n2 && n1>n3)){
                intermedio = n1;
            }
            if((n2>n1 && n2<n3) || (n2<n1 && n2>n3)){
                intermedio = n2;
            }
            if((n3>n1 && n3<n2) || (n3<n1 && n3>n2)){
                intermedio = n3;
            }
            System.out.println("Número intermedio: "+intermedio);
        }
        
    }

    public static Double Capturar(String mensaje) {
        Double dato = 0.0;
        Boolean validar = true;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.print(mensaje);
                dato = Double.parseDouble(scanner.next());
                validar = false;
            } catch (Exception e) {
                System.out.println("Repetir ingreso, dato no válido.");
                dato = 0.0;
            }
        } while (validar == true);
        return dato;
    }

}
