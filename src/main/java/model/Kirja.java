package model;

public class Kirja {

	private int kirja_id;
	private String tila;
	private String luokka;
	private long kirja_ISBN;
	private int kirjasto_id;
	private Kirjatiedot kTiedot;
	private Kirjasto kirjasto;
	private Asiakas lainaaja;

	public Kirja() {

	}

	public Kirja(String tila, String luokka, long kirja_ISBN, int kirjasto_id) {
		this.tila = tila;
		this.luokka = luokka;
		this.kirja_ISBN = kirja_ISBN;
		this.kirjasto_id = kirjasto_id;
	}

	public Kirja(int kirja_id, String tila, String luokka, long kirja_ISBN, int kirjasto_id, Kirjatiedot kTiedot,
			Kirjasto kirjasto, Asiakas lainaaja) {
		this.kirja_id = kirja_id;
		this.tila = tila;
		this.luokka = luokka;
		this.kirja_ISBN = kirja_ISBN;
		this.kirjasto_id = kirjasto_id;
		this.kTiedot = kTiedot;
		this.kirjasto = kirjasto;
		this.lainaaja = lainaaja;
	}

	public Kirja(int kirja_id, String tila, String luokka, long kirja_ISBN, int kirjasto_id, Kirjatiedot kTiedot) {
		this.kirja_id = kirja_id;
		this.tila = tila;
		this.luokka = luokka;
		this.kirja_ISBN = kirja_ISBN;
		this.kirjasto_id = kirjasto_id;
		this.kTiedot = kTiedot;
	}

	public Kirja(int kirja_id, String tila, String luokka, long kirja_ISBN, int kirjasto_id) {
		this.kirja_id = kirja_id;
		this.tila = tila;
		this.luokka = luokka;
		this.kirja_ISBN = kirja_ISBN;
		this.kirjasto_id = kirjasto_id;
	}

	public int getKirja_id() {
		return kirja_id;
	}

	public void setKirja_id(int kirja_id) {
		this.kirja_id = kirja_id;
	}

	public String getTila() {
		return tila;
	}

	public void setTila(String tila) {
		this.tila = tila;
	}

	public String getLuokka() {
		return luokka;
	}

	public void setLuokka(String luokka) {
		this.luokka = luokka;
	}

	public long getKirja_ISBN() {
		return kirja_ISBN;
	}

	public void setKirja_ISBN(long kirja_ISBN) {
		this.kirja_ISBN = kirja_ISBN;
	}

	public int getKirjasto_id() {
		return kirjasto_id;
	}

	public void setKirjasto_id(int kirjasto_id) {
		this.kirjasto_id = kirjasto_id;
	}

	public Kirjatiedot getkTiedot() {
		return kTiedot;
	}

	public void setkTiedot(Kirjatiedot kTiedot) {
		this.kTiedot = kTiedot;
	}

	public Kirjasto getKirjasto() {
		return kirjasto;
	}

	public void setKirjasto(Kirjasto kirjasto) {
		this.kirjasto = kirjasto;
	}

	public Asiakas getLainaaja() {
		return lainaaja;
	}

	public void setLainaaja(Asiakas lainaaja) {
		this.lainaaja = lainaaja;
	}

}
