package EX2_SIMPLEFACTORY.classes.factory;

import EX2_SIMPLEFACTORY.classes.Asistent;
import EX2_SIMPLEFACTORY.classes.Brancardier;
import EX2_SIMPLEFACTORY.classes.Medic;

public class FabricaPersonalSpital {
    PersonalSpital personalSpital;

    public PersonalSpital creazaPersonalSpital(TipPersonal tipPersonal, String nume, int salariu) throws Exception
    {

        switch (tipPersonal) {
            case ASISTENT: {
                personalSpital = new Asistent(nume,salariu);
                return personalSpital;
            }
            case BRANCARDIER: {
                personalSpital = new Brancardier(nume, salariu);
                return personalSpital;
            }
            case MEDIC:{
                personalSpital = new Medic(nume,salariu);
                return personalSpital;
            }
            default:{
                throw new Exception("TIP PERSONAL INEXISTENT");
            }
        }


    }

}
