package PB2_BUILDER.classes.builder;

import PB2_BUILDER.classes.Client;

public class ClientBuilder implements Builder{
    Client client;

    public ClientBuilder(String id, String nume)
    {
        client = new Client(id,nume);
    }

    public ClientBuilder setAsezareLaGeam(boolean esteAles)
    {
        client.setAsezareLaGeam(esteAles);
        return this;
    }

    public ClientBuilder setScauneErgonomice(boolean esteAles)
    {
        client.setScauneErgonomice(esteAles);
        return this;
    }

    public ClientBuilder setDecorareaMesei(boolean esteAles)
    {
        client.setDecorareaMesei(esteAles);
        return this;
    }

    public ClientBuilder setMuzicaAmbientalaPersonalizata(boolean esteAles)
    {
        client.setMuzicaAmbientalaPersonalizata(esteAles);
        return this;
    }

    public ClientBuilder setGenMuzica(boolean esteAles)
    {
        client.setMuzicaAmbientalaPersonalizata(esteAles);
        return this;
    }


    @Override
    public Client build() {
        return client;
    }
}
