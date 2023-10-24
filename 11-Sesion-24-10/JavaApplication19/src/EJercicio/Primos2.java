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
public class Primos2 {

    public static void main(String[] args) {
        Integer cantidadDivi;
        Integer cantidadPrimo;
        Integer numMax;
        Integer numMin;
        Integer i;
        Integer j;

        //Capturar el número
        do {
            numMin = Capturar("Digite el número inferior: ");
            numMax = Capturar("Digite el número superior: ");
        } while (numMax <= numMin);

        
        cantidadPrimo = 0;
        for (j = numMin; j <= numMax; j++) {
            cantidadDivi = 0;
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    cantidadDivi++;
                }
            }
            //Verificar si  es primo o no
            if (cantidadDivi == 2) {
                cantidadPrimo++;
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad de primos entre "+numMin+" y "+numMax+" es "+cantidadPrimo);
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
