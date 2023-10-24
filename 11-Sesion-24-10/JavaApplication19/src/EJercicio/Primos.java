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
public class Primos {

    public static void main(String[] args) {
        Integer cantidad;
        Integer numero;
        Integer i;

        //Capturar el número
        numero = Capturar("Digite el número a revisar si es primo: ");
        
        cantidad=0;
        for(i=1;i<=numero;i++){
            if(numero % i == 0){
                cantidad++;
            }
        }
        
        //Verificar si  es primo o no
        if(cantidad== 2){
            JOptionPane.showMessageDialog(null, numero+" es primo.");
        }else{
            JOptionPane.showMessageDialog(null, numero+" no es primo.");
        }

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
