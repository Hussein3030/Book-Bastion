package model;

public class Asiakastiedot extends Asiakas {

	private String kaupunki;
	private String s_posti;
	private String posti_numero;
	private String osoite;
	private String puh_numero;

	public Asiakastiedot() {

	}

	public Asiakastiedot(String kaupunki, String s_posti, String posti_numero, String osoite, String puh_numero) {
		this.kaupunki = kaupunki;
		this.s_posti = s_posti;
		this.posti_numero = posti_numero;
		this.osoite = osoite;
		this.puh_numero = puh_numero;
	}

	public String getKaupunki() {
		return kaupunki;
	}

	public void setKaupunki(String kaupunki) {
		this.kaupunki = kaupunki;
	}

	public String getS_posti() {
		return s_posti;
	}

	public void setS_posti(String s_posti) {
		this.s_posti = s_posti;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public String getPosti_numero() {
		return posti_numero;
	}

	public void setPosti_numero(String posti_numero) {
		this.posti_numero = posti_numero;
	}

	public String getPuh_numero() {
		return puh_numero;
	}

	public void setPuh_numero(String puh_numero) {
		this.puh_numero = puh_numero;
	}

}
