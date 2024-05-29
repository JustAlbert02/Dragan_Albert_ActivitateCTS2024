package PB9_Proxy.classes;

public class Pacient implements IPacient{

    String nume;
    int varsta;

    boolean areAsigurareDeSanatate;

    public Pacient(String nume, int varsta, boolean areAsigurareDeSanatate) {
        this.nume = nume;
        this.varsta = varsta;
        this.areAsigurareDeSanatate = areAsigurareDeSanatate;
    }

    @Override
    public void internare() {
        System.out.println("Pacientul " + nume + " cu varsta de "+ varsta + " ani " +
                (areAsigurareDeSanatate ? "cu " : "fara ")+"asigurare de sanatate a fost internat");

    }
}
