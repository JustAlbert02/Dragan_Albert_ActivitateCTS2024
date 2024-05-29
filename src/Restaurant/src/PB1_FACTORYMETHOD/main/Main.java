package PB1_FACTORYMETHOD.main;

import PB1_FACTORYMETHOD.classes.Supa;
import PB1_FACTORYMETHOD.classes.factory.FactorySupaDeCiuperci;
import PB1_FACTORYMETHOD.classes.factory.FactorySupaDeLegume;
import PB1_FACTORYMETHOD.classes.factory.FactorySupaDeVita;


public class Main {
    public static void main(String[] args) {
        FactorySupaDeVita factorySupaDeVita = new FactorySupaDeVita();
        FactorySupaDeCiuperci factorySupaDeCiuperci = new FactorySupaDeCiuperci();
        FactorySupaDeLegume factorySupaDeLegume = new FactorySupaDeLegume();
        Supa[] supe = {
                factorySupaDeCiuperci.creazaSupa(),
                factorySupaDeLegume.creazaSupa(),
                factorySupaDeVita.creazaSupa()
        };
        for(Supa supa : supe){
            supa.afisazaSupa();
        }
    }
}
