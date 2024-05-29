package EX1_BUILDERv2.main;


import EX1_BUILDERv2.classes.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient.PacientBuilder pacientBuilder = new Pacient.PacientBuilder();

        Pacient pacient = pacientBuilder
                .setNume("Mircea")
                .setMicDejunInclus(true)
                .setPatRabatabil(true)
                .setPapuciDeCamera(true)
                .setHalatInterior(true)
                .build();

        System.out.println(pacient);

        Pacient pacient2=pacientBuilder.setNume("Andrei").build();
        System.out.println(pacient2);
        System.out.println(pacient);




    }
}
