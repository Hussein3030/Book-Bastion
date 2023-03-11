package otp1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.*;

public class Test_Asiakas {

	private Asiakastiedot asiakastiedot = new Asiakastiedot("Espoo", "testi@gmail.com", "02230", "Matintie 3",
			"1234567");
	private Asiakas asiakas = new Asiakas(12, "Niko", "Ahonen", asiakastiedot);

	@Test
	void testKirjastoID() {
		assertEquals(asiakas.getAs_id(), 12);
	}

	@Test
	void testENimi() {
		assertEquals(asiakas.getEtunimi(), "Niko");
	}

	@Test
	void testSNimi() {
		assertEquals(asiakas.getSukunimi(), "Ahonen");
	}

	@Test
	void test_asiakas_Kirja_id() {
		asiakas.setKirja_id(12);
		assertEquals(12, asiakas.getKirja_id(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_asiakas_Puhelinnum() {
		asiakas.setPuhelinnum("04233425");
		assertEquals("04233425", asiakas.getPuhelinnum(), "Tiedot eivät vastaa oikeita");
	}

	@Test
	void test_asiakas_Asiakastiedot() {
		Asiakastiedot s = new Asiakastiedot();
		asiakas.setAsiakastiedot(s);
		assertEquals(s, asiakas.getAsiakastiedot(), "Tiedot eivät vastaa oikeita");
	}

}
