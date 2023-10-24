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
public class ParesVector {

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
        for(i=numMin; i<=numMax; i++){
            if(i % 2 == 0){               
                contador++;                
            }
        }
        
        //Definir tamaño del vector
        Integer data[] = new Integer [contador]; 
        int index = 0;
        acumulador=0;
        for(i=numMin; i<=numMax; i++){
            if(i % 2 == 0){               
                data[index]=i;
                acumulador+=data[index];
                index++;
            }            
        }
        
        //mostar data 
        System.out.println("Cantidad: "+contador);
        System.out.println("Acumulador: "+acumulador);
        System.out.println("Lista de datos: ");
        for(index = 0; index<data.length;index++){
            System.out.print(data[index]+" ");
        }
        System.out.println(".");
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
