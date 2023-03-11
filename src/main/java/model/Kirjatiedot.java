package model;

public class Kirjatiedot {

	private long kirja_ISBN;
	private String nimi;
	private String kunstantaja;
	private String kirjoittajat;
	private String kuva;
	private int julkasuvuosi;
	private int sivumäärä;
	private String erapaiva;

	public Kirjatiedot() {

	}

	public Kirjatiedot(long kirja_ISBN, String nimi, String kunstantaja, String kirjoittajat, String kuva,
			int julkasuvuosi, int sivumäärä) {

		this.kirja_ISBN = kirja_ISBN;
		this.nimi = nimi;
		this.kunstantaja = kunstantaja;
		this.kirjoittajat = kirjoittajat;
		this.kuva = kuva;
		this.julkasuvuosi = julkasuvuosi;
		this.sivumäärä = sivumäärä;

	}

	public Kirjatiedot(String nimi, String kunstantaja, String kirjoittajat, String kuva, int julkasuvuosi,
			int sivumäärä) {

		this.nimi = nimi;
		this.kunstantaja = kunstantaja;
		this.kirjoittajat = kirjoittajat;
		this.kuva = kuva;
		this.julkasuvuosi = julkasuvuosi;
		this.sivumäärä = sivumäärä;

	}

	public String getErapaiva() {
		return erapaiva;
	}

	public void setErapaiva(String erapaiva) {
		this.erapaiva = erapaiva;
	}

	public long getKirja_ISBN() {
		return kirja_ISBN;
	}

	public void setKirja_ISBN(long kirja_ISBN) {
		this.kirja_ISBN = kirja_ISBN;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getKunstantaja() {
		return kunstantaja;
	}

	public void setKunstantaja(String kunstantaja) {
		this.kunstantaja = kunstantaja;
	}

	public String getKirjoittajat() {
		return kirjoittajat;
	}

	public void setKirjoittajat(String kirjoittajat) {
		this.kirjoittajat = kirjoittajat;
	}

	public String getKuva() {
		return kuva;
	}

	public void setKuva(String kuva) {
		this.kuva = kuva;
	}

	public int getJulkasuvuosi() {
		return julkasuvuosi;
	}

	public void setJulkasuvuosi(int julkasuvuosi) {
		this.julkasuvuosi = julkasuvuosi;
	}

	public int getSivumäärä() {
		return sivumäärä;
	}

	public void setSivumäärä(int sivumäärä) {
		this.sivumäärä = sivumäärä;
	}

}
