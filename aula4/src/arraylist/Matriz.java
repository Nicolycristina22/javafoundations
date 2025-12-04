package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
   public  static void main(String[] args) {
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

        for (int i = 1; i < menuLanches.size(); i++) {
            System.out.println(i+"-" +menuLanches.get(i)+"precos" +menuprecos.get(i));
        }

    }
}
