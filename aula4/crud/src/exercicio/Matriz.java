package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Matriz {
    static void main(String[] args) {
        ArrayList<Integer> menuLanches = new ArrayList<>(Arrays.asList(
                "x-burger"
                "x-egg"
                "x-bacon"
                "x-salada"
                "x-tudo"
        ));
        ArrayList<Integer> menuprecos = new ArrayList<>(Arrays.asList(
                "22,90"
                "24,90"
                "26,90"
                "26,90"
                "29,90"
        ));

        for (int i = 1; i <= menuLanches.size(); i++) {
            System.out.printf(i+"-" +menuLanches.get(i)+"precos" +menuprecos.get(i));
        }

    }
}