/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class SumaVector {

    public static void main(String[] args) {
        Integer tamanio;
        Integer i;
        String dataA = "", dataB = "", dataC = "";

        //Define el tamaño de los vectores
        tamanio = Capturar("Digite el tamaño de los vectores");

        //Definir tamaño del vector
        Integer A[] = new Integer[tamanio];
        Integer B[] = new Integer[tamanio];
        Integer C[] = new Integer[tamanio];

        //Llenar datos de A
        for (i = 0; i < A.length; i++) {
            A[i] = Capturar("Digite el valor para la posición  A[" + (i + 1) + "]");
        }
        //Llenar datos de B
        for (i = 0; i < B.length; i++) {
            B[i] = Capturar("Digite el valor para la posición  B[" + (i + 1) + "]");
        }

        //Llenar datos de C
        for (i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }

        //Mostrar datos A
        dataA += "A:[";
        for (i = 0; i < A.length; i++) {
            dataA += A[i] + ",";
        }
        dataA = dataA.substring(0, dataA.length() - 1);
        dataA += "]";

        //Mostrar datos B
        dataB += "B:[";
        for (i = 0; i < B.length; i++) {
            dataB+=B[i] + ",";
        }
        dataB = dataB.substring(0, dataB.length() - 1);
        dataB+="]";

        //Mostrar datos C
        dataC+="C:[";
        for (i = 0; i < C.length; i++) {
            dataC+=C[i] + ",";
        }
        dataC = dataC.substring(0, dataC.length() - 1);
        dataC+="]";
        
        //Imprimir resultado
        System.out.println(dataA);
        System.out.println(dataB);
        System.out.println(dataC);
    }

    public static Integer Capturar(String mensaje) {
        Integer numero = 0;

        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Dato no permitido.");
            }
        } while (numero <= 0);

        return numero;
    }
}
