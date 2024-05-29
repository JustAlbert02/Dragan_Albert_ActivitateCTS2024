package PB11_STRATEGY.classes;

public class Pacient {
    String nume;
    ModPlata modPlata;
    double sumaDeAchitat;

    public Pacient(String nume, String modAles, double sumaDeAchitat) throws Exception{
        this.nume = nume;
        this.sumaDeAchitat=sumaDeAchitat;
        if(modAles.equals("card"))
        {
            modPlata = new Card();
        }
        else if(modAles.equals("cash"))
        {
            modPlata=new Cash();
        }
        else
        {
            throw new Exception("plata poate fi realizata doar prin cash sau card!");
        }
    }

    public void plateste()
    {
        System.out.print(nume+" achita suma de plata pentru internare...");
        modPlata.plateste(sumaDeAchitat);
    }
}
