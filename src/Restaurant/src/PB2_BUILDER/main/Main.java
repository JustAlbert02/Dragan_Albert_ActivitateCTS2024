package PB2_BUILDER.main;

import PB2_BUILDER.classes.Client;
import PB2_BUILDER.classes.builder.ClientBuilder;

public class Main {
    public static void main(String[] args) {
        Client client1 = new ClientBuilder("234","Popescu Ion")
                .setAsezareLaGeam(true)
                .setMuzicaAmbientalaPersonalizata(true)
                .build();
        System.out.println(client1);

    }
}
