package PB3_SIMPLEFACTORY.classes;

public class SupaDeCiuperci extends Supa{
    public SupaDeCiuperci(int pret) {
        super(pret);
    }

    @Override
    public String toString() {
        return "Supa de CIUPERCI costa "+ getPret() + " lei";
    }
}
