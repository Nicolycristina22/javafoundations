package entidades;

public class Conta {
    private String nome;
    private String cpf;
    private double saldo;

    public Conta(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }


    public String getCpf() {
        return cpf;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.printf(" informe um valor valido");
        } else {
            this.nome = nome;
        }
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()){
            System.out.printf(" informe um valor valido");

        }else{
            this.cpf = cpf;
        }
    }

    public void depositar(double valor) {
        this.saldo += saldo;

    }
    public void sacar(double valor) {
        this.saldo -= saldo;
    }
}