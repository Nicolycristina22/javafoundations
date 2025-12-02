package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class desafio4 {
    static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("banana");
        frutas.add("maca");
        frutas.add("abacate");
        frutas.add("manga");

        Scanner remover = new Scanner(System.in);
        System.out.println("Digite a letra fruta que deseja remover: ");
        String fruta = remover.nextLine();


            frutas.removeIf(itens -> itens.contains(fruta) );




        System.out.println(frutas);
    }
}