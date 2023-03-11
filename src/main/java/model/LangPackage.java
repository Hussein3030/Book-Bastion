package model;

import java.util.Locale;
import java.util.ResourceBundle;

public final class LangPackage {

	public static Locale locale = new Locale("en", "NZ");
	public static ResourceBundle rBundle = ResourceBundle.getBundle("ResourceBundle/Bundle", locale);

	public static ResourceBundle getrBundle() {
		return rBundle;
	}

	public static void getrBundle_FI() {
		locale = new Locale("fi", "FI");
		rBundle = ResourceBundle.getBundle("ResourceBundle/Bundle", locale);
	}

	public static void getrBundle_NZ() {
		locale = new Locale("en", "NZ");
		rBundle = ResourceBundle.getBundle("ResourceBundle/Bundle", locale);
	}

}
