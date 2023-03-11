package otp1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.*;

public class Test_Asiakastiedot {

	private Asiakastiedot asiakastiedot = new Asiakastiedot("Espoo", "testi@gmail.com", "02230", "Matintie 3",
			"1234567");

	@Test
	void testSalasana() {
		assertEquals(asiakastiedot.getKaupunki(), "Espoo");
	}

	@Test
	void testSPosti() {
		assertEquals(asiakastiedot.getS_posti(), "testi@gmail.com");
	}

	@Test
	void testPOsoite() {
		assertEquals(asiakastiedot.getPosti_numero(), "02230");
	}

	@Test
	void testOsoite() {
		assertEquals(asiakastiedot.getOsoite(), "Matintie 3");
	}

	@Test
	void testNumero() {
		assertEquals(asiakastiedot.getPuh_numero(), "1234567");
	}
}
