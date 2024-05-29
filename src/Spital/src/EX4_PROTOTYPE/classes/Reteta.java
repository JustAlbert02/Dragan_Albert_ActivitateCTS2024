package EX4_PROTOTYPE.classes;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements RetetaAbstracta{
    private Map<String,Double> solutii;
    private String numeMedicament;

    public Reteta()
    {
        solutii=null;
        numeMedicament="N/A";
    }
    public Reteta(Map<String, Double> solutii, String numeMedicament) {
        this.solutii = solutii;
        this.numeMedicament = numeMedicament;
    }

    public Map<String, Double> getSolutii() {
        return solutii;
    }

    public void setSolutii(Map<String, Double> solutii) {
        this.solutii=new HashMap<>();
        for(String solutie : solutii.keySet())
        {
            this.solutii.put(solutie,solutii.get(solutie));
        }
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    @Override
    public RetetaAbstracta clone() {
        Reteta clonaReteta = new Reteta();
        clonaReteta.setSolutii(this.solutii);
        clonaReteta.setNumeMedicament(this.numeMedicament);
        return clonaReteta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("solutii=").append(solutii);
        sb.append(", numeMedicament='").append(numeMedicament).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
