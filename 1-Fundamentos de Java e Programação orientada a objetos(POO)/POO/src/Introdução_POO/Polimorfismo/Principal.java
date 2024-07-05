package Introdução_POO.Polimorfismo;

/**
 * Classe principal para demonstrar polimorfismo.
 */
public class Principal {

    public static void main(String[] args) {
        Animal meuCao = new Cao();
        Animal meuGato = new Gato();

        meuCao.emitirSom();
        meuGato.emitirSom();
    }
}
