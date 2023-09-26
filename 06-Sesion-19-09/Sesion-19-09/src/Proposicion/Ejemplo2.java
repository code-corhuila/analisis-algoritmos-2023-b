/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proposicion;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ejemplo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Crear un objeto DecimalFormat para redondear a dos decimales
        DecimalFormat formato = new DecimalFormat("#.##");
        
        Double x, y;
        String z, j; 
        Boolean bandera = true;
        String respuesta= "";
        
        System.out.print("Digite el valor total: ");
        x = scanner.nextDouble();
        System.out.print("Digite la fracción para y: ");
        y = scanner.nextDouble();
        z=formato.format((y*100)/x);
        j=formato.format((y/x)*100);
        
        System.out.println(z);
        System.out.println(j);
        
        //bandera = z.equals(j)? true:false;
        if(z.equals(j)){
            bandera=true;
        }else{
            bandera = false;
        }
        respuesta= bandera==true? "Si cumple": "No cumple";
        /*
        if(bandera==true){
            respuesta="Cumple";
        }else{
            respuesta="no cumple";
        }
        */
        System.out.println(respuesta);
    }

    
}
