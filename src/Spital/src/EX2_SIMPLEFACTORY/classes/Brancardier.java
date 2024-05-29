package EX2_SIMPLEFACTORY.classes;

import EX2_SIMPLEFACTORY.classes.factory.PersonalSpital;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        return "Brancardierul " + getNume() + " are salariul de " + getSalariu() + " euro";
    }
}
