package PB3_SIMPLEFACTORY.classes;

public class SupaDeLegume extends Supa{
    public SupaDeLegume(int pret) {
        super(pret);
    }

    @Override
    public String toString() {
        return "Supa de LEGUME costa " + getPret() +" lei";
    }
}
