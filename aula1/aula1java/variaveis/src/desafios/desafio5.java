package desafios;

import java.util.Scanner;

public class desafio5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor do emprestimo ");
        double emprestimo = sc.nextDouble();
        System.out.println( " digite o numero de parcelas");
        int parcelas = sc.nextInt();
        double valorfinal;
        if (parcelas ==6 ){
            valorfinal = emprestimo * 1.05;
            System.out.println(valorfinal);
        } else if (parcelas == 12) {
            valorfinal = emprestimo * 1.20;
            System.out.println(valorfinal);
        }
    }
}
