package PB7_DECORATOR.classes;

public abstract class DecoratorAbstract implements IRezultat {

    IRezultat rezultat;

    public DecoratorAbstract(IRezultat rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public void printeazaRezultat() {
        rezultat.printeazaRezultat();
    }

    public abstract void printeazaRezultatNou();
}
