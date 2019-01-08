package LinieLotniczePackage;

import java.util.ArrayList;
import java.util.List;

public class Klient {
    Konto konto;
    List<Propozycja> propozycje;

    Klient(Konto konto)
    {
        propozycje = new ArrayList<Propozycja>();
        this.konto = konto;
    }

    void dodaj_propozycje(Propozycja propozycja)
    {
        propozycje.add(propozycja);
    }
}

