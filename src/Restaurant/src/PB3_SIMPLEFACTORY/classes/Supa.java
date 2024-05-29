package PB3_SIMPLEFACTORY.classes;

public abstract class Supa {
    private int pret;

    public Supa(int pret) {
        this.pret = pret;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public abstract String toString();
}
