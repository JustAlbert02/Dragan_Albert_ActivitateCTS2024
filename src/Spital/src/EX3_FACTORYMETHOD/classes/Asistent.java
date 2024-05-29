package EX3_FACTORYMETHOD.classes;
import EX3_FACTORYMETHOD.factory.PersonalSpital;

public class Asistent extends PersonalSpital {
    public Asistent(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        return "Asistentul " + getNume() + " are salariul de " + getSalariu() + " euro";
    }
}
