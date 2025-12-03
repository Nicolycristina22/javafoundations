package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("digite uma palavra");
        String palavra = input.nextLine();
        ArrayList<String> palavras = new ArrayList<>();
        ArrayList<String> par = new ArrayList<>();
        ArrayList<String> impar = new ArrayList<>();

        palavras.add("banana");
        palavras.add("maca");
        palavras.add("abacate");
        palavras.add("manga");

        int comprimento1=0;
        int comprimento2=0;
        String buffer="";
        String buffer2="";
        for (int i = 0; i < palavras.size(); i++) {
            for (int j = 0; j < palavras.size(); j++) {
              if (i<j){
                  comprimento1=palavras.get(i).length();
                  comprimento2=palavras.get(i).length();

                  if(comprimento1>comprimento2){
                      buffer=palavras.get(i);
                      buffer2=palavras.get(j);
                      palavras.set(j,buffer);
                      palavras.set(i,buffer2);
                  }
              }
            }
        }

        for (String objetos : palavras) {
            int tamanho = objetos.length();
            int resto = tamanho % 2;
            if (resto == 0) {
                par.add(objetos);
            } else {
                impar.add(objetos);
            }
        }

        System.out.println(par);
        System.out.println(impar);
        System.out.println(comprimento1);
        System.out.println(comprimento2);
        System.out.println(buffer);

    }
}


























