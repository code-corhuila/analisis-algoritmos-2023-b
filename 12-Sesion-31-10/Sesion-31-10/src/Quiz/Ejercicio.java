/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ejercicio {

    public static void main(String[] args) {
        Integer numeroInferior = 0;
        Integer numeroSuperior = 0;
        Integer cantidadPrimo = 0;
        Integer sumatoriaPrimo = 0;
        Integer promedioPrimo = 0;
        Integer i, j, cont;
              
        numeroInferior = CapturarApartir("Ingrese el dato por el cual desea iniciar el rango: ", 0);
        numeroSuperior = CapturarApartir("Ingrese el dato por el cual desea finalizar el rango, este debe ser mayor a " + numeroInferior + ": ", numeroInferior);

        for(i = numeroInferior; i<=numeroSuperior;i++){
            cont=0;
            for(j=1;j<=i;j++){
                if(i % j == 0){
                    cont++;
                }
            }
            if(cont == 2){
                cantidadPrimo++;
            }
        }
        
        Integer vectorPrimo[] = new Integer[cantidadPrimo];
        int indexVector=0;
        
        for(i = numeroInferior; i<=numeroSuperior;i++){
            cont=0;
            for(j=1;j<=i;j++){
                if(i % j == 0){
                    cont++;
                }
            }
            if(cont == 2){
                vectorPrimo[indexVector] = i;
                indexVector++;
            }
        }
        indexVector=0;
        for(indexVector=0;indexVector<vectorPrimo.length;indexVector++){
            System.out.print(vectorPrimo[indexVector]+" - ");
            sumatoriaPrimo+=vectorPrimo[indexVector];
        }
        promedioPrimo = sumatoriaPrimo/(vectorPrimo.length);
        System.out.println("Promedio: "+promedioPrimo);
    }

    public static Integer Capturar(String x) {
        Scanner scanner = new Scanner(System.in);
        Integer dato = 0;
        Boolean bandera = true;

        while (bandera == true) {
            try {
                System.out.print(x);
                dato = Integer.parseInt(scanner.next());
                bandera = false;
            } catch (Exception e) {
                System.out.println("Dato no válido.");
            }
        }
        return dato;
    }

    public static Integer CapturarApartir(String x, Integer inicial) {
        Integer dato = 0;
        Boolean bandera = true;
        do {
            dato = Capturar(x);
            if (dato > inicial) {
                bandera = false;
            }
        } while (bandera == true);
        return dato;
    }
}
