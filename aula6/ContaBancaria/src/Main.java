import entidades.Conta;

public class Main {
    public static void main(String[] args) {
        Conta enzo = new Conta("enzo", "1234567891" );
        System.out.printf(enzo.getNome());
        System.out.printf(enzo.getCpf());
        System.out.print(enzo.getSaldo());

        enzo.setNome(" enzoo ");
        System.out.printf(enzo.getNome());
        enzo.setCpf(" 12345678913 ");
        System.out.printf(enzo.getCpf());

        enzo.depositar(1000);
        enzo.sacar(200);
        System.out.print(" saldo" + enzo.getSaldo());
    }

}
