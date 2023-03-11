package otp1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.*;

public class Test_Kirjasto {

	private Kirjasto kirjasto = new Kirjasto(1, "Matinkylän Kirjasto", "Matinlahdentie", 04455775, 02230, "Espoo");

	@Test
	void testKirjastoID() {
		assertEquals(kirjasto.getKirjasto_id(), 1);
	}

	@Test
	void testKirjastoNimi() {
		assertEquals(kirjasto.getKirjasto_nimi(), "Matinkylän Kirjasto");
	}

	@Test
	void testKirjastoOsoite() {
		assertEquals(kirjasto.getOsoite(), "Matinlahdentie");
	}

	@Test
	void testKirjastonmro() {
		assertEquals(kirjasto.getPuh_numero(), 04455775);
	}

	@Test
	void testKirjastopostinmro() {
		assertEquals(kirjasto.getPosti_numero(), 02230);
	}

	@Test
	void testKirjastoKaupunki() {
		assertEquals(kirjasto.getKaupunki(), "Espoo");
	}
}