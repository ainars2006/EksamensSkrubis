package Uzdevumi;
// Saskarne Izdrukajams ar vienu metodi, kas jārealizē visām klasēm kas to implementē
interface Izdrukajams {
    void izdrukat(); // Abstrakta metode bez ķermeņa
}
// Klase Gramata, kas realizē saskarni Izdrukajams
class Gramata implements Izdrukajams {
    @Override
    public void izdrukat() {
        System.out.println("Drukā grāmatu...");
    }
}
// Klase Avize, kas arī realizē saskarni Izdrukajams
class Avize implements Izdrukajams {
    @Override
    public void izdrukat() {
        System.out.println("Drukā avīzi...");
    }
}
//Main klase
public class Interface {
    public static void main(String[] args) {
        // Izveidojam mainīgos no tipa Izdrukajams, bet piešķiram dažādas klases
        Izdrukajams g = new Gramata();
        Izdrukajams a = new Avize();
        // Izsaucam metodes – katra klase izpilda savu versiju
        g.izdrukat();
        a.izdrukat();
    }
}
