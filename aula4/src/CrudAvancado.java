package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudAvancado {
    static void main(String[] args) {
        ArrayList<String> nomesAlunos = new ArrayList<>();
        ArrayList<Integer> notasAlunos = new ArrayList<>();
        ArrayList<Integer> idadeAlunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        while (true){
            System.out.println(" sistema crud alunos");
            System.out.println(" Digite 1 cad alunos");
            System.out.println(" Digite 2 listar alunos");
            System.out.println(" Digite 3 atualizar cad alunos");
            System.out.println(" Digite 4 excluir cad alunos");
            System.out.println(" Digite 5 sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){

                case 1:
                    System.out.println("Digite o nome do aluno");
                    String nomeAluno = sc.nextLine();
                    System.out.println("Digite a idade do aluno");
                    int idadeAluno = sc.nextInt();
                    System.out.println("Digite a nota do aluno");
                    int notaAluno = sc.nextInt();

                    nomesAlunos.add(nomeAluno);
                    idadeAlunos.add(idadeAluno);
                    notasAlunos.add(notaAluno);
                    System.out.println("cadastrado com sucesso");
                    break;

                    case 2:
                        System.out.println("lista de alunos");
                        for (int i = 0; i < nomesAlunos.size(); i++) {
                            System.out.println(i+ " nome: " + nomesAlunos.get(i)+
                                    " idade: "+ idadeAlunos.get(i)
                            + " nota: "+ notasAlunos.get(i));



                        }
                        break;
                        case 3:
                            System.out.println("atualizar cadastro");
                            System.out.println("Digite o id do aluno");
                            int idAluno = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Digite o nome do aluno");
                            String nomeAluno2 = sc.nextLine();

                            System.out.println("Digite a idade do aluno");
                            int idadeAluno2 = sc.nextInt();

                            System.out.println("Digite a nota do aluno");
                            int notaAluno2 = sc.nextInt();

                            nomesAlunos.set(idAluno,nomeAluno2);
                            idadeAlunos.set(idadeAluno2,notaAluno2);
                            notasAlunos.set(notaAluno2,notaAluno2);
                            break;

                            case 4:
                                System.out.println("excluir cad aluno");
                                System.out.println("Digite o id do aluno");
                                int idremove = sc.nextInt();
                                sc.nextLine();
                                nomesAlunos.remove(idremove);
                                idadeAlunos.remove(idremove);
                                notasAlunos.remove(idremove);
                            break;

                            case 5:
                                System.out.println("sair");
                                return;
            }

        }
 
    }
}
