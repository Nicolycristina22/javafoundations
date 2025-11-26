package desafios;

import java.util.Scanner;

public class Desafio2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a velocidade  ");
        int velocidade = sc.nextInt();

        if (velocidade>= 90 ){
          int  res =  (velocidade - 90) * 10;
            System.out.println( " sua multa sera de" + res);
        } else {
            System.out.println(" nao sera multado");
        }

    }
}
