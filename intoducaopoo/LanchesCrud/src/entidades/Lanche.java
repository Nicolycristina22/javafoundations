package entidades;

public class Lanche {
    private String nome;
    private double precoUnitario;


    public Lanche(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        return "Lanche " +
                "nome '" + nome +
                " preco " + precoUnitario
                ;
    }
}
