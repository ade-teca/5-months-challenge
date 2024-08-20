package estrutura_sequencial;
/**
 *<h>ConvertorTemperatura</h>
 * O ConvertorTemperatura converte temperaturas entre graus celsius e fahrenheit
 *
 * @author Adelito Teca
 * @version 1.0
 * @since 05/07/2024
 *
 */

import java.util.Scanner;

public class ConvertorTemperatura {

    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura da entrada
        Scanner scanner = new Scanner(System.in);

        System.out.println("1-Fahrenheit para Celsius\n" +
                "2-Celsius para Fahrenheit");

        // Solicitação e leitura do tipo de conversão
        System.out.print("Digita o tipo de conversão ");
        int tipo = scanner.nextInt();


        // Solicitação e leitura da idade
        System.out.print("Digite sua idade: ");
        double valor = scanner.nextDouble();

        double temp;

        if(tipo == 1)
        {
             temp = 5 * ((valor-32) / 9);
            System.out.println("Temperatura convertida : "+temp+"ºC");
        } else if (tipo == 2)
        {
            temp = (9*valor)/5 + 32;
            System.out.println("Temperatura convertida : "+ temp+ "ºF");
        }
        else
        {
            System.out.println("Valor indisponível");
        }


        // Fechamento do Scanner
        scanner.close();
    }
}
