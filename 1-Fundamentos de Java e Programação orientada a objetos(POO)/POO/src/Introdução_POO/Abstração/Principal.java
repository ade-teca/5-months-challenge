package Introdução_POO.Abstração;

/**
 * Classe principal para demonstrar abstração.
 */
public class Principal {

    public static void main(String[] args) {
        Forma circulo = new Circulo(5.0);
        Forma retangulo = new Retangulo(4.0, 6.0);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
    }
}
