/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo;

import java.util.Scanner;
public class Ejemplo4 {
    public static void main(String[] args){
        //Mostar el valor final, luego de aplicar descuento
        Double compra=0.0;
        Double porDes=0.15;
        Double desc=0.0;
        Double valorNeto=0.0;
        
        Scanner x = new Scanner(System.in);
        
        while(compra<=0){
            System.out.print("Digite el valor de la compra: ");
            compra = x.nextDouble();
        }
        
        valorNeto = compra*(1-porDes);
        
        System.out.print("Valor neto de la compra: "+valorNeto);
        
    }
}
