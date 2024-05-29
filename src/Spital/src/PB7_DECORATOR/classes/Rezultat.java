package PB7_DECORATOR.classes;

public class Rezultat implements IRezultat {

    String numePacient;
    String diagnostic;
    String tratament;

    int nrZileTratament;

    public Rezultat(String numePacient, String diagnostic, String tratament, int nrZileTratament) {
        this.numePacient = numePacient;
        this.diagnostic = diagnostic;
        this.tratament = tratament;
        this.nrZileTratament = nrZileTratament;
    }

    @Override
    public void printeazaRezultat() {
        System.out.println("Pacientul "+ numePacient + " diagnosticat cu " +diagnostic+ " are ca tramtament: "+
                 tratament + " timp de " + nrZileTratament +" zile");
    }
}
