package LinieLotniczePackage;

public class Polaczenie {
	private String punkt_zrodlowy;
	private String punkt_docelowy;
	
	public Polaczenie(String punkt_zrodlowy, String punkt_docelowy)
	{
		this.punkt_zrodlowy = punkt_zrodlowy;
		this.punkt_docelowy = punkt_docelowy;
	}

	public String as_string(){
		return "Polaczenie z " + punkt_zrodlowy + " do " + punkt_docelowy;
	}
}
