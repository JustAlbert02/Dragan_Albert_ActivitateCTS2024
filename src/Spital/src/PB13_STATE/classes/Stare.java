package PB13_STATE.classes;

public abstract class Stare {

    Pacient pacient;

    protected Stare(Pacient pacient) {
        this.pacient = pacient;
    }

    public abstract void actualizeazaStare();
}
