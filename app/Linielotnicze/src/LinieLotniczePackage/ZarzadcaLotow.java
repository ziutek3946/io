package LinieLotniczePackage;

import java.util.ArrayList;
import java.util.List;

public class ZarzadcaLotow {
	
	private List<Lot> loty;
	
	public ZarzadcaLotow()
	{
		this.loty = new ArrayList<Lot>();
	}
	
	public void dodaj_lot(Pilot[] piloci, Samolot samolot, Polaczenie polaczenie, Grafik grafik)
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
	
	public Lot get_lot(Polaczenie polaczenie) {
		for (Lot lot : this.loty) {
			if (lot.get_polaczenie() == polaczenie) {
				return lot;
			}
		}
		return null;
	}
}
