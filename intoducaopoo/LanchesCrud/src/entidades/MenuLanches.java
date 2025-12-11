package entidades;

import java.util.ArrayList;

public class MenuLanches {
    private ArrayList<Lanche> cardapio = new ArrayList<>();

    public MenuLanches(){
        cardapio.add(new Lanche("x burger", 22));
        cardapio.add(new Lanche("x frango", 22));
        cardapio.add(new Lanche("x egg", 22));
        cardapio.add(new Lanche("x salada", 22));
    }
    public void exibirCardapio(){
        for (int i = 0; i< cardapio.size(); i++){
            System.out.println(i+cardapio.get(i).toString());

        }
    }
    public Lanche getCardapio(int i){
        return cardapio.get(i);
    }
}
