package desafios;

import java.util.Scanner;

public class desafio6 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite o valor gasto");
        double valorgasto = input.nextDouble();
        System.out.println("digite o metodo de pagamento");
        System.out.println(" 1- dinheiro/pix 10%");
        System.out.println(" 2- debito 5%");
        System.out.println("3- credito ");
        int metodo = input.nextInt();

        switch (metodo) {
            case 1:
                valorgasto = (valorgasto * 0.9) - valorgasto;
                System.out.println(valorgasto);
                break;
            case 2:
                valorgasto = (valorgasto * 0.95) - valorgasto;
                System.out.println(valorgasto);
                break;
            case 3:
                System.out.println("4- credito a vista ");
                System.out.println("5- credito parc 2x 5%");
                System.out.println("6- credito parc 3x 10%");
                int credit = input.nextInt();


            switch (credit) {
                case 1:
                    System.out.println(valorgasto);
                    break;



                case 2:
                    valorgasto = (valorgasto * 1.05/2) - valorgasto;
                    break;
                default:
                    valorgasto = valorgasto - valorgasto + 1.11/3;
            System.out.println(valorgasto);

            }


        }

    }
}
