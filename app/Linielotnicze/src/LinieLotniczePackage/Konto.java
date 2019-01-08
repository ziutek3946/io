package LinieLotniczePackage;

public class Konto {
    int srodki;

    Konto()
    {
        srodki = 0;
    }

    void pobierz_srodki(int srodki)
    {
        this.srodki -= srodki;
    }

    void zwroc_srodki(int srodki)
    {
        this.srodki += srodki;
    }
}
