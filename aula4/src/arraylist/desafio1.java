package arraylist;

import java.util.ArrayList;

public class desafio1 {
    static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("alice");
        nomes.add("ana");
        nomes.add("pedro");
        nomes.add("diego");
        nomes.removeIf(itens -> itens.charAt(0) != 'a');
        System.out.println(nomes);
        System.out.println(" total de nomes: "+ nomes.size());



        }
    }

