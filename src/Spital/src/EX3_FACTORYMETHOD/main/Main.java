package EX3_FACTORYMETHOD.main;

import EX3_FACTORYMETHOD.factory.*;

public class Main {
    public static void main(String[] args) {
        FabricaMedic fabricaMedic = new FabricaMedic();
        FabricaAsistent fabricaAsistent = new FabricaAsistent();
        FabricaBrancardier fabricaBrancardier = new FabricaBrancardier();

        PersonalSpital[] personalSpital = {
                fabricaMedic.creazaPersonalSpital("Georgescu Mihai",5000),
                fabricaAsistent.creazaPersonalSpital("Andrescu Gheorghe",1000),
                fabricaBrancardier.creazaPersonalSpital("Doru Andrei",800),
                fabricaAsistent.creazaPersonalSpital("Ana Maria",1200)
        };
        for(PersonalSpital membru : personalSpital)
        {
            System.out.println(membru);
        }

    }
}
