package EX3_FACTORYMETHOD.classes;


import EX3_FACTORYMETHOD.factory.PersonalSpital;

public class Medic extends PersonalSpital {

    public Medic(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        return "Medicul " + getNume() + " are salariul de " + getSalariu() + " euro";
    }
}