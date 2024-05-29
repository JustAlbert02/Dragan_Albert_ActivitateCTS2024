package PB8_COMPOSITE.classes;

import java.util.ArrayList;
import java.util.List;

public class Departament implements INod{

    String denumireDepartament;
    List<INod> sectii;

    public Departament(String denumireDepartament) {
        this.denumireDepartament = denumireDepartament;
        sectii = new ArrayList<>();
    }

    @Override
    public void afisaza() {
        System.out.print(denumireDepartament + " are: ");
        if(sectii.isEmpty())
        {
            System.out.print("nici o sectie");
        }
        else
        {
            sectii.forEach(INod::afisaza);
        }
        System.out.println();
    }

    @Override
    public void adaugaNod(INod sectie) throws Exception {
        sectii.add(sectie);
    }

    @Override
    public void stergeNod(String denumire) throws Exception {
        INod nodDeSters = getNod(denumire);
        sectii.remove(nodDeSters);
    }

    @Override
    public INod getNod(String denumire) throws Exception {
        for(INod sectie : sectii)
        {
            if(((Sectie)sectie).denumireSectie.equals(denumire))
            {
                return sectie;
            }
        }
        throw new Exception("Sectia nu exista!");
    }
}
