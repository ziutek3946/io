package LinieLotniczePackage;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class ZarzadcaLotowTest {

    ZarzadcaLotow zarzadca_lotow;
    Polaczenie polaczenie;
    Grafik grafik;
    Samolot samolot;
    List<Pilot> piloci;

    @org.junit.Before
    public void setUp() throws Exception {
        zarzadca_lotow = new ZarzadcaLotow();
    }

    @org.junit.Before
    public void preparePilots() {
        Pilot pilot1 = new Pilot("Jan", "Kowalski", "0001");
        Pilot pilot2 = new Pilot("Niejan", "Niekowalski", "0002");
        piloci = new ArrayList<Pilot>();
        piloci.add(pilot1);
        piloci.add(pilot2);
    }

    @org.junit.Before
    public void prepareSamolot() {
        samolot = new Samolot(100);
    }

    @org.junit.Before
    public void preparePolaczenie() {
        polaczenie = new Polaczenie("Warszawa", "Wroclaw");
    }

    @org.junit.Before
    public void prepareGrafik() {
        Date wylot = new Date(1000);
        Date przylot = new Date(12388348);
        grafik = new Grafik(wylot, przylot);
    }

    @org.junit.Test(expected = LotNotFound.class)
    public void assertNoLot() throws LotNotFound {
        zarzadca_lotow.get_lot(polaczenie);
    }

    @org.junit.Test
    public void dodaj_lot() throws LotNotFound {
        zarzadca_lotow.dodaj_lot(piloci, samolot, polaczenie, grafik);
        Lot added_lot = zarzadca_lotow.get_lot(polaczenie);
        assertEquals(added_lot.get_polaczenie(), polaczenie);
    }

    @org.junit.Test
    public void zaktualizuj_cene() {
    }

    @org.junit.Test
    public void sprawdz_cene() {
    }

    @org.junit.Test
    public void get_lot() {
    }
}