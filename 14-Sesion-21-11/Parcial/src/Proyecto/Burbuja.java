/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import Function.Validar;

/**
 *
 * @author ariel
 */
public class Burbuja {

    public static void main(String[] args) {
        //Ordenar datos de un vecto

        Integer data[];
        int i;
        Integer cantidad;

        //Crear objeto de la clase de funciones
        Validar capturar = new Validar();

        //Capturar la cantidad de datos que desea ingresar el usaurio.
        cantidad = capturar.Capturar("Definir la cantidad de datos a ingresar: ", Boolean.FALSE, 1, 0, Boolean.TRUE).intValue();

        //Una vez identificada la cantidad de datos a capturar, se inicializa los vectores
        data = new Integer[cantidad];

        for (i = 0; i < data.length; i++) {
            data[i] = capturar.Capturar("Ingresar un número: ", Boolean.FALSE, 0, 0, Boolean.FALSE).intValue();
        }

        //Odenar el vector.
        Integer aux;
        Integer moverPos;
        do {
            moverPos = 0;
            for (i = 0; i < data.length - 1; i++) {
                if (data[i] > data[(i + 1)]) {
                    aux = data[(i + 1)];
                    data[(i + 1)] = data[i];
                    data[i] = aux;
                    moverPos++;
                }
            }
            System.out.println("***" + moverPos + "***");
            Imprimir(data);
        } while (moverPos >= 1);

    }

    public static void Imprimir(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " - ");
        }
    }
}
