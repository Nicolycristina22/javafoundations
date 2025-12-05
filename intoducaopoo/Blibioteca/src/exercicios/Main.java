package exercicios;

public class Main {

    public static void main(String[] args) {

        Livro galinhaPintadinha= new Livro("galinha pintadinha", "julian prado" ,"ciranda",
                22.90 , 3);
       // galinhaPintadinha.alugarLivro(1);
        galinhaPintadinha.devolverLivro(+1);
        System.out.println(galinhaPintadinha.toString());


    }
}
