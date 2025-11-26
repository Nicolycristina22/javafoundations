package aula2;

import java.util.Scanner;

public class VerificaNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ;
        System.out.println("digite uma nota");
        int nota = sc.nextInt();
        if (nota >= 70) {
            ;
            System.out.println("aprovado");

        } else if (nota >= 50) {
            System.out.println("recuperacao");
        } else {
            System.out.println("reprovado");
        }
    }
}
