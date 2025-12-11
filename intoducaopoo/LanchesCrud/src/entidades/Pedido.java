package entidades;

public class Pedido {
    private String nomeLanche;
    private double preco;
    private int quantidade;

    public Pedido(String nomeLanche, double preco, int quantidade) {
        this.nomeLanche = nomeLanche;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNomeLanche() {
        return nomeLanche;
    }

    public void setNomeLanche(String nomeLanche) {
        this.nomeLanche = nomeLanche;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double calcularTotal(){
        return this.preco * this.quantidade;
    }

    @Override
    public String toString() {
        return " Pedido " +
                " Lanche '" + nomeLanche +
                ", preco " + preco +
                ", quantidade " + quantidade + "  total = " + calcularTotal();

    }
}
