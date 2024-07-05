package controle_de_fluxo;

/**
 * Classe que demonstra o controle de fluxo com break e continue.
 */
public class ControleFluxo {

    public static void main(String[] args) {
        // Uso do break
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Sai do loop quando i é 5
            }
            System.out.println("i: " + i);
        }

        // Uso do continue
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Pula a iteração quando i é par
            }
            System.out.println("i: " + i);
        }
    }
}

