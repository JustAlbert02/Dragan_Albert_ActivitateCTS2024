package PB12_OBSERVER.classes;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{

    private List<Observer> pacienti;

    public Spital() {
        this.pacienti = new ArrayList<>();
    }

    @Override
    public void aboneazaPacient(Observer pacient) {
        pacienti.add(pacient);
    }

    @Override
    public void deaboneazaPacient(Observer pacient) {
        pacienti.remove(pacient);
    }

    @Override
    public void notificaAbonati(String mesaj) {
        pacienti.forEach(pacient -> pacient.primesteNotificare(mesaj));
    }
}
