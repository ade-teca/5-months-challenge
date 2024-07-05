package controle_de_fluxo;

/**
 * Classe que demonstra o uso de estruturas de repetição.
 */
public class EstruturasRepeticao {

    public static void main(String[] args) {
        // Estrutura for
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }

        // Estrutura while
        int j = 0;
        while (j < 5) {
            System.out.println("j: " + j);
            j++;
        }

        // Estrutura do-while
        int k = 0;
        do {
            System.out.println("k: " + k);
            k++;
        } while (k < 5);
    }
}

