package aula2;

import java.util.Scanner;

public class Texto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("voce esta gravida? s/n");
        String resposta = sc.nextLine();

        //comparacao texto
        if (resposta.equals("s") ){
            System.out.printf("ela nao vai pagar o trem");

        } else {
            System.out.printf("ela vai pagar o trem");
        }

        sc.close();
    }
}
