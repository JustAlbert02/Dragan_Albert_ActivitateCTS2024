package EX2_SIMPLEFACTORY.classes;

import EX2_SIMPLEFACTORY.classes.factory.PersonalSpital;

public class Medic extends PersonalSpital {

    public Medic(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        return "Medicul " + getNume() + " are salariul de " + getSalariu() + " euro";
    }
}
