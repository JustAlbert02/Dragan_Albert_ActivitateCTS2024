package PB6_FACADE.classes;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    List<String> paturi;
    int nrPaturiOcupate;
    int nrPaturiLibere;

    public Salon(int nrPaturiOcupate, int nrPaturiLibere) {
        paturi = new ArrayList<>();
        for (int i = 0; i < nrPaturiLibere; i++) {
            paturi.add("liber");
        }
        for (int i = 0; i < nrPaturiOcupate; i++) {
            paturi.add("ocupat");
        }
    }

    public void ocupaPatLiber(Pacient pacient) {
        if (!paturi.get(0).equals("liber")) {
            System.out.println("Toate paturile din salon sunt ocupate");
            return;
        }
        if (!pacient.confirmareMedicPentruInternare) {
            System.out.println("Pacientul nu are confirmare pentru internare");
            return;
        }
        paturi.remove(0);
        paturi.add("ocupat");
        nrPaturiLibere--;
        nrPaturiOcupate++;
        System.out.println(pacient + " a ocupat un pat in salon");
    }

    @Override
    public String toString() {
        return paturi.toString();
    }
}
