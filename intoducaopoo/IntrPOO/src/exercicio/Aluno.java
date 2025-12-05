package exercicio;

import java.util.Scanner;

public class Aluno {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        double nota = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite sua idade: ");
        double nota2 = sc.nextDouble();
        sc.nextLine();

        double media = (nota + nota2) / 2;

        System.out.println(media);


    }

}
