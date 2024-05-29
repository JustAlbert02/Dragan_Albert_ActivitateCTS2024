package EX3_FACTORYMETHOD.factory;

import EX3_FACTORYMETHOD.classes.Asistent;

public class FabricaAsistent implements FabricaPersonalSpital{
    @Override
    public PersonalSpital creazaPersonalSpital(String nume, int salariu) {
        return new Asistent(nume,salariu);
    }
}
