import Desafio1.Carro;


public class Main {
    public static void main(String[] args) {
        Carro car = new Carro(" celta ", 2005, 180 );
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        System.out.println(car.getVelocidadeMaxima());

        car.setAno(2000);
        System.out.println("novo ano " + car.getAno());

        car.setVelocidadeMaxima(80);
        System.out.println("nova veloc "+ car.getVelocidadeMaxima());

        car.setModelo("fusca");
        System.out.println(car.getModelo());
    }


}