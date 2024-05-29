package PB6_FACADE.main;

import PB6_FACADE.classes.Facade;
import PB6_FACADE.classes.Pacient;
import PB6_FACADE.classes.Salon;

public class Main {
    public static void main(String[] args) {
        Facade facade=new Facade();
        Salon salonPlin = new Salon(4,0);
        Salon salonLiber = new Salon(0,4);
        Pacient pacient1 = new Pacient("Andrei",21,"stabila");
        Pacient pacient2 = new Pacient("Ion",55,"urgenta");
        Pacient pacient3 = new Pacient("Maria",47,"grava");
        Pacient pacient4 = new Pacient("Anton",30,"grava");
        Pacient pacient5 = new Pacient("Ana",31,"urgenta");
        Pacient pacient6 = new Pacient("Marius",25,"grava");
        Pacient pacient7 = new Pacient("Popescu",67,"urgenta");

        Pacient[] pactienti = {pacient1,pacient2,pacient3,pacient4,pacient5,pacient6,pacient7};

        facade.internarePacient(pacient1,salonPlin);

        for(Pacient pacient : pactienti)
        {
            facade.internarePacient(pacient,salonLiber);
            System.out.println(salonLiber);
        }

    }
}
