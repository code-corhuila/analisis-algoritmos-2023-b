/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import Function.Validar;

/**
 *
 * @author ariel
 */
public class PromedioEdad {
    public static void main(String[] args) {
        //Promedio de edades del grupo Análisis de Algoritmos
        Validar validar = new Validar();
        int i;
        int cantidadEstudiante = validar.Capturar("Digite la cantidad de estudiantes que va a tener en cuenta: ", Boolean.TRUE, 1, 35, Boolean.FALSE).intValue();
        int edad[] = new int[cantidadEstudiante];
        double promedio,acumulador=0;
        
        //Capturar
        for(i=0;i<cantidadEstudiante;i++){
            edad[i]=validar.Capturar("Digite la edad del estudiante "+(i+1)+": ", Boolean.TRUE, 1, 120, Boolean.FALSE).intValue();
        }
        
        //Hallar promedio
        for(i=0;i<cantidadEstudiante;i++){
            acumulador+=edad[i];
        }
        promedio = acumulador/cantidadEstudiante;
        
        System.out.println("El promedio es: "+promedio);
        
    }
}
