package PB3_SIMPLEFACTORY.main;

import PB3_SIMPLEFACTORY.classes.Supa;
import PB3_SIMPLEFACTORY.classes.TipSupa;
import PB3_SIMPLEFACTORY.classes.factory.FactorySupa;

public class Main {

    public static void main(String[] args) throws Exception{
        FactorySupa fabricaSupe = new FactorySupa();
        Supa supaC = fabricaSupe.creazaSupa(TipSupa.CIPUERCI,8);
        Supa supaL = fabricaSupe.creazaSupa(TipSupa.LEGUME,10);
        Supa supaV = fabricaSupe.creazaSupa(TipSupa.VITA,15);

        System.out.println(supaC);
        System.out.println(supaL);
        System.out.println(supaV);

    }
}
