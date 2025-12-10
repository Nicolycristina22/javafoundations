package Lanches;

public class Pedido {
    private String lanche;
    private double valor;
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getLanche() {
        return lanche;
    }

    public void setLanche(String lanche) {
        this.lanche = lanche;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pedido(String lanche, double valor , int quantidade) {
        this.lanche = lanche;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double total(){
        return quantidade * valor;
    }

    @Override
    public String toString() {
        return " lanche: " + lanche +
                " | valor: " + valor +
                " | quantidade: " + quantidade +
                " | total: " + total();
    }
}