package otp1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.*;

public class Test_Rajapinta {

	@Test
	void test_Tietokanta_Rajapinta_getNimi() {
		Rajapinta.yhteys("9781974725915");
		Kirjatiedot k = Rajapinta.getKirjatiedot();
		assertEquals(k.getNimi(), "Creative Gene");
	}

	@Test
	void test_Tietokanta_Rajapinta_getKirjoittajat() {
		Rajapinta.yhteys("9781974725915");
		Kirjatiedot k = Rajapinta.getKirjatiedot();
		assertEquals(k.getKirjoittajat(), "Hideo Kojima");
	}

	@Test
	void test_Tietokanta_Rajapinta_getJulkasuvuosi() {
		Rajapinta.yhteys("9781974725915");
		Kirjatiedot k = Rajapinta.getKirjatiedot();
		assertEquals(k.getJulkasuvuosi(), 2021);
	}

	@Test
	void test_Tietokanta_Rajapinta_getKunstantaja() {
		Rajapinta.yhteys("9781974725915");
		Kirjatiedot k = Rajapinta.getKirjatiedot();
		assertEquals(k.getKunstantaja(), "Viz Media");
	}

	@Test
	void test_Tietokanta_Rajapinta_getSivumäärä() {
		Rajapinta.yhteys("9781974725915");
		Kirjatiedot k = Rajapinta.getKirjatiedot();
		assertEquals(k.getSivumäärä(), 256);
	}

	@Test
	void test_Tietokanta_Rajapinta_getKirja_ISBN() {
		Rajapinta.yhteys("9781974725915");
		Kirjatiedot k = Rajapinta.getKirjatiedot();
		long s = Long.parseLong("9781974725915");
		assertEquals(k.getKirja_ISBN(), s);
	}

}
