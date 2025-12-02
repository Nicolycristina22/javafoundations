package arraylist;

import java.util.ArrayList;

public class ListaNumeros {
    static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        for (Integer numero : numeros) {
            numeros.add(numero+numero);
            System.out.println(numero);
        }
    }
}