package desafios;

import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();
        System.out.println("digite a moeda que deseja converter");
        String moeda = sc.next();
        if (moeda.equals("dolar")){
            valor = valor * 0.20;
            System.out.println(valor);
        }
    }
}
