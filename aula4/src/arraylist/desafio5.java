package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("digite uma palavra");
        String palavra = input.nextLine();

        if (palavra.length() % 2 == 0) {
            ArrayList<String> par = new ArrayList<>();
            par.add(palavra);
            System.out.printf(palavra);

        }else {
            ArrayList<String> impar = new ArrayList<>();
           impar.add(palavra);
            System.out.printf(palavra);
    }
}
}








