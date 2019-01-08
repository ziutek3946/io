package LinieLotniczePackage;

public class Propozycja {
    Bilet bilet;
    Lot alternatywny_lot;

    enum StatusPropozycji
    {
        Oczekujaca,Zaakceptowana,Odrzucona;
    }

    StatusPropozycji status;

    Propozycja(Bilet bilet, Lot alternatywny_lot)
    {
        this.bilet = bilet;
        this.alternatywny_lot = alternatywny_lot;
        this.status = StatusPropozycji.Oczekujaca;

    }

    void zaakceptuj()
    {
        this.status = StatusPropozycji.Zaakceptowana;
    }

    void odrzuc()
    {
        this.status = StatusPropozycji.Odrzucona;
    }
}
