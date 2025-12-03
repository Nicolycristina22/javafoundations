package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class DesafioLanche {
    public static void main(String[] args) {
        ArrayList<String> pedidos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;
        while (true) {
            System.out.println("1 fazer pedido");
            System.out.println("2 listar pedido");
            System.out.println("3 atualizar pedido");
            System.out.println("4 cancelar pedido");
            System.out.println("5 sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("digite seu pedido");
                    String pedido = sc.nextLine();
                    pedidos.add(pedido);
                    break;
                case 2:
                    System.out.println("listar pedidos");
                    if (pedidos.isEmpty()) {
                        System.out.println("sem pedidos");


                        }else {
                        System.out.println(pedidos);
                    }
                    break;

                    case 3:
                        System.out.println("atualizar pedido");
                        String novoPedido = sc.nextLine();
                        pedidos.set(0,novoPedido);
                        break;

                        case 4:
                            System.out.println("cancelar pedido");
                            pedidos.remove(0);
                            break;
                            case 5:
                                System.out.println("sair");
                                return;
                    }
            }
        }
    }
