package Tests;

// Abstrakta klase Jautajums – pamats visiem jautājumu veidiem
public abstract class Jautajums {
    // Jautājuma teksts
    protected String jautajums;
    
    // Atbilžu varianti
    protected String[] atbildes;
    
    // Pareizās atbildes indekss
    protected int pareizaAtbilde;

    // Konstruktors
    public Jautajums(String jautajums, String[] atbildes, int pareizaAtbilde) {
        this.jautajums = jautajums;
        this.atbildes = atbildes;
        this.pareizaAtbilde = pareizaAtbilde;
    }
    // Getter metodes
    public String getJautajums() {
        return jautajums;
    }
    public String[] getAtbildes() {
        return atbildes;
    }
    public int getPareizaAtbilde() {
        return pareizaAtbilde;
    }
    // Abstrakta metode – jārealizē apakšklasēs
    public abstract boolean parbauditAtbildi(int lietotajaAtbilde);
}
