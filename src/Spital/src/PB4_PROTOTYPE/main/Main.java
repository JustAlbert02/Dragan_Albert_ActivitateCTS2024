package PB4_PROTOTYPE.main;


import PB4_PROTOTYPE.classes.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta retetaPrincipala = new Reteta(7);

        Reteta reteta2 = (Reteta) retetaPrincipala.copiaza();

        reteta2.adaugaCantitate(8);

        System.out.println(retetaPrincipala);
        System.out.println(reteta2);
        reteta2.modificaCantitate(1,12);
        System.out.println(reteta2);
        System.out.println(retetaPrincipala);

        Reteta retetaSecundara = new Reteta(retetaPrincipala);
        System.out.println();
        System.out.println(retetaSecundara);
        retetaSecundara.adaugaCantitate(5);
        retetaSecundara.adaugaCantitate(6);
        System.out.println(retetaPrincipala);
        System.out.println(retetaSecundara);


    }
}
