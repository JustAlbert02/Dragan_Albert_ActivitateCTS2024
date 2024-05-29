package PB6_FACADE.classes;

public class Pacient {
    String nume;
    int varsta;
    String gravitate;

    boolean confirmareMedicPentruInternare;

    public Pacient(String nume, int varsta, String gravitate) {
        this.nume = nume;
        this.varsta = varsta;
        this.gravitate = gravitate;
        this.confirmareMedicPentruInternare = false;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getGravitate() {
        return gravitate;
    }

    public boolean isConfirmareMedicPentruInternare() {
        return confirmareMedicPentruInternare;
    }

    void setConfirmareMedicPentruInternare(boolean confirmareMedicPentruInternare) {
        this.confirmareMedicPentruInternare = confirmareMedicPentruInternare;
    }

    @Override
    public String toString() {
        return "Pacientul/a " + nume + " cu varsta de " + varsta + " de ani in stare " + gravitate +
                (confirmareMedicPentruInternare ? " cu " : " fara ") + "confirmare pentru internare";
    }
}
