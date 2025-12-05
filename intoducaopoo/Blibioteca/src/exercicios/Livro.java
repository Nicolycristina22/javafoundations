package exercicios;

public class Livro {
     String titulo;
     String autor;
     String editora;
     double precoUnitario;
        int quantidade;


    public Livro(String titulo, String autor, String editora, double precoUnitario, int quantidade) {
    this.titulo = titulo;
    this.autor = autor;
    this.editora = editora;
    this.precoUnitario = precoUnitario;
    this.quantidade = quantidade;


    }

    public void alugarLivro(int quantidade) {
        if (quantidade < 0 || quantidade > this.quantidade) {
            System.out.println("valor invalido");
        } else  {
            this.quantidade -= quantidade;
            System.out.println("alugado com  sucesso");
            System.out.println("livro " + this.titulo +
                    "\nautor " + this.autor +
                    "\neditora " + this.editora +
                    "\nquantidade " + this.quantidade +
                    "\nvalor do livro "  + this.precoUnitario );
        }
    }

    public void devolverLivro(int quantidade) {
        if (quantidade > 0 ) {
            this.quantidade += quantidade;
            System.out.println("devolvido com sucesso");
        } else {
            System.out.println("valor invalido");
        }
    }

    public double valorTotal() {
        return this.precoUnitario * this.quantidade;
    }
    public String toString(){
        return "livro " + this.titulo +
                "\nautor " + this.autor +
                "\neditora " + this.editora +
                "\nquantidade " + this.quantidade +
                  "\nvalor do livro "  + this.precoUnitario+
                "\n valor total "+ this.valorTotal();
    }
}
