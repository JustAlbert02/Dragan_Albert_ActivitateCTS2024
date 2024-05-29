package PB10_FLYWEIGHT.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, IPacient> pacienti;

    public FlyweightFactory() {
        this.pacienti = new HashMap<>();
    }

    public IPacient getPacient(String codPacient)
    {
        if(pacienti.containsKey(codPacient))
        {
            return pacienti.get(codPacient);
        }
        else
        {
            IPacient pacientNou = new Pacient(codPacient);
            pacienti.put(codPacient,pacientNou);
            return pacientNou;

        }
    }
    public int getNumarPacientiInregistrati()
    {
        return pacienti.keySet().size();
    }
}
