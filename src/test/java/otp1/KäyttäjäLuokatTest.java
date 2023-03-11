package otp1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.Admin;

class KäyttäjäLuokatTest {

	private Admin admin = new Admin("Admin", "1234", 1);

	@Test
	void testAdmin() {
		assertEquals(admin.getKäyttäjätunnu(), "Admin");
	}

	@Test
	void testSalasana() {
		assertEquals(admin.getSalasana(), "1234");
	}

	@Test
	void testKirjastoID() {
		assertEquals(admin.getKirjasto_id(), 1);
	}

}
