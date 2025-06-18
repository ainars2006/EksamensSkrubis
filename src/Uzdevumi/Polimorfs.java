package Uzdevumi;

class Dzivnieks {
    void skana() {
        System.out.println("Dzīvnieks izdod skaņu.");
    }
}
//Suns klase kas manto no Dzivnieks
class Suns extends Dzivnieks {
    @Override
    void skana() {
        System.out.println("Vau vau!");
    }
}
//Kakis klase kas manto no Dzivnieks
class Kakis extends Dzivnieks {
    @Override
    void skana() {
        System.out.println("Miau miau!");
    }
}
//Main klase
public class Polimorfs {
    public static void main(String[] args) {
        Dzivnieks[] dzivnieki = { new Suns(), new Kakis(), new Dzivnieks() };

        for (Dzivnieks d : dzivnieki) {
            d.skana(); // Polimorfisms: katrs objekts izpilda savu versiju
        }
    }
}
