/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo;

import java.util.*;
public class Ejemplo3 {
    public static void main(String[] args){
        //Mostrar el total, descuento y valor neto
        Scanner scanner = new Scanner(System.in);
        Double valorCompra = 0.0;
        Double valorNeto = 0.0;
        Double porDes = 0.25;
        Double desc = 0.0;
        
        while(valorCompra<=0.0){
            System.out.print("Digite el valor de la compra: ");
            valorCompra = scanner.nextDouble();
        }
        
        desc = valorCompra * porDes;
        valorNeto = valorCompra - desc;
        
        System.out.println("Valor total: "+valorCompra);
        System.out.println("Valor descuento: "+desc);
        System.out.println("Valor neto: "+valorNeto);
    }
}
