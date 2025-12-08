import entidades.Aluno;
import entidades.GerenciarAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarAlunos  gerenciarAlunos = new GerenciarAlunos();

        int opcao;

        while (true) {
            System.out.printf("Digite 1 para adicionar aluno: ");
            System.out.println("2 para listar alunos");
            System.out.println("3 para atualizar aluno");
            System.out.println("4 para remover aluno");
            System.out.println(" 5  para sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1 -> {
                    System.out.println("Digite o nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o nota do aluno: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite o nota do aluno: ");
                    double nota2 = sc.nextDouble();
                    sc.nextLine();

                    Aluno aluno = new Aluno(nome, nota, nota2);
                    gerenciarAlunos.adicionarAluno(aluno);


                }


            }
        }


    }
}
