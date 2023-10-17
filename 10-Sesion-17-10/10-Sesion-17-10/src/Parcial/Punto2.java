/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Punto2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Valor unitario por cada producto.
        Double valorUP1, valorUP2, valorUP3;

        // Nombre del producto 
        String P1, P2, P3;

        // Cantidad de compra por cada producto
        Integer CP1, CP2, CP3;

        // Valor de compra por cada producto
        Double valorP1, valorP2, valorP3;

        //Nombre del cliente
        String cliente;

        // Detalle pago factura
        Double descuento=0.0, valorBruto, valorNeto;

        // Datos de ordenamiento
        
        
        
        //Capturar datos de la aplicación
        System.out.print("Digite el nombre del producto 1: ");
        P1 = scanner.nextLine();
        valorUP1 = CapturarDatoDouble("Digite el valor unitario de " + P1 + ": ");
        System.out.print("Digite el nombre del producto 2: ");
        P2 = scanner.nextLine();
        valorUP2 = CapturarDatoDouble("Digite el valor unitario de " + P2 + ": ");
        System.out.print("Digite el nombre del producto 3: ");
        P3 = scanner.nextLine();
        valorUP3 = CapturarDatoDouble("Digite el valor unitario de " + P3 + ": ");

        // Capturar datos del cliente
        System.out.println("******************************");
        System.out.println("******************************");
        System.out.print("Digite el nombre del cliente: ");
        cliente = scanner.nextLine();

        CP1 = CapturarDatoEntero("Digite la cantidad de " + P1 + " que desea comprar: ");
        CP2 = CapturarDatoEntero("Digite la cantidad de " + P2 + " que desea comprar: ");
        CP3 = CapturarDatoEntero("Digite la cantidad de " + P3 + " que desea comprar: ");

        // Obtner datos del programa  Valor del producto = Valor Unitario * Cantidad de productos
        valorP1 = valorUP1 * CP1;
        valorP2 = valorUP2 * CP2;
        valorP3 = valorUP3 * CP3;

        //Valor bruto.
        valorBruto = valorP1 + valorP2 + valorP3;

        //Verificar descuentos.
        // Si producto uno es menor que dos, y dos en menor que tres
        if ((valorP1 < valorP2) && (valorP2 < valorP3)) {
            descuento = valorBruto * 0.2;
        }
        // Si producto uno es menor que producto dos, y uno es menor que tres.
        if((valorP1>valorP2) && (valorP1<valorP3)){
            descuento = valorBruto * 0.1;
        }
        
        // Si producto 2 es mayor que tres pero menor que uno.
        if((valorP2>valorP3) && (valorP2<valorP1)){
            descuento = valorBruto * 0.5;
        }
        
        // Si los productos son iguales
        if(valorP1 == valorP2 && valorP1== valorP3){
            descuento = valorBruto * 0.8;
        }
        
        valorNeto = valorBruto - descuento;
        
        System.out.println("******************************");
        System.out.println("Factura cliente:  "+cliente);
        System.out.println("******************************");
        System.out.println("Producto 1: "+P1+ " V.U: "+valorUP1+" Cantidad: "+CP1+" - Coste: "+valorP1);
        System.out.println("Producto 2: "+P2+ " V.U: "+valorUP2+" Cantidad: "+CP2+" - Coste: "+valorP2);
        System.out.println("Producto 3: "+P3+ " V.U: "+valorUP3+" Cantidad: "+CP3+" - Coste: "+valorP3);
        System.out.println("******************************");
        System.out.println("************descuento**********");
        System.out.println("Si: P1 menor P2 y P1 menor P3: 20%");
        System.out.println("Si: P1 mayor P2 y P1 menor P3: 10%");
        System.out.println("Si: P2 mayor P3 y P2 menor P1: 50%");
        System.out.println("Si: P1 igual P2 y P1 igual P3: 80%");
        System.out.println("************descuento**********");
        System.out.println("******************************");
        System.out.println("Valor bruto: "+valorBruto);
        System.out.println("Valor descuento: "+descuento);
        System.out.println("Valor neto: "+valorNeto);
    }

    public static Double CapturarDatoDouble(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        Double dato = 0.0;
        do {
            try {
                System.out.print(mensaje);
                dato = Double.parseDouble(scanner.next());
                if (dato <= 0) {
                    System.out.println("Recueda ingresar cantidad superior a cero.");
                }
            } catch (Exception e) {
                System.out.println("Dato no permitido.");
                dato = 0.0;
            }

        } while (dato <= 0);
        return dato;
    }

    public static Integer CapturarDatoEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        Integer dato = 0;
        do {
            try {
                System.out.print(mensaje);
                dato = Integer.parseInt(scanner.next());
                if (dato <= 0) {
                    System.out.println("Recueda ingresar cantidad superior a cero.");
                }
            } catch (Exception e) {
                System.out.println("Dato no permitido.");
                dato = 0;
            }

        } while (dato <= 0);

        return dato;
    }
}
