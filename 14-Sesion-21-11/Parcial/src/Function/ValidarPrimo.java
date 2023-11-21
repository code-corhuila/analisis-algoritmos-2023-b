/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

/**
 *
 * @author ariel
 */
public class ValidarPrimo {

    public Boolean Varificar(Integer number) {

        int cantidad = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                cantidad++;
            }
        }
        
        if (cantidad == 2) {
            return true;
        }else{
            return false;
        }
    }
}
