/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args){
        Integer cantidad = 0;
        Double valorUnitario = 0.0;
        Double valorPagar = 0.0;
        
        Scanner scanner = new Scanner(System.in);
        
        while(cantidad<=0){
            System.out.print("Digite la cantidad de llantas a comprar: ");
            cantidad = scanner.nextInt();
        }
        
        if(cantidad<5){
            valorUnitario = 800.0;
        }else{
            valorUnitario = 700.0;
        }
        
        //Calcular el valor a pagar.
        valorPagar = cantidad*valorUnitario;
        
        //Resultado
        System.out.print("El valor a pagar es: "+valorPagar);
    }
}
