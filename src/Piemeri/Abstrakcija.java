package Piemeri;

//abstraktā klase ar abstraktām metodēm
abstract class Cilveks {
 abstract void ieslekt();
 abstract void izslekt();
}
class Pults extends Cilveks {
 @Override
 void ieslekt() {
     System.out.println("TV ir ieslekts.");
 }
 @Override
 void izslekt() {
     System.out.println("TV ir islekts.");
 }
}
//Main klase
public class Abstrakcija {
 public static void main(String[] args) {
     Cilveks remote = new Pults();
     remote.ieslekt();   
     remote.izslekt();  
 }
}
