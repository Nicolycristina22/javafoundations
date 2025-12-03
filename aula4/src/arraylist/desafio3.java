package arraylist;

import java.awt.*;
import java.util.ArrayList;

public class desafio3 {
    static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);


        System.out.println("Lista de números original: " + numeros);


        List<Integer> numerosPares = numeros.stream()
                                            .filter(n -> n % 2 == 0)
                                            .collect(Collectors.toList());

        System.out.println("Números pares: " + numerosPares);
    }
}



    }
}
