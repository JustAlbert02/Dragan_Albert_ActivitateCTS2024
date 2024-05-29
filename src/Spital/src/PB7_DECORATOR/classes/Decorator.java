package PB7_DECORATOR.classes;

public class Decorator extends DecoratorAbstract{

    public Decorator(IRezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void printeazaRezultatNou()
    {
        System.out.print("[ONLINE] ->");
        super.printeazaRezultat();
    }
}
