package PB3_SIMPLEFACTORY.classes;

public class SupaDeVita extends Supa{
    public SupaDeVita(int pret) {
        super(pret);
    }

    @Override
    public String toString() {
        return "Supa de VITA costa "+ getPret()+ " lei";
    }
}
