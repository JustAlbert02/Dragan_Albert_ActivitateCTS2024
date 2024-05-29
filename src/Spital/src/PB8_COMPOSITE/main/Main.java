package PB8_COMPOSITE.main;

import PB8_COMPOSITE.classes.Departament;
import PB8_COMPOSITE.classes.INod;
import PB8_COMPOSITE.classes.Sectie;

public class Main{
    public static void main(String[] args)  throws Exception{
        INod departamentGeneral = new Departament("Departament general");
        departamentGeneral.afisaza();
        departamentGeneral.adaugaNod(new Sectie("Sectia 1"));
        departamentGeneral.adaugaNod(new Sectie("Sectia 2"));
        departamentGeneral.adaugaNod(new Sectie("Sectia 3"));
        departamentGeneral.afisaza();
        departamentGeneral.stergeNod("Sectia 2");
        departamentGeneral.afisaza();
        INod sectia1 = departamentGeneral.getNod("Sectia 1");
        sectia1.afisaza();
        System.out.println();
        //sectia1.adaugaNod(new Sectie("Sectia 404")); //OK

        INod departamentPsihiatrie = new Departament("Departament psihiatrie");
        departamentPsihiatrie.adaugaNod(new Sectie("Sectia P1"));
        departamentPsihiatrie.adaugaNod(new Sectie("Sectia P2"));
        departamentPsihiatrie.afisaza();
        //departamentPsihiatrie.stergeNod("Sectia P3"); //OK
    }
}
