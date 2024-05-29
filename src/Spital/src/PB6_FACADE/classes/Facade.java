package PB6_FACADE.classes;

public class Facade {
    public void internarePacient(Pacient pacient, Salon salon)
    {
        Medic medic = new Medic();
        medic.oferaConfirmarePacient(pacient);
        salon.ocupaPatLiber(pacient);
    }
}
