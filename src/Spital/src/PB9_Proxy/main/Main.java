package PB9_Proxy.main;

import PB9_Proxy.classes.Pacient;
import PB9_Proxy.classes.PacientProxy;


public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Ana",28,true);
        Pacient pacient2 = new Pacient("Andrei",24,false);

        pacient1.internare();
        pacient2.internare();

        PacientProxy proxy = new PacientProxy(pacient1);
        proxy.internare();
        proxy = new PacientProxy(pacient2);
        proxy.internare();
    }
}
