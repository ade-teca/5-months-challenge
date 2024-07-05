package controle_de_fluxo;

/**
 * Classe que demonstra o uso de estruturas condicionais.
 */
public class EstruturasCondicionais {

    public static void main(String[] args) {
        int numero = 10;

        // Estrutura if-else
        if (numero > 0) {
            System.out.println("Número positivo");
        } else if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Zero");
        }

        // Estrutura switch-case
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            default:
                System.out.println("Outro dia");
                break;
        }
    }
}

