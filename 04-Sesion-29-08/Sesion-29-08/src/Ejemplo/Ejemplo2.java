
public class Main {

    public static void main(String[] args) {
        // Declaración de variables para las proposiciones
        boolean A = true; // Juan estudia matemáticas
        boolean B = true; // Ana estudia ciencias
        boolean C = false; // Carlos estudia historia

        // Declaración de variables para las afirmaciones
        boolean afirmacionA, afirmacionB;

        // Evaluación de las afirmaciones
        afirmacionA = A && B; // Afirmación a)
        afirmacionB = C && !A; // Afirmación b)

        // Mostrar los resultados
        System.out.println("Afirmación 'Juan estudia matemáticas y Ana estudia ciencias' es " + afirmacionA);
        System.out.println("Afirmación 'Carlos estudia historia y Juan no estudia matemáticas' es " + afirmacionB);
    }
}
