package Introdução_POO.Herança;

/**
 * Classe que representa um carro, herdando da classe Veiculo.
 */
class Carro extends Veiculo {
    int ano;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo);
        this.ano = ano;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Ano: " + ano);
    }
}
