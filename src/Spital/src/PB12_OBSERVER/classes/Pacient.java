package PB12_OBSERVER.classes;

public class Pacient implements Observer{

    String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }
    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Pacientul "+nume+ " a fost notificat: " + "\"" +mesaj +"\"");
    }
}
