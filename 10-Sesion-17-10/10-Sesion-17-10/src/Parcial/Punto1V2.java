/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial;

/**
 *
 * @author ariel
 */
public class Punto1V2 {
    public static void main(String[] args) {
         Boolean P;
        Boolean Q;
        Boolean R;
        String dataP =  " María estudia matemáticas ";
        String dataQ = " Juan estudia ciencias ";
        String dataPN =  " María no estudia matemáticas ";
        String dataQN = " Juan no estudia ciencias ";
        //Datos iniciales
        P = true;
        Q = true;
        
        // Caso 1: P es verdadera y Q es verdadera.
        R = P || Q;
        System.out.println("Caso 1 dónde P = "+P+" y Q = "+Q+", será R = "+R+", por lo tanto "+dataP+" y "+dataQ+".");
        
        //Caso 2: P es verdadera y Q es falsa.
        R = P || !Q;
        System.out.println("Caso 2 dónde P = "+P+" y Q = "+!Q+", será R = "+R+", por lo tanto "+dataP+" y "+dataQN+".");
        
        //Caso 3: P es falsa y Q es verdadera.
        R = !P || Q;
        System.out.println("Caso 3 dónde P = "+!P+" y Q = "+Q+", será R = "+R+", por lo tanto "+dataPN+" y "+dataQ+".");
        
        //Caso 4: P es falsa y Q es falsa.
        R = !P || !Q;
        System.out.println("Caso 4 dónde P = "+!P+" y Q = "+!Q+", será R = "+R+", por lo tanto "+dataPN+" y "+dataQN+".");
    }
}
