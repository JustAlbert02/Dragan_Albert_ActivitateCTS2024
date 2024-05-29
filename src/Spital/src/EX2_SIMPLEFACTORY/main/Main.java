package EX2_SIMPLEFACTORY.main;

import EX2_SIMPLEFACTORY.classes.factory.FabricaPersonalSpital;
import EX2_SIMPLEFACTORY.classes.factory.PersonalSpital;
import EX2_SIMPLEFACTORY.classes.factory.TipPersonal;

public class Main {
    public static void main(String[] args) throws Exception{
        FabricaPersonalSpital fabrica = new FabricaPersonalSpital();
        PersonalSpital medic = fabrica.creazaPersonalSpital(TipPersonal.MEDIC,"Georgescu Mihai",5000);
        PersonalSpital brancardier = fabrica.creazaPersonalSpital(TipPersonal.BRANCARDIER,"Popescu Ion",800);
        PersonalSpital asistent = fabrica.creazaPersonalSpital(TipPersonal.ASISTENT,"Gheorghe Andrei",1000);

        System.out.println(medic);
        System.out.println(brancardier);
        System.out.println(asistent);

    }
}
