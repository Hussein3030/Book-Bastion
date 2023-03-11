package model;

public class Asiakas {

	private int as_id;
	private String etunimi;
	private String sukunimi;
	private String puhelinnum;
	private int kirja_id;

	private Asiakastiedot asiakastiedot;

	public Asiakas() {

	}

	// get
	public Asiakas(int as_id, String etunimi, String sukunimi, Asiakastiedot asiakastiedot) {
		this.as_id = as_id;
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.asiakastiedot = asiakastiedot;
	}

	// post
	public Asiakas(String etunimi, String sukunimi, String puhelinnum, Asiakastiedot asiakastiedot) { // new
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.puhelinnum = puhelinnum;
		this.asiakastiedot = asiakastiedot;
	}

	public Asiakas(String etunimi, String sukunimi, String puhelinnum) { // new
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.puhelinnum = puhelinnum;
	}

	public String getEtunimi() {
		return etunimi;
	}

	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}

	public String getSukunimi() {
		return sukunimi;
	}

	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}

	public int getKirja_id() {
		return kirja_id;
	}

	public void setKirja_id(int kirja_id) {
		this.kirja_id = kirja_id;
	}

	public Asiakastiedot getAsiakastiedot() {
		return asiakastiedot;
	}

	public void setAsiakastiedot(Asiakastiedot asiakastiedot) {
		this.asiakastiedot = asiakastiedot;
	}

	public int getAs_id() {
		return as_id;
	}

	public void setAs_id(int as_id) {
		this.as_id = as_id;
	}

	public String getPuhelinnum() {
		return puhelinnum;
	}

	public void setPuhelinnum(String puhelinnum) {
		this.puhelinnum = puhelinnum;
	}

}
