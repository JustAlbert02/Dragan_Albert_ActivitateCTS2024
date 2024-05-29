package EX3_FACTORYMETHOD.factory;

import EX3_FACTORYMETHOD.classes.Medic;

public class FabricaMedic implements FabricaPersonalSpital{
    @Override
    public PersonalSpital creazaPersonalSpital(String nume, int salariu) {
        return new Medic(nume,salariu);
    }
}
