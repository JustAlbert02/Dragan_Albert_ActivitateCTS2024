package PB1_FACTORYMETHOD.classes.factory;

import PB1_FACTORYMETHOD.classes.Supa;
import PB1_FACTORYMETHOD.classes.SupaDeLegume;

public class FactorySupaDeLegume implements FactorySupa{
    @Override
    public Supa creazaSupa() {
        return new SupaDeLegume();
    }
}
