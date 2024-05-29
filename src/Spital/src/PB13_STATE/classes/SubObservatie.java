package PB13_STATE.classes;

public class SubObservatie extends Stare{
    protected SubObservatie(Pacient pacient) {
        super(pacient);
        System.out.println("Pacientul "+ pacient.nume +" a fost pus sub observatie.");
    }

    @Override
    public void actualizeazaStare() {
        pacient.situatieGrava=false;
        System.out.println("Pacientul "+ pacient.nume +" s-a vindecat si va fi externat");
        pacient.stare=new Externat(pacient);
    }
}
