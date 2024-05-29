package PB11_STRATEGY.classes;

public class Card implements ModPlata{
    @Override
    public void plateste(double sumaDeAchitat) {
        System.out.println("Suma de "+ sumaDeAchitat + " lei a fost achitata cu cardul");
    }
}
