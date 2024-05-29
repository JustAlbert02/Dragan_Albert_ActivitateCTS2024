package PB9_Proxy.classes;

public class PacientProxy implements IPacient{

    Pacient pacient;

    public PacientProxy(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void internare() {
        if(pacient.areAsigurareDeSanatate)
        {
            pacient.internare();
        }
        else
        {
            System.out.println("Pacientul nu poate fi internat fara asigurare de sanatate");
        }

    }
}
