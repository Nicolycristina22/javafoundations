package Lanches;

import java.util.ArrayList;

public class GerenciarLanche {
    private ArrayList<Pedido> lanches = new ArrayList<Pedido>();

    public void adicionarPedido(Pedido pedido) {
        lanches.add(pedido);
        System.out.println("Pedido adicionado com sucesso!");
    }

    public void listarPedidos(){
        if (lanches.isEmpty()) {
            System.out.println("nenhum pedido encontrado");
        } else{

            for (int i=0; i<lanches.size(); i++){
                System.out.println(i+lanches.get(i).toString());
            }

    }

    }
    public void atualizarPedido(int id, String lanche, double valor, int quantidade){
        var pedidos = lanches.get(id);
        pedidos.setLanche(lanche);
        pedidos.setValor(valor);
        pedidos.setQuantidade(quantidade);
        System.out.println("Pedido atualizado com sucesso!");


    }
    public void excluirPedido(int id) {
        var  Pedido = lanches.get(id);
        lanches.remove(id);
        System.out.println("pedido cancelado com sucesso!");
    }

    public void totalPedido(int id, String lanche, double valor, int quantidade){
        var pedidos = lanches.get(id);
        pedidos.total();



    }
}
