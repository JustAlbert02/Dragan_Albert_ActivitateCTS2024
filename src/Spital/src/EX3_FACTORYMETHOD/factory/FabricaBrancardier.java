package EX3_FACTORYMETHOD.factory;

import EX3_FACTORYMETHOD.classes.Brancardier;

public class FabricaBrancardier implements FabricaPersonalSpital{
    @Override
    public PersonalSpital creazaPersonalSpital(String nume, int salariu) {
        return new Brancardier(nume,salariu);
    }
}
