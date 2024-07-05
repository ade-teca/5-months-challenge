package Introdução_POO.class_e_objetos;

/**
 * Classe principal para criar e manipular objetos da classe Carro.
 */
public class Principal {

    public static void main(String[] args) {
        // Criação de objetos
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2021);

        // Chamada de métodos
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}

