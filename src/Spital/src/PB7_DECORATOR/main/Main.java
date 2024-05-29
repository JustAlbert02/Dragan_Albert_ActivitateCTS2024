package PB7_DECORATOR.main;

import PB7_DECORATOR.classes.Decorator;
import PB7_DECORATOR.classes.DecoratorAbstract;
import PB7_DECORATOR.classes.IRezultat;
import PB7_DECORATOR.classes.Rezultat;


public class Main {
    public static void main(String[] args) {
        IRezultat rezultatOffline = new Rezultat("Mihai",
                "Raceala","Coldrex miere si lamaie,Sirop de tuse, Apa de mare pentru nas, odihna",7);
        rezultatOffline.printeazaRezultat();

        DecoratorAbstract decorator = new Decorator(rezultatOffline);
        decorator.printeazaRezultatNou();
    }

}
