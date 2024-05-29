package EX2_SIMPLEFACTORY.classes;

import EX2_SIMPLEFACTORY.classes.factory.PersonalSpital;

public class Asistent extends PersonalSpital {
    public Asistent(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        return "Asistentul " + getNume() + " are salariul de " + getSalariu() + " euro";
    }
}
