package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.LangPackage;

public class CreateBookCT extends EngineUI implements Initializable {

	Parent root;

	@FXML
	private TextField luoISBN;
	@FXML
	private TextField luoErapaiva;
	@FXML
	private Button luoKirja;
	@FXML
	private TextField luoKirjoittajat;
	@FXML
	private TextField luoKunstantaja;
	@FXML
	private TextField luoKuvaus;
	@FXML
	private TextField luoNimi;
	@FXML
	private TextField luoSivumaara;
	@FXML
	private TextField luoVuosi;
	@FXML
	private Button peruuttaa;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	/**
	 * This method store the data in the database
	 * 
	 * @param Asiakastiedot to get the data and store it in the database by using
	 *                      for example asiakastiedot.getKaupunki()
	 * @throws Exception
	 */
	@FXML
	private void luoKirja(ActionEvent event) throws IOException {
		String bookISBN = luoISBN.getText();
		if (bookISBN.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please fill the book ISBN");
			return;
		}

		JOptionPane.showMessageDialog(null, "New Book is added!");
		changeScene();
	}

	@FXML
	private void peruuttaa(ActionEvent event) throws IOException {

		changeScene();
	}

	public void changeScene() throws IOException {

		try {
			FXMLLoader fxmlLoader = new FXMLLoader(EngineUI.class.getResource("AdminManagement.fxml"),
					LangPackage.rBundle);
			Scene scene = new Scene(fxmlLoader.load()); // scene

			Stage stage = EngineUI.getPrimaryStage();
			stage.hide();
			stage.setTitle("Kirjaston lainausjärjestelmä ");
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
