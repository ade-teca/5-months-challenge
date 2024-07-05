package Introdução_POO.class_e_objetos;

/**
 * Classe que representa um carro.
 */
public class Carro {
    // Atributos
    String marca;
    String modelo;
    int ano;

    // Método construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
