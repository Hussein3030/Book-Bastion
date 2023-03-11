package otp1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.*;

public class Test_Tietokanta {

	@Test
	void test_Tietokanta_admin_Käyttäjätunnu() throws Exception {
		String getKäyttäjätunnu = Tietokanta.get_admin(1).getKäyttäjätunnu();
		assertEquals("admin", getKäyttäjätunnu, "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_Tietokanta_admin_salasana() throws Exception {
		assertEquals("123", Tietokanta.get_admin(1).getSalasana(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_Tietokanta_get_asiakas() throws Exception {
		assertEquals("erd", Tietokanta.get_asiakas(5).getEtunimi(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_Tietokanta_get_kirja() throws Exception {

		assertEquals("2.1", Tietokanta.get_kirja(50).getLuokka(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_Tietokanta_get_kirjasto() throws Exception {
		assertEquals("tapiola", Tietokanta.get_kirjasto(1).getKirjasto_nimi(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_Tietokanta_get_kirjat() throws Exception {
		// System.out.println("FFFF:" + tietokanta.get_kirjat().get(0).getKirja_id());
		assertEquals("hyllyssä", Tietokanta.get_kirjat().get(0).getTila(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_Tietokanta_get_Kirjatiedot() throws Exception {
		assertEquals("Creative Gene", Tietokanta.get_Kirjatiedot(213).getNimi(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_Tietokanta_post_kirjan_tiedot() throws Exception {
		Kirjatiedot t = new Kirjatiedot();
		Tietokanta.post_kirjan_tiedot(t);
	}

	@Test
	void test_Tietokanta_post_admin() throws Exception {
		Admin t = new Admin();
		Tietokanta.post_admin(t);
	}

	@Test
	void test_Tietokanta_post_asiakas() throws Exception {
		Asiakas t = new Asiakas();
		Tietokanta.post_asiakas(t);
	}

	@Test
	void test_Tietokanta_post_kirja() throws Exception {
		Long s = Long.parseLong("9781974725915");
		Kirja t = new Kirja("hyllyssä", "1.2", s, 1);
		Tietokanta.post_kirja(t);
	}

	@Test
	void test_Tietokanta_post_kirjasto() throws Exception {
		Kirjasto t = new Kirjasto();
		Tietokanta.post_kirjasto(t);
	}

	@Test
	void test_Tietokanta_post_asiakas_tiedot() throws Exception {
		Asiakastiedot t = new Asiakastiedot();
		Tietokanta.post_asiakas_tiedot(t);
	}

	@Test
	void test_Tietokanta_palautus() throws Exception {
		Tietokanta.palautus("31");
	}

	@Test
	void test_Tietokanta_delete_asiakas() throws Exception {
		Tietokanta.delete_asiakas(31);
	}

	@Test
	void test_Tietokanta_delete_kirja() throws Exception {
		Tietokanta.delete_kirja(31);
	}

}
