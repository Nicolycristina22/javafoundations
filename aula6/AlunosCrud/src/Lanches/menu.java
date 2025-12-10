package Lanches;

import java.util.ArrayList;

public class menu {
    private ArrayList<Pedido> lanche = new ArrayList<>();

    public menu() {
        lanche.add(new Pedido("x tudo", 30, 6));
        lanche.add(new Pedido("x bacon", 40, 6));
        lanche.add(new Pedido("x egg", 39.90, 6));
        lanche.add(new Pedido("x franco", 29.90, 6));
    }

    public void exibirLanches() {
        System.out.println("-----------menu lanches ----------------");
        for (int i = 0; i < lanche.size(); i++) {
            System.out.println(i + " - " + lanche.get(i).toString());
        }
    }

    public Pedido getLanche(int id) {
        return lanche.get(id);
    }
}