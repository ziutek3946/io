package LinieLotniczePackage;

import java.util.ArrayList;
import java.util.List;


class LotNotFound extends Exception {
	public LotNotFound(String message) {
		super(message);
	}
}


public class ZarzadcaLotow {
	
	protected List<Lot> loty;
	
	public ZarzadcaLotow()
	{
		this.loty = new ArrayList<Lot>();
	}
	
	public void dodaj_lot(List<Pilot> piloci, Samolot samolot, Polaczenie polaczenie, Grafik grafik)
	{
		Lot lot = new Lot(piloci, samolot, polaczenie, grafik);
		loty.add(lot);
	}
	
	public void zaktualizuj_cene(Lot lot, int nowa_cena)
	{
		lot.zaktualizuj_cene(nowa_cena);
	}
	
	public int sprawdz_cene(Lot lot)
	{
		return lot.sprawdz_cene();
	}
	
	public Lot get_lot(Polaczenie polaczenie) throws LotNotFound {
		for (Lot lot : this.loty) {
			if (lot.get_polaczenie() == polaczenie) {
				return lot;
			}
		}
		throw new LotNotFound(polaczenie + " nie ma lotu");
	}
}
