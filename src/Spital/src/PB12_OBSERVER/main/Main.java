package PB12_OBSERVER.main;

import PB12_OBSERVER.classes.ISpital;
import PB12_OBSERVER.classes.Observer;
import PB12_OBSERVER.classes.Pacient;
import PB12_OBSERVER.classes.Spital;

public class Main {
    public static void main(String[] args) {
        Observer pacient1 = new Pacient("Andrei");
        Observer pacient2 = new Pacient("Ana");
        Observer pacient3 = new Pacient("Mihai");

        ISpital spital = new Spital();
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);
        spital.notificaAbonati("Primul virus a lovit orasul");
        System.out.println();
        spital.deaboneazaPacient(pacient3);
        spital.aboneazaPacient(pacient1);
        spital.notificaAbonati("Al doilea virus a lovit orasul");

    }
}
