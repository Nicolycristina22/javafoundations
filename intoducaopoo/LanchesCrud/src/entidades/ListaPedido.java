package entidades;

import java.util.ArrayList;

public  class ListaPedido {
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        if (pedido.getQuantidade() <= 0) {
            System.out.println("informe um valor valido");
        } else {
            pedidos.add(pedido);
            System.out.println("Pedido adicionado com sucesso");
        }


    }

    public void listarPedidos() {
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println(i + pedidos.get(i).toString());
        }

    }
    public void atualizarPedido(int id, double preco, String nomeLanche, int quantidade) {
        if (id < 0 || id >= pedidos.size()) {
            System.out.println("ID inválido!");

        }else{

        var pedido = pedidos.get(id);
        pedido.setNomeLanche(nomeLanche);
        pedido.setPreco(preco);
        pedido.setQuantidade(quantidade);

        System.out.println("Pedido atualizado com sucesso!");
    }
    }
    public  void removerPedido(int id) {
        if (id < 0 || id >= pedidos.size()) {
            System.out.println("ID inválido!");
        } else {
            pedidos.remove(id);
            System.out.println("Pedido removido com sucesso!");
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Pedido pedido : pedidos) {
            total += pedido.calcularTotal();
        }
        return total;
    }
}