/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //Objeto para capturar datos
        Scanner scanner = new Scanner(System.in);

        System.out.println("Binevenidos a la solución del taller 1.");

        //Entrada de datos
        int tipo; //Variable para elegir ejercicio

        //Capturar tipo [1/2/3/4]
        System.out.print("Elegir ejercicio  1/2/3/4: ");
        tipo = Integer.parseInt(scanner.next());

        //Generar caso
        switch (tipo) {
            case 1:
                System.out.println("Solución ejercicio 1.");
                double resultado;
                resultado = Ej1();
                System.out.println(resultado);
                break;
            case 2:
                System.out.println("Solución ejercicio 2");
                Ej2();
                break;
            case 3:
                System.out.println("Solución ejercicio 3");
                System.out.println(Ej3());
                break;
            case 4:
                System.out.println("Solución ejercicio 4");
                Ej4();
                break;
            default:
                System.out.println("Opción no válida, ejercio no existe.");
        }

    }

    public static double Ej1() {
        //Capturar datos 
        Scanner x = new Scanner(System.in);

        double saldoFinal = 0;
        double capital = 1000000;
        double interes = 0.025;
        int mes = 12;

        //Aplicando la fórmula F = P * ( 1+i )^n
        saldoFinal = capital * Math.pow((1 + interes), mes);

        return saldoFinal;
    }

    public static void Ej2() {
        Scanner z = new Scanner(System.in);
        int edad = 0;
        double numPul = 0;

        System.out.print("Digite la edad de la persona: ");
        edad = z.nextInt();

        //num. Pulsaciones = (220 - edad)/10
        numPul = (220 - edad) / 10;

        System.out.print("EL número de pulsaciones de la persona de edad " + edad + " es de: " + numPul + " pulsaciones.");
    }

    public static String Ej3() {
        Scanner entrada = new Scanner(System.in);

        String respuesta = "";
        double salario;
        double incremento = 0;
        double porcentajeIncremento = 0.25;
        double nuevoSalario = 0;

        System.out.print("Digite el salario actual de la persona: ");
        salario = entrada.nextDouble();

        //Calcular nuevo salario
        incremento = salario * porcentajeIncremento;
        nuevoSalario = salario + incremento;

        respuesta = "Salario base: " + salario + ", incremento: " + incremento + ", en este sentido su nuevo salario es: " + nuevoSalario + ".";
        return respuesta;
    }

    public static void Ej4() {
        Scanner entrada = new Scanner(System.in);
        double ginecologia;
        double pediatria;
        double traumatologia;
        double presupuesto = 0;

        while (presupuesto <= 0) {
            System.out.println("Digite el presupuesto: ");
            presupuesto = entrada.nextDouble();

            if (presupuesto <= 0) {
                System.out.println("Ha ingresado un dato no válido. \n Solo se admite un presupuesto mayor a cero.");
            }
        }

        /*while (presupuesto <= 0) {
            try {
                System.out.println("Digite el presupuesto: ");
                presupuesto = Double.parseDouble(entrada.next());

                if (presupuesto <= 0) {
                    System.out.println("Ha ingresado un dato no válido. \n Solo se admite un presupuesto mayor a cero.");
                }
            } catch (Exception e) {
                presupuesto = 0;
                System.out.println("Solo datos numéricos.");
            }
        }*/
        
        
        //Realizar asignación del presupuesto. 
        ginecologia = presupuesto*0.4;
        traumatologia = presupuesto * 0.3;
        pediatria = presupuesto * 0.3;
        
        
        System.out.println("Del presupuesto: "+presupuesto);
        System.out.println("Ginecología: "+ginecologia);
        System.out.println("Traumatología: "+traumatologia);
        System.out.println("Pediatría: "+pediatria);

    }
}
