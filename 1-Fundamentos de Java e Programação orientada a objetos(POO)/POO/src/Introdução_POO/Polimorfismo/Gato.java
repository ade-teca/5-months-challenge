package Introdução_POO.Polimorfismo;

/**
 * Classe que representa um gato, herdando da classe Animal.
 */
class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato mia.");
    }
}
