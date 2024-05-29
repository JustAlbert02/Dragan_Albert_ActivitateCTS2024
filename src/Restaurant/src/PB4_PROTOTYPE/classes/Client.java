package PB4_PROTOTYPE.classes;

import java.time.LocalDate;

public class Client implements IClient {
    String id;
    String nume;

    LocalDate dataRezervare;

    public Client(String id, String nume, LocalDate dataRezervare) {
        this.id = id;
        this.nume = nume;
        this.dataRezervare = dataRezervare;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", nume='" + nume + '\'' +
                ", dataRezervare=" + dataRezervare +
                '}';
    }

    @Override
    public IClient copiaza() {
        Client copieClient = new Client(this.id, this.nume,
                LocalDate.of(dataRezervare.getYear(), dataRezervare.getMonth(), dataRezervare.getDayOfMonth())
        );
        return copieClient;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setDataRezervare(LocalDate dataRezervare) {
        this.dataRezervare = dataRezervare;
    }
}
