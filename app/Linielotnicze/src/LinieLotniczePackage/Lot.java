package LinieLotniczePackage;

import java.util.List;

public class Lot {
	private Kolejka kolejka;
	private List<Pilot> piloci;
	private Samolot samolot;
	private Bilet[] bilety;
	private Grafik grafik;
	private Polaczenie polaczenie;
	private int cena;
	
	public Lot(List<Pilot> piloci, Samolot samolot, Polaczenie polaczenie, Grafik grafik)
	{
		this.piloci = piloci;
		this.samolot = samolot;
		this.polaczenie = polaczenie;
		this.grafik = grafik;
	}
	
	public void zaktualizuj_cene(int nowa_cena)
	{
		this.cena = nowa_cena;
	}
	
	public int sprawdz_cene()
	{
		return this.cena;
	}
	
	public Polaczenie get_polaczenie() {
		return this.polaczenie;
	}

	public boolean equals(Lot lot) {
		return (this.polaczenie == lot.get_polaczenie());
	}
}
