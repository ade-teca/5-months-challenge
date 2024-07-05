package Introdução_POO.Encapsulamento;

/**
 * Classe principal para demonstrar encapsulamento.
 */
public class Principal {

    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria(1000.00);

        // Depósito
        minhaConta.depositar(500.00);
        System.out.println("Saldo após depósito: " + minhaConta.getSaldo());

        // Saque
        minhaConta.sacar(200.00);
        System.out.println("Saldo após saque: " + minhaConta.getSaldo());
    }
}
