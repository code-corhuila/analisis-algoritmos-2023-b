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
public class Pares {

    public static void main(String[] args) {
        Integer numMax;
        Integer numMin;
        Integer i;
        Integer contador;
        Integer acumulador;
        
        //Capturar el número
        do {
            numMin = Capturar("Digite el número inferior: ");
            numMax = Capturar("Digite el número superior: ");
        } while (numMax <= numMin);

        contador=0;
        acumulador=0;
        for(i=numMin; i<=numMax; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
                contador++;
                acumulador+=i;                       
            }
        }
        
        System.out.println("Cantidad: "+contador);
        System.out.println("Acumulado: "+acumulador);
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
