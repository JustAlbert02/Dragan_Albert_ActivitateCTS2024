package EX4_PROTOTYPE.main;

import EX4_PROTOTYPE.classes.Reteta;
import EX4_PROTOTYPE.classes.RetetaAbstracta;
import EX4_PROTOTYPE.classes.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Double> solutii = new HashMap<>();
        solutii.put("solutie1",21.0);
        solutii.put("solutie2",23.4);
        Reteta prototip = new Reteta(solutii,"Medicament1");

        RetetaAbstracta reteta2=prototip.clone();
        System.out.println(reteta2);

        RetetaCrema retetaCremaPrototip = new RetetaCrema(43,"Galbenele");
        RetetaAbstracta retetaCrema2 = retetaCremaPrototip.clone();
        ((RetetaCrema) retetaCrema2).setCantitate(22);

        System.out.println(retetaCremaPrototip);
        System.out.println(retetaCrema2);

    }
}
