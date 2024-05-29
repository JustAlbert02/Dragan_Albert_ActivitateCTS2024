package PB1_FACTORYMETHOD.classes.factory;

import PB1_FACTORYMETHOD.classes.Supa;
import PB1_FACTORYMETHOD.classes.SupaDeVita;

public class FactorySupaDeVita implements FactorySupa{
    @Override
    public Supa creazaSupa() {
        return new SupaDeVita();
    }
}
