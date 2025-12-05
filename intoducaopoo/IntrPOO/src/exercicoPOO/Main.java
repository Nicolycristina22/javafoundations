package exercicoPOO;

import exercicio.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println();

       AlunoPoo aluno1 = new AlunoPoo();

        System.out.println("Digite o nome do aluno: ");
        aluno1.nome = sc.nextLine();

        System.out.println("Digite a nota do aluno: ");
        aluno1.nota = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a nota do aluno: ");
        aluno1.nota2 = sc.nextDouble();
        sc.nextLine();


        System.out.println(aluno1.nome);
        System.out.println(aluno1.nota);
        System.out.println(aluno1.nota2);

        System.out.println(aluno1.calculaMedia());
    }
}
