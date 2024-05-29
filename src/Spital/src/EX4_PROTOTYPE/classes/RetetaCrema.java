package EX4_PROTOTYPE.classes;

public class RetetaCrema implements RetetaAbstracta{
    private int cantitate;
    private String nume;

    public RetetaCrema()
    {
        this.cantitate=0;
        this.nume="N/A";
    }
    public RetetaCrema(int cantitate, String nume) {
        this.cantitate = cantitate;
        this.nume = nume;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RetetaCrema{");
        sb.append("cantitate=").append(cantitate);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public RetetaAbstracta clone() {
        RetetaCrema retetaCrema = new RetetaCrema();
        retetaCrema.setCantitate(this.cantitate);
        retetaCrema.setNume(this.nume);
        return retetaCrema;
    }
}
