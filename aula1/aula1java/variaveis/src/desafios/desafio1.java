package desafios;

import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ;
        System.out.println("digite uma nota");
        double nota = sc.nextDouble();
        if (nota <= 5) {
            ;
            System.out.println("reprovado");

        } else if (5 >= nota && nota <= 6.9) {
            System.out.println("recuperacao");

        } else if (nota>= 7 && nota <8.9) {
            System.out.println("aprovado");
        } else {
            System.out.println("aprovado - excelente");
        }
    }
    }

