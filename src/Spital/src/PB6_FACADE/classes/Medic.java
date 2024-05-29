package PB6_FACADE.classes;

public class Medic {
    public void oferaConfirmarePacient(Pacient pacient)
    {
        if(pacient.gravitate.equals("grava") ||pacient.gravitate.equals("urgenta"))
        {
            pacient.confirmareMedicPentruInternare=true;
        }
    }
}
