/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proposicion;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ejemplo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double x, y, z, j; 
        Boolean bandera = false;
        String respuesta= "";
        
        System.out.print("Digite el valor para x: ");
        x = scanner.nextDouble();
        
        System.out.print("Digite el valor para y: ");
        y = scanner.nextDouble();
        
        if((y*2)==x){
            bandera=true;
        }
        
        //respuesta = bandera==false? "No cumple":"Se cumple";
        z = (x*y)/(x-(y*2));
        if(bandera==false){
            respuesta = "No cumple";
        }else{
            respuesta = "Se cumple";
        }
       
        //Salida 
        System.out.println(respuesta+", dado como resultado: "+z);
    }
}
