package Tests;

// Vairākatbilžu jautājuma klase, kas paplašina abstrakto Jautajums
public class VairakAtbilzJaut extends Jautajums {
    public VairakAtbilzJaut(String jaut, String[] atb, int par) {
        super(jaut, atb, par);
    }
    // Realizē abstrakto metodi – pārbauda, vai lietotāja atbilde ir pareiza
    @Override
    public boolean parbauditAtbildi(int lietotajaAtbilde) {
        return lietotajaAtbilde == pareizaAtbilde;
    }
}