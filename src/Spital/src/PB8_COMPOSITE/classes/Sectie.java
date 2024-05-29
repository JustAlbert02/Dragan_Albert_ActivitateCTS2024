package PB8_COMPOSITE.classes;

public class Sectie implements INod{

    String denumireSectie;

    public Sectie(String denumireSectie) {
        this.denumireSectie = denumireSectie;
    }

    @Override
    public void afisaza() {
        System.out.print(denumireSectie+"; ");
    }

    @Override
    public void adaugaNod(INod sectie) throws Exception {
        throw new Exception("Sectia nu are subsectii!");

    }

    @Override
    public void stergeNod(String denumire) throws Exception {
        throw new Exception("Sectia nu are subsectii!");

    }

    @Override
    public INod getNod(String denumire) throws Exception {
        throw new Exception("Sectia nu are subsectii!");
    }
}
