package otp1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.*;

public class Test_Kirjatiedot {

	private Kirjatiedot kirjatiedot = new Kirjatiedot();

	@Test
	void test_kirjatiedot_Erapaiva() {
		kirjatiedot.setErapaiva("12.11.2022");
		assertEquals("12.11.2022", kirjatiedot.getErapaiva(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_kirjatiedot_Julkasuvuosi() {
		kirjatiedot.setJulkasuvuosi(2012);
		assertEquals(2012, kirjatiedot.getJulkasuvuosi(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_kirjatiedot_Kirja_ISBN() {
		kirjatiedot.setKirja_ISBN(23432342);
		assertEquals(23432342, kirjatiedot.getKirja_ISBN(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_kirjatiedot_Kirjoittajat() {
		kirjatiedot.setKirjoittajat("Mark");
		assertEquals("Mark", kirjatiedot.getKirjoittajat(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_kirjatiedot_Kunstantaja() {
		kirjatiedot.setKunstantaja("Fictionwise  Inc");
		assertEquals("Fictionwise  Inc", kirjatiedot.getKunstantaja(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_kirjatiedot_Kuva() {
		kirjatiedot.setKuva("3253463");
		assertEquals("3253463", kirjatiedot.getKuva(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_kirjatiedot_Nimi() {
		kirjatiedot.setNimi("Creative Gene");
		assertEquals("Creative Gene", kirjatiedot.getNimi(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_kirjatiedot_Sivumäärä() {
		kirjatiedot.setSivumäärä(2343);
		assertEquals(2343, kirjatiedot.getSivumäärä(), "Tiedot eivät vastaa oikeita");
	}

}
