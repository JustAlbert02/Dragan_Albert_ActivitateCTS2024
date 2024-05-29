package PB12_OBSERVER.classes;

public interface ISpital {
    void aboneazaPacient(Observer pacient);
    void deaboneazaPacient(Observer pacient);

    void notificaAbonati(String mesaj);
}
