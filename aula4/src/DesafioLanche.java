package exercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DesafioLanche {
    public static void main(String[] args) {
        ArrayList<String> pedidos = new ArrayList<>();
        ArrayList<Double> quantidade = new ArrayList<>();
        ArrayList<Double> total = new ArrayList<>();
        ArrayList<Double> valor = new ArrayList<>();
        ArrayList<String> menuLanches = new ArrayList<>(Arrays.asList(
                "x-burger",
                "x-egg",
                "x-bacon",
                "x-salada",
                "x-tudo"
        ));
        ArrayList<Double> menuprecos = new ArrayList<>(Arrays.asList(
                22.90,
                24.90,
                26.90,
                26.90,
                29.90
        ));
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
                    for (int i = 0; i < menuLanches.size(); i++) {
                        System.out.println(i + "-" + menuLanches.get(i) + menuprecos.get(i));
                    }

                    System.out.println("informe o numero do lanche ");
                    int indiceLanche = sc.nextInt();
                    sc.nextLine();


                    String pedido = menuLanches.get(indiceLanche);
                    pedidos.add(pedido);

                    double val = menuprecos.get(indiceLanche);
                    valor.add(val);

                    System.out.println("Informe a quantidade: ");
                    double quant = sc.nextDouble();
                    sc.nextLine();
                    quantidade.add(quant);

                    double valorfinal= quant * val;
                    total.add(valorfinal);
                    break;
                case 2:
                    System.out.println("listar pedidos");

                    if (total.isEmpty()) {
                        System.out.println("sem pedidos");

                        }else {
                        for (int i = 0; i < total.size(); i++) {



                        System.out.println(i+" seu pedido é "+ pedidos.get(i) + " a quantidade seria de " +quantidade.get(i)+  "ficando no total " + total.get(i));
                    }}

                    break;

                    case 3:
                        for (int i = 0; i < menuLanches.size(); i++) {
                            System.out.println(i + "-" + menuLanches.get(i) + menuprecos.get(i));
                        }
                        System.out.println("atualizar pedido, digite o numero do pedido");
                        int pedidonumero = sc.nextInt();
                        sc.nextLine();
                        System.out.println(", digite o novo pedido");
                        int novoPedido = sc.nextInt();
                        sc.nextLine();
                        String novopedido = menuLanches.get(pedidonumero);



                        System.out.println("a nova quantidade");
                        double novaquantidade = sc.nextDouble();
                        quantidade.set(pedidonumero,novaquantidade);

                       double  novototal = novaquantidade * novoPedido;
                        total.set(pedidonumero,novototal);
                        break;

                        case 4:
                            System.out.println("cancelar pedido");
                            pedidos.remove(0);
                            total.remove(0);
                            quantidade.remove(0);
                            valor.remove(0);
                            break;
                            case 5:
                                System.out.println("sair");
                                return;

                    }

            }
        }
    }
