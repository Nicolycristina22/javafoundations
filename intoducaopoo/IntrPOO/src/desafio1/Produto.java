package desafio1;

public class Produto {
    String nome;
    double preco;
    double quantidade;

    public double calculaTotal() {
        return  preco * quantidade;

    }
}