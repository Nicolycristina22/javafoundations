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
}import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Desafio 05: Palavras de Comprimento Par ou Ímpar.
 * Ordena palavras pelo comprimento e separa-as por paridade de comprimento.
 */
public class Desafio05 {

    public static void main(String[] args) {
        // Lista de palavras para o desafio (simulando a entrada do usuário)
        List<String> palavrasEntrada = Arrays.asList("Java", "Python", "App", "Aplicação", "C", "Cobol", "Web");

        System.out.println("\n--- Desafio 05: Paridade e Ordenação de Palavras ---");
        System.out.println("Palavras inseridas: " + palavrasEntrada);
        
        // 1. Ordena as palavras pelo comprimento (do menor para o maior).
        List<String> palavrasOrdenadas = palavrasEntrada.stream()
            .sorted(Comparator.comparingInt(String::length))
            .collect(Collectors.toList());

        // 2. Filtra as palavras por comprimento par
        List<String> palavrasComprimentoPar = palavrasOrdenadas.stream()
            .filter(palavra -> palavra.length() % 2 == 0)
            .collect(Collectors.toList());

        // 3. Filtra as palavras por comprimento ímpar
        List<String> palavrasComprimentoImpar = palavrasOrdenadas.stream()
            .filter(palavra -> palavra.length() % 2 != 0)
            .collect(Collectors.toList());

        System.out.println("Palavras ordenadas por comprimento: " + palavrasOrdenadas);
        System.out.println("Palavras com comprimento par: " + palavrasComprimentoPar);
        System.out.println("Palavras com comprimento ímpar: " + palavrasComprimentoImpar);
    }
}


}








