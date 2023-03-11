package otp1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.*;

public class Test_Kirja {

	private Kirja kirja = new Kirja();

	@Test
	void test_kirja_Kirja_id() {
		kirja.setKirja_id(12323);
		assertEquals(12323, kirja.getKirja_id(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_kirja_Kirja_ISBN() {
		kirja.setKirja_ISBN(834758347);
		assertEquals(834758347, kirja.getKirja_ISBN(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_kirja_Luokka() {
		kirja.setLuokka("1.12");
		assertEquals("1.12", kirja.getLuokka(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_kirja_Tila() {
		kirja.setTila("hyllyssä");
		assertEquals("hyllyssä", kirja.getTila(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_kirja_Lainaaja() {
		Asiakas Asiakas = new Asiakas();
		kirja.setLainaaja(Asiakas);
		assertEquals(Asiakas, kirja.getLainaaja(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_kirja_kirjasto() {
		Kirjasto kirjasto = new Kirjasto();
		kirja.setKirjasto(kirjasto);
		assertEquals(kirjasto, kirja.getKirjasto(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_kirja_kirjatiedot() {
		Kirjatiedot kirjatiedot = new Kirjatiedot();
		kirja.setkTiedot(kirjatiedot);
		assertEquals(kirjatiedot, kirja.getkTiedot(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_kirja_Kirjasto_id() {
		kirja.setKirjasto_id(1290);
		assertEquals(1290, kirja.getKirjasto_id(), "Tiedot eivät vastaa oikeita");
	}

}
