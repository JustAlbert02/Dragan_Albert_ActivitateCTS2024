package EX3_FACTORYMETHOD.classes;


import EX3_FACTORYMETHOD.factory.PersonalSpital;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        return "Brancardierul " + getNume() + " are salariul de " + getSalariu() + " euro";
    }
}