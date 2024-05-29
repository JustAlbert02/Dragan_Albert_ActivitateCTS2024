package PB4_PROTOTYPE.classes;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements IReteta{
    private List<Integer> cantitatiSolutie = new ArrayList<>();

    public Reteta(int cantitateSolutie) {
        cantitatiSolutie.add(cantitateSolutie);
    }
    public Reteta(int[] cantitatiSolutie)
    {
        for(int cantitateSolutie : cantitatiSolutie)
        {
            this.cantitatiSolutie.add(cantitateSolutie);
        }
    }

    public Reteta(List<Integer> cantitatiSolutie){
        cantitatiSolutie.forEach(cantitateSolutie -> this.cantitatiSolutie.add(cantitateSolutie));
    }

    public Reteta(Reteta r)
    {
        for(int cantitateSolutie : r.cantitatiSolutie)
        {
            this.cantitatiSolutie.add(cantitateSolutie);
        }
    }

    public void adaugaCantitate(int cantitateSolutie)
    {
        this.cantitatiSolutie.add(cantitateSolutie);
    }

    public void modificaCantitate(int index, int cantitateSolutie) {
        this.cantitatiSolutie.set(index,cantitateSolutie);
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "cantitatiSolutie=" + cantitatiSolutie +
                '}';
    }

    @Override
    public IReteta copiaza() {
        return new Reteta(cantitatiSolutie);
    }
}
