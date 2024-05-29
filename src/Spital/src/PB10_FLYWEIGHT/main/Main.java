package PB10_FLYWEIGHT.main;

import PB10_FLYWEIGHT.classes.FlyweightFactory;
import PB10_FLYWEIGHT.classes.Salon;

public class Main {
    public static void main(String[] args) {
        Salon salon1 = new Salon(1,6,7);
        Salon salon2=new Salon(2,4,3);

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getPacient("Andrei;07222222;Strada Berzei").afiseazaDetalii(salon1);
        flyweightFactory.getPacient("Andrei;07222222;Strada Berzei").afiseazaDetalii(salon2);
        System.out.println(flyweightFactory.getNumarPacientiInregistrati());
    }
}
