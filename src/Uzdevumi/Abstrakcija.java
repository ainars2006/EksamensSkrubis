package Uzdevumi;

// Abstrakta klase
abstract class Transportlidzeklis {
    abstract void parvietoties();
}
// Auto klase, kas manto no Transportlidzeklis
class Auto extends Transportlidzeklis {
    @Override
    void parvietoties() {
        System.out.println("Brauc ar auto pa ceļu.");
    }
}
// Velosipēds klase, kas manto no Transportlidzeklis
class Velosipeds extends Transportlidzeklis {
    @Override
    void parvietoties() {
        System.out.println("Min pedāļus pa veloceliņu.");
    }
}
// Galvenā klase ar main metodi
public class Abstrakcija {
    public static void main(String[] args) {
        Velosipeds velo = new Velosipeds();
        velo.parvietoties();

        Auto auto = new Auto();
        auto.parvietoties();
    }
}
