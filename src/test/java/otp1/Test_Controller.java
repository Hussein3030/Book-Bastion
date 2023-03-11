package otp1;

import static org.junit.jupiter.api.Assumptions.assumeTrue;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import controller.*;
import model.*;

public class Test_Controller {

	private Controller controller = new Controller();

	@Test
	void test_tarkistaLogin() {
		assumeTrue(controller.tarkistaLogin("admin", "123", 1));
	}

	@Test
	void test_kirjaPost() throws Exception {
		Kirja kirja = new Kirja("hyllyssä", "1.4", 9780544273443L, 1);
		controller.kirjaPost(kirja);
	}

	@Test
	void test_haeKirjat() throws Exception {
		ArrayList<Kirja> l = controller.haeKirjat();
		System.out.println(l.toString());
	}

	@Test
	void test_kirjaTiedotPost() throws Exception {
		Kirjatiedot kirjatiedot = new Kirjatiedot(123123, "Prior", "HarperCollins Publishers", "Sinclair Lewis",
				"6376827", 123, 123);
		controller.kirjaTiedotPost(kirjatiedot.getKirja_ISBN());
	}

	@Test
	void test_palautusPost() throws Exception {
		controller.palautusPost("50");

	}

	@Test
	void test_lainaaPost() throws Exception {
		controller.lainaaPost("1294", "50");
	}

	@Test
	void test_addAsiakas() throws Exception {
		Asiakas asiakas = new Asiakas();
		controller.addAsiakas(asiakas);

	}

}
