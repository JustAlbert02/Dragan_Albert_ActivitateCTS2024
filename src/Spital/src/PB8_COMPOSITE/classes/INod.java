package PB8_COMPOSITE.classes;

public interface INod {

    void afisaza();
    void adaugaNod(INod sectie) throws Exception;
    void stergeNod(String denumire) throws Exception;

    INod getNod(String denumire) throws Exception;


}
