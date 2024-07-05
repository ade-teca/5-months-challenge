package introdução;

/**
 * Classe que demonstra a conversão de tipos em Java.
 */
public class ConversaoTipos {

    public static void main(String[] args) {
        // Conversão implícita
        int inteiro = 10;
        double convertido = inteiro;
        System.out.println("Conversão implícita de int para double: " + convertido);

        // Conversão explícita
        double decimal = 9.8;
        int convertidoInt = (int) decimal;
        System.out.println("Conversão explícita de double para int: " + convertidoInt);
    }
}

