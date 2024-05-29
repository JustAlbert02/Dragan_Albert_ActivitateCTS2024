package EX1_BUILDERv2.classes;

public class Pacient {
    private String nume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatInterior;

    Pacient(String nume, boolean patRabatabil, boolean micDejunInclus, boolean papuciDeCamera, boolean halatInterior) {
        this.nume = nume;
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciDeCamera = papuciDeCamera;
        this.halatInterior = halatInterior;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", patRabatabil=").append(patRabatabil);
        sb.append(", micDejunInclus=").append(micDejunInclus);
        sb.append(", papuciDeCamera=").append(papuciDeCamera);
        sb.append(", halatInterior=").append(halatInterior);
        sb.append('}');
        return sb.toString();
    }

    public static class PacientBuilder implements Builder {

        private String nume;
        private boolean patRabatabil;
        private boolean micDejunInclus;
        private boolean papuciDeCamera;
        private boolean halatInterior;

        public PacientBuilder()
        {
            this.nume = "N/A";
            this.patRabatabil = false;
            this.micDejunInclus = false;
            this.papuciDeCamera = false;
            this.halatInterior = false;
        }

        public PacientBuilder setNume(String nume) {
            this.nume = nume;
            return this;
        }

        public PacientBuilder setPatRabatabil(boolean optiuneAleasa)
        {
            this.patRabatabil=optiuneAleasa;
            return this;
        }

        public PacientBuilder setMicDejunInclus(boolean optiuneAleasa)
        {
            this.micDejunInclus=optiuneAleasa;
            return this;
        }

        public PacientBuilder setPapuciDeCamera(boolean optiuneAleasa)
        {
            this.papuciDeCamera=optiuneAleasa;
            return this;
        }

        public PacientBuilder setHalatInterior(boolean optiuneAleasa)
        {
            this.halatInterior=optiuneAleasa;
            return this;
        }

        @Override
        public Pacient build() {
            return new Pacient(nume,patRabatabil,micDejunInclus,papuciDeCamera,halatInterior);
        }
    }

}
