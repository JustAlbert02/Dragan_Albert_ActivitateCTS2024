package PB3_SIMPLEFACTORY.classes.factory;

import PB3_SIMPLEFACTORY.classes.*;

public class FactorySupa {

    public Supa creazaSupa(TipSupa tipSupa,int pret) throws Exception {
        switch (tipSupa)
        {
            case VITA:
            {
                return new SupaDeVita(pret);
            }
            case LEGUME:
            {
                return new SupaDeLegume(pret);
            }
            case CIPUERCI:
            {
                return new SupaDeCiuperci(pret);
            }
            default:
            {
                throw new Exception("Nu exista acest tip the supa");
            }
        }
    }
}
