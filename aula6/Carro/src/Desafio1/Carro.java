package Desafio1;

public class Carro {
    private String modelo;
    private int ano;
    private double velocidadeMaxima;

    public Carro(String modelo, int ano, double velocidadeMaxima) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        if (velocidadeMaxima <=0 ) {
            System.out.printf("digite um valor maior que zero");
        }else {
            this.velocidadeMaxima = velocidadeMaxima;
        }

    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 1886 && ano <= 2026) {
            this.ano = ano;
        } else {
            System.out.println(" ano invalido ");
        }
    }


    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return
                "modelo = '" + modelo + '\'' +
                ", ano = " + ano +
                ", velocidadeMaxima = " + velocidadeMaxima ;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            System.out.println("modelo invalido");
        } else {
            this.modelo = modelo;
        }


    }

}

