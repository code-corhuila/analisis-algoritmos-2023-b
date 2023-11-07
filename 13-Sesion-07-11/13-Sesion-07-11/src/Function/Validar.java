/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Validar {
    
    public Double Capturar(String mensaje, Boolean rango, double startNumber, double endNumber, Boolean fromNumber){
        Scanner scanner = new Scanner(System.in);
        Double x = 0.0;
        Boolean validar = false;
        do {
            //Rango es true, se debe enviar startNumber y endNumber
            if(rango == true){                
                x = capturarNumero(mensaje+ " entre "+startNumber+" y "+endNumber+": ");
                if(x >= startNumber && x <= endNumber){
                    validar = true;
                }else{
                    System.out.println("Recuerda ingresar datos entre "+startNumber +" y "+endNumber);
                }
            }
            
            //Si fromNumber es true, se captura a partir de startNumber
            if(fromNumber==true && rango == false && startNumber!=0){
                x = capturarNumero(mensaje+" a partir de  "+startNumber+": ");
                if(x >= startNumber){
                    validar = true;
                }else{
                    System.out.println("Recuerda ingresar datos a partir de "+startNumber);
                }
            }//Si fromNumber es false, se captura números inferiores a.
            else if(fromNumber==false && rango == false && startNumber!=0){ 
                x = capturarNumero(mensaje+" inferior o igual a "+startNumber+": ");
                if(x <= startNumber){
                    validar = true;
                }else{
                    System.out.println("Recuerda ingresar datos iguales o onferior a "+startNumber);
                }
            }
            
            //Capturar cualquier número
            if(rango == false && fromNumber == false && startNumber == 0.0 ){
                x = capturarNumero(mensaje);
                validar = true;
            }
        } while (validar == false);
        return x;
    }
    
    public Double capturarNumero(String mensaje){
    
        Scanner scanner = new Scanner(System.in);
        Double x = 0.0;
        Boolean validar = false;
        do {            
            try {
                System.out.print(mensaje);
                x = Double.parseDouble(scanner.next());
                validar = true;
            } catch (Exception e) {
                System.out.println("Dato no permitido, esta función es numérica.");
            }
        } while (validar==false);
        return x;
    }
}
