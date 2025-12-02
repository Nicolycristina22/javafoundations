package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class desafio2 {
    static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("Digite um numero: 0 PARA PARAR ");
            numero.add(input.nextInt());

            if (numero ==0 ){
                break;

            } else {
                numeros.add(numero);
            }

            }
        for (int numero: numeros) {
             soma += numero;

        }
        System.out.println();

    }
}
