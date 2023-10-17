/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial;

/**
 *
 * @author ariel
 */
public class Punto1 {
    public static void main(String[] args) {
        Boolean P;
        Boolean Q;
        Boolean R;
        
        // Caso 1: P es verdadera y Q es verdadera.
        P = true;
        Q = true;
        R = P || Q;
        System.out.println("Caso 1 dónde P = "+P+" y Q = "+Q+", será R = "+R);
        
        // Caso 2: P es verdadera y Q es falsa.
        P = true;
        Q = false;
        R = P || Q;
        System.out.println("Caso 2 dónde P = "+P+" y Q = "+Q+", será R = "+R);
        
        // Caso 3: P es falsa y Q es verdadera.
        P = false;
        Q = true;
        R = P || Q;
        System.out.println("Caso 3 dónde P = "+P+" y Q = "+Q+", será R = "+R);        
        
        // Caso 4: P es falsa y Q es falsa.
        P = false;
        Q = false;
        R = P || Q;
        System.out.println("Caso 4 dónde P = "+P+" y Q = "+Q+", será R = "+R);
    }
}
