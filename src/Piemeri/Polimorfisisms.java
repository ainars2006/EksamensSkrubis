package Piemeri;


class Virietis{
 void disk() {
     System.out.println("Es esmu vīrietis.");
 }
}

//Klase kas pārakstīs Cilveks klases metodi
class Tevs extends Virietis {

 // Pāraksta metodi (Overriding)
 @Override
 void disk() {
     System.out.println("Es esmu tēvs.");
 }
}

public class Polimorfisisms {
 public static void main(String[] args) {
	 Virietis p = new Tevs();
     p.disk();  
 }
}
