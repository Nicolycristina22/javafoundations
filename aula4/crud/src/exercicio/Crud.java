package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Crud {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;


        while(true){
            System.out.println(" sistema crud alunos");
            System.out.println(" Digite 1 cad alunos");
            System.out.println(" Digite 2 listar alunos");
            System.out.println(" Digite 3 atualizar cad alunos");
            System.out.println(" Digite 4 excluir cad alunos");
            System.out.println(" Digite 5 sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao){
                case 1:
                    System.out.println("Digite o nome do aluno");
                    String nome = sc.nextLine();
                    nomes.add(nome);
                    System.out.println("aluno cadastrado com sucesso");
                    break;
                case 2:
                        System.out.println("lista de alunos");
                        if (nomes.isEmpty()){
                            System.out.println("nenhum aluno cadastrado");

                        }else {
                            for (String aluno : nomes) {
                                System.out.println(nomes.indexOf(aluno));

                            }

                        }
                        break;
                        case 3:
                            System.out.println("informe o id do aluno");
                            int id = sc.nextInt();
                            System.out.println("informe o novo nome");
                            String nomeAluno = sc.nextLine();
                            nomes.set(id,nomeAluno);
                            break;

                case 4:
                    System.out.println("remover aluno, informe o id do aluno");
                     int idAluno = sc.nextInt();
                     nomes.remove(idAluno);
                     break;
                     case 5:
                         System.out.println("encerrando programa");
                         return;
            }
        }
    }
}
