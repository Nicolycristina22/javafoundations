package Lanches;

import java.util.ArrayList;

public class GerenciarLanche {
    private ArrayList<Pedido> lanches = new ArrayList<Pedido>();

    public void adicionarPedido(Pedido pedido) {
        lanches.add(pedido);
        System.out.println("Pedido adicionado com sucesso!");
    }

    public void listarPedidos() {
        if (lanches.isEmpty()) {
            System.out.println("Nenhum pedido encontrado");
        } else {
            for (int i = 0; i < lanches.size(); i++) {
                System.out.println(i + " - " + lanches.get(i).toString());
            }
        }
    }

    public void atualizarPedido(int id, String lanche, double valor, int quantidade) {
        if (id < 0 || id >= lanches.size()) {
            System.out.println("ID inválido!");
            return;
        }

        var pedido = lanches.get(id);
        pedido.setLanche(lanche);
        pedido.setValor(valor);
        pedido.setQuantidade(quantidade);

        System.out.println("Pedido atualizado com sucesso!");
    }

    public void excluirPedido(int id) {
        if (id < 0 || id >= lanches.size()) {
            System.out.println("ID inválido!");
            return;
        }

        lanches.remove(id);
        System.out.println("Pedido cancelado com sucesso!");
    }

    public void totalPedido(int id) {
        if (id < 0 || id >= lanches.size()) {
            System.out.println("ID inválido!");
            return;
        }

        var pedido = lanches.get(id);
        System.out.println("Total do pedido: " + pedido.total());
    }
}
