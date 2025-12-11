import entidades.ListaPedido;
import entidades.MenuLanches;
import entidades.Pedido;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuLanches menu = new MenuLanches();
        ListaPedido listaPedidos = new ListaPedido();
        int opcao;

        while(true){
            System.out.println("1 cadastrar Lanche");
            System.out.println("2 listar pedido");
            System.out.println("3 alterar pedido");
            System.out.println("4 excluir pedido");
            System.out.println("5 calcular pedido");
            System.out.println("6 sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao){
                case 1 ->{
                    menu.exibirCardapio();
                    System.out.println("escolha uma opcao");
                    int opcaoLanche = sc.nextInt();
                    sc.nextLine();
                    var LancheEscolhido = menu.getCardapio(opcaoLanche);
                    System.out.println(LancheEscolhido.getNome());
                    System.out.println(LancheEscolhido.getPrecoUnitario());

                    System.out.println("digite a quantidade ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    Pedido pedido = new Pedido(LancheEscolhido.getNome(),LancheEscolhido.getPrecoUnitario(),quantidade );
                    listaPedidos.adicionarPedido(pedido);
                }
                case 2 ->{
                    System.out.println("lista de pedidos");
                    listaPedidos.listarPedidos();
                }
                case 3 ->{
                    listaPedidos.listarPedidos();

                    System.out.println("informe o id do pedido a alterar");
                    int id = sc.nextInt();
                    sc.nextLine();

                    menu.exibirCardapio();

                    System.out.println("escolha uma opcao do cardapio");
                    int opcaoLanche = sc.nextInt();
                    sc.nextLine();

                    var lancheEscolhido = menu.getCardapio(opcaoLanche);
                    String nomeLanche = lancheEscolhido.getNome();

                    System.out.println("digite a quantidade");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    listaPedidos.atualizarPedido(id, lancheEscolhido.getPrecoUnitario(), nomeLanche, quantidade);

                }
                case 4 ->{
                    listaPedidos.listarPedidos();
                    System.out.println("informe o id do pedido a excluir");
                    int id = sc.nextInt();
                    sc.nextLine();
                    listaPedidos.removerPedido(id);

                }
                case 5 ->{

                    System.out.println("valor total do pedido: " + listaPedidos.calcularValorTotal());
                }
                case 6 ->{
                    System.out.println("saindo...");
                    return;
            }

        }
    }
    }
}



