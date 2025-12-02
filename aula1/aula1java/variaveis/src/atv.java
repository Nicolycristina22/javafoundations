import java.util.Scanner;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma =0;
        int [] notas = new int[10];
        for(int i = 0; i < notas.length; i++){
        System.out.println( "digite a nota de 10 alunos");
         notas [1]= sc.nextInt();
         soma += notas[i];
        }
         for (int nota: notas){
             System.out.println(nota);
         }
             double media = soma/notas.length;
         System.out.println(" media" +media);
        }



