package exercicoPOO;

public class AlunoPoo {
    //atributos
    String nome;
    double nota;
    double nota2;

    //metodo

   public double calculaMedia(){
       double media = (nota + nota2) / 2;
       return media;
   }
}
