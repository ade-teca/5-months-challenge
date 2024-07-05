package introdução;

import java.util.Scanner;

/**
 * Classe que demonstra a entrada e saída de dados usando Scanner.
 */
public class EntradaSaida {

    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura da entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura do nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Solicitação e leitura da idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Exibição da mensagem
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        // Fechamento do Scanner
        scanner.close();
    }
}
