package PB13_STATE.classes;

public class Pacient {
    String nume;
    boolean situatieGrava;

    Stare stare;

    public Pacient(String nume, boolean situatieGrava) {
        this.nume = nume;
        this.situatieGrava = situatieGrava;
        stare = new Internat(this);
    }

    public Stare getStare() {
        return stare;
    }
}
