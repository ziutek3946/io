package LinieLotniczePackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aplikacja {
	private static ZarzadcaLotow zarzadca_lotow;
	private static ZarzadcaKlientow zarzadca_klientow;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zarzadca_lotow = new ZarzadcaLotow();
		
		Pilot pilot1 = new Pilot("Jan", "Kowalski", "0001");
		Pilot pilot2 = new Pilot("Niejan", "Niekowalski", "0002");
		List<Pilot> piloci = new ArrayList<Pilot>();
		piloci.add(pilot1);
		piloci.add(pilot2);

		Samolot samolot1 = new Samolot(100);
		
		Polaczenie polaczenie1 = new Polaczenie("Warszawa", "Wroclaw");
		
		Date wylot = new Date(1000);
		Date przylot = new Date(12388348);
		Grafik grafik1 = new Grafik(wylot, przylot);
		
		zarzadca_lotow.dodaj_lot(piloci, samolot1, polaczenie1, grafik1);
		try {
			Lot lot = zarzadca_lotow.get_lot(polaczenie1);
			zarzadca_lotow.zaktualizuj_cene(lot, 999);
			int cena = zarzadca_lotow.sprawdz_cene(lot);
			System.out.print(cena);
		} catch (LotNotFound e) {
			System.out.print("No niestety");
		}
	}

}
