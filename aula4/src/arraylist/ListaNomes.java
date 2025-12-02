package arraylist;

import java.util.ArrayList;

public class ListaNomes {
    static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        //add valores a lista
        nomes.add("pedro");
        nomes.add("diego");
        //add na posicao especifica
        nomes.add(1, "enzo");
        //verificar item
        System.out.println(nomes.get(0));

        //alterar item
        nomes.set(0, "joao");

        //retornar a posicao apartir do valor

        System.out.println(nomes.indexOf("enzo"));

        // remover elemento
        nomes.remove("diego");

        //verificar o tamanho da lista
        System.out.println(nomes.size());

        // remove if
        nomes.removeIf(itens -> itens.charAt(0) == 'j');

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}