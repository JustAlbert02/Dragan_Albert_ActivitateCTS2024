package EX1_BUILDER.main;

import EX1_BUILDER.classes.Pacient;
import EX1_BUILDER.classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientBuilder("Andrei")
                .setHalatInterior(true)
                .setPapuciDeCamera(true)
                .build();

        Pacient pacient2 = new PacientBuilder("Mihai")
                .setPatRabatabil(true)
                        .build();

        System.out.println(pacient1);
        System.out.println(pacient2);
    }
}