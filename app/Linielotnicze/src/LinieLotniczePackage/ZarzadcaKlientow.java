package LinieLotniczePackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ZarzadcaKlientow {
    HashMap<String,Klient> klienci;

    ZarzadcaKlientow()
    {
        klienci = new HashMap<String,Klient>();
    }

    void dodaj_klienta(String nazwa_klienta, Klient klient)
    {
        klienci.put(nazwa_klienta, klient);
    }

    void usun_klienta(String nazwa_klienta)
    {
        klienci.remove(nazwa_klienta);
    }

    Klient wyszukaj_klienta(String nazwa_klienta)
    {
        return klienci.get(nazwa_klienta);
    }

    boolean sprawdz_srodki(String nazwa_klienta, int cena)
    {
        if(klienci.get(nazwa_klienta).konto.srodki >= cena)
            return true;
        else
            return false;
    }

    void pobierz_srodki(String nazwa_klienta, int cena)
    {
        klienci.get(nazwa_klienta).konto.pobierz_srodki(cena);
    }

    void zwroc_srodki(String nazwa_klienta, int srodki)
    {
        klienci.get(nazwa_klienta).konto.zwroc_srodki(srodki);
    }

    void wyslij_propozycje(Propozycja[] propozycje)
    {

    }
}
