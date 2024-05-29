package PB1_FACTORYMETHOD.classes.factory;

import PB1_FACTORYMETHOD.classes.Supa;
import PB1_FACTORYMETHOD.classes.SupaDeCiuperci;

public class FactorySupaDeCiuperci implements FactorySupa{
    @Override
    public Supa creazaSupa() {
        return new SupaDeCiuperci();
    }
}
