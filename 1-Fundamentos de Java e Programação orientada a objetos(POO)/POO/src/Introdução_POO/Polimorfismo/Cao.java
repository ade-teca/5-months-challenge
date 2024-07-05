package Introdução_POO.Polimorfismo;

/**
 * Classe que representa um cão, herdando da classe Animal.
 */
class Cao extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cão late.");
    }
}
