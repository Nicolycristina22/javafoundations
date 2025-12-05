package exercicios1;

public class Roupa {
    String marca;
    String tipo;
    String tamanho;
    int quantidade;
    double valor;

    public Roupa(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;

    }

    public void decrEstoque(int quantidade) {
        if (quantidade < 0 || quantidade > this.quantidade) {
            System.out.println("valor invalido");
        } else {
            this.quantidade -= quantidade;
            System.out.println("estoque diminuido com  sucesso");
            System.out.println("marca " + this.marca + " tipo" + this.tipo + "tamanho" + this.tamanho +
                    "quantidade" + this.quantidade + " valor " + this.valor);
        }
    }
    public void incrEstoque(int quantidade) {
        if (quantidade > 0 ) {
            this.quantidade += quantidade;
            System.out.println("estoque aumentado com  sucesso\"");
            System.out.println("marca " + this.marca + " tipo " + this.tipo +  " tamanho " + this.tamanho +
                    " quantidade " + this.quantidade + " valor " + this.valor);
        } else {
            System.out.println("valor invalido");
        }
    }
        public String toString () {
            return " marca " + this.marca + " tipo " + this.tipo + " tamanho " + this.tamanho +
                    " quantidade " + this.quantidade + " valor " + this.valor;

        }


    }

