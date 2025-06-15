package Tests;

public class VairakAtbilzJaut extends Jautajums {
    public VairakAtbilzJaut(String jaut, String[] atb, int par) {
        super(jaut, atb, par);
    }
    @Override
    public boolean parbauditAtbildi(int lietotajaAtbilde) {
        return lietotajaAtbilde == pareizaAtbilde;
    }
}