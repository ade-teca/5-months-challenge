package Introdução_POO.Encapsulamento;

/**
 * Classe que representa uma conta bancária.
 */
public class ContaBancaria {
    // Atributos privados
    private double saldo;

    // Método construtor
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Métodos públicos para acessar e modificar o saldo
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }
}
