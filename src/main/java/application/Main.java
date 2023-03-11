package application;

import java.time.LocalDate;
import model.Kirjatiedot;
import model.Rajapinta;


public class Main {
	
	public static void main(String args[]) {
		
		Rajapinta.yhteys("9781974725915");
		Kirjatiedot k = Rajapinta.getKirjatiedot();
		System.out.println(k.getKirjoittajat());
		System.out.println(k.getNimi());
		Rajapinta.yhteys("9783453533011");
		Kirjatiedot k2 = Rajapinta.getKirjatiedot();
		System.out.println(k2.getKirjoittajat());
		System.out.println(k2.getNimi());
		LocalDate myObj = LocalDate.now();
		System.out.println(myObj.plusDays(30).toString());
		
		view.EngineUI.main(args);
		
		
	}

    
}