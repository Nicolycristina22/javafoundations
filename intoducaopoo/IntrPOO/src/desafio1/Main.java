package desafio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Produto produto1 = new Produto();

        System.out.println("Digite o nome do produto ");
        produto1.nome = sc.nextLine();

        System.out.println("Digite o valor do produto ");
        produto1.preco = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite a quantidade do produto ");
        produto1.quantidade = sc.nextDouble();


        System.out.println(produto1.calculaTotal());

    }

}