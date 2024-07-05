package introdução;

/**
 * Classe que demonstra o uso de operadores lógicos.
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean e = true && false;
        boolean ou = true || false;
        boolean nao = !true;

        // Impressão dos resultados
        System.out.println("E (true && false): " + e);
        System.out.println("Ou (true || false): " + ou);
        System.out.println("Não (!true): " + nao);
    }
}
