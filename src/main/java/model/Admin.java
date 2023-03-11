package model;

public class Admin {

	private String käyttäjätunnu;
	private String salasana;
	private int kirjasto_id;

	public Admin() {

	}

	public Admin(String käyttäjätunnu, String salasana, int kirjasto_id) {
		this.käyttäjätunnu = käyttäjätunnu;
		this.salasana = salasana;
		this.kirjasto_id = kirjasto_id;

	}

	public String getKäyttäjätunnu() {
		return käyttäjätunnu;
	}

	public void setKäyttäjätunnu(String käyttäjätunnu) {
		this.käyttäjätunnu = käyttäjätunnu;
	}

	public String getSalasana() {
		return salasana;
	}

	public void setSalasana(String salasana) {
		this.salasana = salasana;
	}

	public int getKirjasto_id() {
		return kirjasto_id;
	}

	public void setKirjasto_id(int kirjasto_id) {
		this.kirjasto_id = kirjasto_id;
	}
}
