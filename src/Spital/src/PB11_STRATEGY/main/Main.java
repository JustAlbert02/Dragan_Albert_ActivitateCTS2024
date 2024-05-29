package PB11_STRATEGY.main;


import PB11_STRATEGY.classes.Pacient;

import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws Exception {
        Pacient pacient1 = new Pacient("Andrei","card",300);
        pacient1.plateste();
    }
}
