package EX1_BUILDER.classes;

import EX1_BUILDER.interfaces.IBuilder;

public class PacientBuilder implements IBuilder {
    private Pacient pacient;

    public PacientBuilder(String nume)
    {
        pacient = new Pacient(nume,false,false,false,false);
    }

    public PacientBuilder setPatRabatabil(boolean optiuneAleasa)
    {
        pacient.setPatRabatabil(optiuneAleasa);
        return this;
    }

    public PacientBuilder setMicDejunInclus(boolean optiuneAleasa)
    {
        pacient.setMicDejunInclus(optiuneAleasa);
        return this;
    }

    public PacientBuilder setPapuciDeCamera(boolean optiuneAleasa)
    {
        pacient.setPapuciDeCamera(optiuneAleasa);
        return this;
    }

    public PacientBuilder setHalatInterior(boolean optiuneAleasa)
    {
        pacient.setHalatInterior(optiuneAleasa);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }
}
