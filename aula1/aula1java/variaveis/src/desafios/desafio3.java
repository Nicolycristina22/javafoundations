package desafios;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
         int num = (int) (Math.random()*10);

         Scanner sc = new Scanner(System.in);
        System.out.println( "digite um valor" );
        double valor = sc.nextDouble();
        if (valor == num){
            System.out.println("voce acertou");
        } else {
            System.out.println("errou " + num );
        }

    }
}
