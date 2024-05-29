package PB13_STATE.classes;

public class Internat extends Stare{
    protected Internat(Pacient pacient) {
        super(pacient);
        System.out.println("Pacientul "+ pacient.nume +" a fost internat");
    }

    @Override
    public void actualizeazaStare() {
        if(pacient.situatieGrava)
        {
            System.out.println("Pacientul "+pacient.nume+" este in stare grava si va fi pus sub observatie");
            pacient.stare=new SubObservatie(pacient);
        }
        else
        {
            System.out.println("Pacientul "+pacient.nume+" este in stare stabila si va fi externat");
            pacient.stare=new Externat(pacient);
        }

    }
}
