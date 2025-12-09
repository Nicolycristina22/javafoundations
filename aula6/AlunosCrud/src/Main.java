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
            System.out.println("Digite 1 para adicionar aluno: ");
            System.out.println("2 para listar alunos");
            System.out.println("3 para atualizar aluno");
            System.out.println("4 para remover aluno");
            System.out.println(" 5  para sair");

            opcao = sc.nextInt();
            sc.nextLine();
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
                case 2 -> {
                    gerenciarAlunos.listarAlunos();
                }

                case 3 -> {
                    gerenciarAlunos.listarAlunos();
                    System.out.println("informe o id do aluno: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("informe o nome do aluno: ");
                    String nome = sc.nextLine();
                    System.out.println("informe o nota do aluno: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("informe o nota do aluno: ");
                    double nota2 = sc.nextDouble();
                    sc.nextLine();

                    gerenciarAlunos.atualizarValor(id, nome, nota, nota2);

                }
                case 4 -> {
                    gerenciarAlunos.listarAlunos();
                    System.out.println("informe o id do aluno: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    gerenciarAlunos.excluirAluno(id);

                }
                case 5 -> {
                    System.out.println("programa finalizado!");
                    return;
                }
                default -> {
                    System.out.println("escolha uma opcao valida");
                }

            }
        }


    }
}
