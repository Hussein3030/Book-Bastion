package model;

public class Kirjasto {

	private int kirjasto_id;
	private String kirjasto_nimi;
	private String osoite;
	private int puh_numero;
	private int posti_numero;
	private String kaupunki;

	public Kirjasto() {

	}

	public Kirjasto(int kirjasto_id, String kirjasto_nimi, String osoite, int puh_numero, int posti_numero,
			String kaupunki) {
		this.kirjasto_id = kirjasto_id;
		this.kirjasto_nimi = kirjasto_nimi;
		this.osoite = osoite;
		this.puh_numero = puh_numero;
		this.posti_numero = posti_numero;
		this.kaupunki = kaupunki;
	}

	public int getKirjasto_id() {
		return kirjasto_id;
	}

	public void setKirjasto_id(int kirjasto_id) {
		this.kirjasto_id = kirjasto_id;
	}

	public String getKirjasto_nimi() {
		return kirjasto_nimi;
	}

	public void setKirjasto_nimi(String kirjasto_nimi) {
		this.kirjasto_nimi = kirjasto_nimi;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public int getPuh_numero() {
		return puh_numero;
	}

	public void setPuh_numero(int puh_numero) {
		this.puh_numero = puh_numero;
	}

	public int getPosti_numero() {
		return posti_numero;
	}

	public void setPosti_numero(int posti_numero) {
		this.posti_numero = posti_numero;
	}

	public String getKaupunki() {
		return kaupunki;
	}

	public void setKaupunki(String kaupunki) {
		this.kaupunki = kaupunki;
	}

}
