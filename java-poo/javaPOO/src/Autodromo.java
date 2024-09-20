//! O AUTODROMO
// * Classe pricipal onde os objetos são disparados

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();

        jeep.setChassi("897897");
        jeep.ligar();

        Moto ninja = new Moto();
        ninja.setChassi("101035");
        ninja.ligar();
    }
}
