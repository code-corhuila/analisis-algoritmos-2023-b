public class Ejemplo {

    public static void main(String[] args) {
        // Declaración de variables para las proposiciones
        boolean A = true; // Juan estudia matemáticas
        boolean B = true; // Ana estudia ciencias
        boolean C = true; // Carlos estudia historia

        /*
         * Caso1: Juan estudia matemáticas
         * Caso2: Ana estudia ciencias
         * Caso3: Carlos estudia historia
         * Caso4: Juan estudia matemáticas, pero Ana no estudia ciencias.
         * Caso5: Juan no estudia matemáticas, pero Ana estudia ciencias.
         * Caso6: Juan estudia matemáticas, pero Ana estudia ciencias.
         * Caso7: Informar si Juan no estudia matemáticas o si Ana estudia ciencias.
         */


        // Declaración de variables para las afirmaciones
        boolean Caso1, Caso2, Caso3, Caso4, Caso5, Caso6,Caso7;

        // Evaluación de las afirmaciones
        Caso1 = !A; // Afirmación A)
        Caso2 = B; // Afirmación B)
        Caso3 = C; // Afirmación C)
        Caso4 = A && !B; // Afirmación A y Negación B)
        Caso5 = A && B; // Negación A y Afirmación B)
        Caso6 = A && B; // Afirmación A y Afirmación B)
        Caso7 = !A || B; // Negación A o Afirmación B)
        

        // Caso 1
        if(Caso1==true){
            System.out.println("Juan estudia matemáticas");
        }else{
            System.out.println("Juan no  estudia matemáticas");
        }

        // Caso 5
        if(Caso7==false){
            System.out.println("Informar si Juan no estudia matem\u00E1ticas o si Ana estudia ciencias.");
        }else{
            System.out.println("No se cumple la proposición.");
        }

        // Caso 7
        if(Caso7==true){
            System.out.println("Juan no estudia matemáticas, pero Ana estudia ciencias.");
        }else{
            System.out.println("No se cumple la proposición.");
        }

    }
}
