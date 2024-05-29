package PB10_FLYWEIGHT.classes;

public class Pacient implements IPacient {

    String codPacient;
    String nume;
    String numarDeTelefon;
    String adresa;

    public Pacient(String nume, String numarDeTelefon, String adresa) {
        this.nume = nume;
        this.numarDeTelefon = numarDeTelefon;
        this.adresa = adresa;
        codPacient=nume+";"+numarDeTelefon+";"+adresa;
    }

    public Pacient(String codPacient) {
        this.codPacient=codPacient;
        String[] codImpartit=codPacient.split(";");
        this.nume=codImpartit[0];
        this.numarDeTelefon=codImpartit[1];
        this.adresa =codImpartit[2];
    }

    @Override
    public void afiseazaDetalii(Salon salon) {

        System.out.println("Pacientul "+nume+ " cu numarul de telefon "+numarDeTelefon+" locuieste pe "+adresa+
                ". Acesta a fost internat in salonul cu numarul "+salon.nrSalon+ " ce are "+salon.nrPat+" paturi. Pacientul va fi interant "+
                salon.nrZileSpitalizare + " zile.");

    }
}
