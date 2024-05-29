package PB4_PROTOTYPE.main;

import PB4_PROTOTYPE.classes.Client;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Client clientOriginal = new Client("1","Ion Andrei",LocalDate.of(2024,2,15));
        Client clientNou = (Client) clientOriginal.copiaza();        clientNou.setId("2");
        clientNou.setNume("Gigel Marcu");
        clientNou.setDataRezervare(LocalDate.of(2024,3,18));

        System.out.println(clientOriginal);
        System.out.println(clientNou);


    }
}
