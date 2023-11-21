/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import Function.Validar;
import Function.ValidarPrimo;

/**
 *
 * @author ariel
 */
public class Parcial {

    public static void main(String[] args) {
        Integer cantidad;
        Integer tipo;
        Integer data[];
        int i;
        String validador[];
        Integer contadores[];

        //Crear objeto de la clase de funciones
        Validar capturar = new Validar();

        //Capturar la cantidad de datos que desea ingresar el usaurio.
        cantidad = capturar.Capturar("Definir la cantidad de datos a ingresar: ", Boolean.FALSE, 1, 0, Boolean.TRUE).intValue();

        //Una vez identificada la cantidad de datos a capturar, se inicializa los vectores
        data = new Integer[cantidad];
        validador = new String[cantidad];
        contadores = new Integer[cantidad];

        //Definir tipo de datos a capturar por el usuario
        tipo = capturar.Capturar("Definir el tipo de dato a capturar 1/Positivo, 2/Negativo, 3/Rango, 4/Cualquier número", Boolean.TRUE, 1, 4, Boolean.TRUE).intValue();

        //Requerimeinto 1
        switch (tipo) {
            case 1:
                for (i = 0; i < data.length; i++) {
                    data[i] = capturar.Capturar("Digite un número, ", Boolean.FALSE, 1, 0, Boolean.TRUE).intValue();
                }
                break;
            case 2:
                for (i = 0; i < data.length; i++) {
                    data[i] = capturar.Capturar("Digite un número, ", Boolean.FALSE, 1, 0, Boolean.FALSE).intValue();
                }
                break;
            case 3:
                Integer min = capturar.Capturar("Definir inicio del rango, ", Boolean.FALSE, 1, 0, Boolean.TRUE).intValue();
                Integer max = capturar.Capturar("Definir fin del rango, ", Boolean.FALSE, min, 0, Boolean.TRUE).intValue();
                ;
                for (i = 0; i < data.length; i++) {
                    data[i] = capturar.Capturar("Digite un número entre " + min + " y " + max + ", ", Boolean.FALSE, min, max, Boolean.TRUE).intValue();
                }
                break;
            case 4:
                for (i = 0; i < data.length; i++) {
                    data[i] = capturar.Capturar("Ingresar un número: ", Boolean.FALSE, 0, 0, Boolean.FALSE).intValue();
                }
                break;
        }

        //Mostrar datos capturados
        for (i = 0; i < data.length; i++) {
            System.out.print(data[i] + " - ");
        }

        //Requerimeinto 2
        System.out.println("");
        ValidarPrimo validarPrimo = new ValidarPrimo();
        for (i = 0; i < data.length; i++) {
            validador[i] = validarPrimo.Varificar(data[i]) == true ? "PRIMO" : "NO PRIMO";
        }
        //Mostrar datos 
        for (i = 0; i < validador.length; i++) {
            System.out.print(validador[i] + " - ");
        }

        //Requerimiento 3
        int contador;
        for (i = 0; i < contadores.length; i++) {
            contador = 0;
            //Validar si es par
            if (data[i] % 2 == 0) {
                contador++;
            }

            //Validar si es múltiplo de de 3
            if (data[i] % 3 == 0) {
                contador++;
            }

            //Validar si es múltiplo de 5
            if (data[i] % 5 == 0) {
                contador++;
            }
            contadores[i] = contador;
        }

        //Mostrar datos
        System.out.println("");
        for (i = 0; i < contadores.length; i++) {
            System.out.print(contadores[i] + " - ");
        }
        
        //Requerimiento 4
        Double promedio;
        int acumulador=0;
        for (i = 0; i < data.length; i++) {
           acumulador+=data[i];
        }
        promedio = (double) acumulador/data.length;
        System.out.println("El promeido del acumulado es: "+promedio);
    }
}
