package otp1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.Kirja;
import model.Kirjasto;

class KirjastoDataTest {

	private Kirja kirja = new Kirja();
	private Kirjasto kirjasto = new Kirjasto();

	@Test
	void testKirjanTila() {
		kirja.setTila("Lainauksessa");
		final String result = kirja.getTila();
		assertEquals("Lainauksessa", result, "Tiedot eivät vastaa");
	}

	@Test
	void testKirjastoID() {
		kirjasto.setKirjasto_id(12);
		int result = kirjasto.getKirjasto_id();
		assertEquals(12, result, "Tiedot eivät vastaa");
	}

}
