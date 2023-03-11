package controller;

import model.Asiakas;
import model.Kirja;
import model.Kirjatiedot;

public interface V2M {

	public boolean tarkistaLogin(String user, String pwd, int kirjasto_id);

	public Kirja lainaaPost(String asiakas_id, String kirja_id);

	public Kirja palautusPost(String kirja_id);

	public Kirja kirjaPost(Kirja k);

	public Kirjatiedot kirjaTiedotPost(Long isbn);

	public void addAsiakas(Asiakas asiakas);

}
