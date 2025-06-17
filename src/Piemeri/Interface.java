package Piemeri;

//Definē interface vārdu Forma
interface Forma {
 double aprLauk(); //Abstraktā metode apreiķina laukumu
}
//Izmanto mantošanu klasē Aplis 
class Aplis implements Forma {
 private double r;    // rādius
 public Aplis(double r) { 
   this.r = r; 
 }
 //Implementē abstrakto metodi
 public double aprLauk()
 {
     return Math.PI * r * r;
 }
}
//Implementē interface clasē taisnstūris
class Taisnsturis implements Forma {
 private double garums;
 private double platums;
 public Taisnsturis(double garums, double platums)
 {
     this.garums = garums;
     this.platums = platums;
 }
 //Implementē apstrakto metodi
 public double aprLauk() { 
   return garums * platums; 
 }
}
//Main klase
public class Interface {
 public static void main(String[] args)
 {
     //Izveido apļa un taisnstūra objektus
     Aplis a = new Aplis(5.0);
     Taisnsturis t = new Taisnsturis(4.0, 6.0);
     System.out.println("Apļa laukums: "+ a.aprLauk());
     System.out.println("Taisnstūra laukums: "+ t.aprLauk());
 }
}