package PB2_BUILDER.classes;

public class Client {
    String id;
    String nume;

    boolean asezareLaGeam;
    boolean scauneErgonomice;
    boolean decorareaMesei;
    boolean muzicaAmbientalaPersonalizata;
    boolean genMuzica;

    public Client(String id, String nume)
    {
        this.id=id;
        this.nume=nume;
        asezareLaGeam=false;
        scauneErgonomice=false;
        decorareaMesei=false;
        muzicaAmbientalaPersonalizata=false;
        genMuzica=false;
    }

    public void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorareaMesei(boolean decorareaMesei) {
        this.decorareaMesei = decorareaMesei;
    }

    public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
    }

    public void setGenMuzica(boolean genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", nume='" + nume + '\'' +
                ", asezareLaGeam=" + asezareLaGeam +
                ", scauneErgonomice=" + scauneErgonomice +
                ", decorareaMesei=" + decorareaMesei +
                ", muzicaAmbientalaPersonalizata=" + muzicaAmbientalaPersonalizata +
                ", genMuzica=" + genMuzica +
                '}';
    }
}
