package introdução;

/*
* Tipos de Dados e Variáveis
Tipos de dados primitivos
byte, short, int, long para números inteiros.
float, double para números de ponto flutuante.
char para caracteres.
boolean para valores verdadeiros ou falsos.*/
public class variaveis {
    public static void main(String[] args) {

        int numeroInteiro = 123;
        double numeroDecimal = 12.3;
        boolean valorLogico = true;
        char simbolo = '@';
        String nome = "Keisar";

        System.out.println("Integer variable: "+numeroInteiro+
                "\nDecimal variable: " + numeroDecimal +
                "\nLogical variable: "+ valorLogico +
                "\ncharacter: "+ simbolo+
                "\nString variable:"+ nome);
    }
}