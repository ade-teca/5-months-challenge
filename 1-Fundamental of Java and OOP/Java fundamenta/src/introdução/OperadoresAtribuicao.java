package introdução;

/**
 * Classe que demonstra o uso de operadores de atribuição.
 */
public class OperadoresAtribuicao {

    public static void main(String[] args) {
        int x = 5;
        x += 3; // x = x + 3
        System.out.println("x += 3: " + x);

        x -= 2; // x = x - 2
        System.out.println("x -= 2: " + x);

        x *= 4; // x = x * 4
        System.out.println("x *= 4: " + x);

        x /= 2; // x = x / 2
        System.out.println("x /= 2: " + x);

        x %= 3; // x = x % 3
        System.out.println("x %= 3: " + x);
    }
}
