package PB13_STATE.classes;

public class Externat extends Stare{
    protected Externat(Pacient pacient) {
        super(pacient);
        System.out.println("Pacientul "+ pacient.nume +" a fost externat");
    }

    @Override
    public void actualizeazaStare() {
        System.out.println("Starea pacientului nu mai poate fi actualizata, acesta fiind deja externat");

    }
}
