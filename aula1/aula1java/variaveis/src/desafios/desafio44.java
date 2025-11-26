package desafios;

import java.util.Scanner;

public class desafio44 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("informe o valor");
        double reais = input.nextDouble();

        System.out.println(" informe a moeda 1 dolar / 2euro  / 3 libra");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                double dolar = reais * 0.20;
                System.out.println( dolar);
                break;

                case 2:
                    double euro = reais * 0.18;
                    System.out.println(euro);
                    break;

                    case 3:
                        double libra = reais * 0.15;
                        System.out.println(libra);

            default:
                System.out.println("opcao invalida");
                break;
        }
    }
}
