import Lanches.GerenciarLanche;
import Lanches.Pedido;
import Lanches.menu;
import entidades.GerenciarAlunos;

import java.util.Scanner;

public class MainPedido {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarLanche gerenciarLanche = new GerenciarLanche();
        menu ml = new menu();


        int opcao;

        while (true) {
            System.out.println(" 1 adicionar item");
            System.out.println("2 listar item");
            System.out.println("3 atualizar pedido");
            System.out.println("4 excluir item ");
            System.out.println("5 total dos pedidos");
            System.out.println(" 6 sair ");

            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1 ->{
                    ml.exibirLanches();
                    System.out.println("Digite o id");
                    int opcaoLanche = sc.nextInt();
                    sc.nextLine();

                    System.out.println("digite a quantidade");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    var lanche = ml.getLanche(opcaoLanche);

                    Pedido pedido = new Pedido(lanche.getLanche(),lanche.getValor(),lanche.getQuantidade());
                    gerenciarLanche.adicionarPedido(pedido);


                }
                case 2 ->{
                    gerenciarLanche.listarPedidos();
                }
                    case 3 ->{
                        gerenciarLanche.listarPedidos();

                        System.out.println("informe o id do pedido");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Digite o nome do pedido: ");
                        String lanche = sc.nextLine();

                        System.out.println("digite o valor");
                        double valor = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("digite a quantidade");
                        int quantidade = sc.nextInt();
                        sc.nextLine();

                        gerenciarLanche.atualizarPedido(id, lanche ,valor ,quantidade);

                    }

                    case 4 ->{
                    gerenciarLanche.listarPedidos();
                    System.out.println("informe o id do pedido");
                    int id = sc.nextInt();
                    sc.nextLine();
                    gerenciarLanche.excluirPedido(id);
                    }
                    case 5 ->{
                        System.out.println(gerenciarLanche.totalPedido(id).toString);

                    }

            }
        }
    }
}