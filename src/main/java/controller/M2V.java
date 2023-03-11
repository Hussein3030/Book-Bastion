package controller;

import java.util.ArrayList;

import model.Asiakas;
import model.Kirja;

public interface M2V {

	public Asiakas haeAsiakas(String tunnus);

	public ArrayList<Kirja> haeKirjat();

}
