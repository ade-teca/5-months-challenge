package introdução;

/**
 * Classe que demonstra o uso de operadores relacionais.
 */
public class OperadoresRelacionais {

    public static void main(String[] args) {
        boolean igual = 10 == 10;
        boolean diferente = 10 != 5;
        boolean maior = 10 > 5;
        boolean menor = 5 < 10;
        boolean maiorOuIgual = 10 >= 10;
        boolean menorOuIgual = 5 <= 10;

        // Impressão dos resultados
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Maior ou igual: " + maiorOuIgual);
        System.out.println("Menor ou igual: " + menorOuIgual);
    }
}
