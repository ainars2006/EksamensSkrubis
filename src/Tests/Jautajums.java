package Tests;

public abstract class Jautajums {
    protected String jautajums;
    protected String[] atbildes;
    protected int pareizaAtbilde;
    
    public Jautajums(String jautajums, String[] atbildes, int pareizaAtbilde) {
        this.jautajums = jautajums;
        this.atbildes = atbildes;
        this.pareizaAtbilde = pareizaAtbilde;
    }
    public String getJautajums() {
        return jautajums;
    }
    public String[] getAtbildes() {
        return atbildes;
    }
    public int getPareizaAtbilde() {
        return pareizaAtbilde;
    }
    public abstract boolean parbauditAtbildi(int lietotajaAtbilde);
}
