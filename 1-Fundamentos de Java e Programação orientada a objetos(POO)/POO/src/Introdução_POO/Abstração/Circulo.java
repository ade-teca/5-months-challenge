package Introdução_POO.Abstração;

/**
 * Classe que representa um círculo, herdando de Forma.
 */
class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
