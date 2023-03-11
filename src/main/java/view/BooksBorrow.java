package view;

import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;
import controller.Controller;
import controller.M2V;
import controller.V2M;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import model.Kirjatiedot;
import model.Tietokanta;

public class BooksBorrow implements Initializable {
	M2V getcontroller = new Controller();
	V2M postcontroller = new Controller();

	public BooksBorrow() {

	}

	// TextFields
	@FXML
	private TextField asiakasID;
	@FXML
	private TextField kirjaID;
	@FXML
	private Text asiakasTiedot;

	// Tableview
	@FXML
	private TableView<Kirjatiedot> tableview;
	@FXML
	private TableColumn<Kirjatiedot, String> julkasuvuosi;
	@FXML
	private TableColumn<Kirjatiedot, Long> kirja_ISBN;
	@FXML
	private TableColumn<Kirjatiedot, String> kirjoittajat;
	@FXML
	private TableColumn<Kirjatiedot, String> kunstantaja;
	@FXML
	private TableColumn<Kirjatiedot, String> kuva;
	@FXML
	private TableColumn<Kirjatiedot, String> nimi;
	@FXML
	private TableColumn<Kirjatiedot, Integer> sivumäärä;

	// Buttons
	@FXML
	private Button btnClose;
	@FXML
	private Button delete;
	@FXML
	private Button edit;
	@FXML
	private Button addBook;
	@FXML
	private Button createBook;
	@FXML
	private TextField ISBN;

	Connection connection;
	ResultSet res = null;
	PreparedStatement pst = null;
	ObservableList<Kirjatiedot> data;

	/**
	 * Delete book method - method that delete the book from list and databse.
	 *
	 * @param event the event
	 * @throws Exception the exception
	 */
	@FXML
	void deleteBook(ActionEvent event) throws Exception {

		int selectedID = tableview.getSelectionModel().getSelectedIndex();
		if (selectedID == 0) {
			JOptionPane.showMessageDialog(null, "Not selected");
		} else {
			JOptionPane.showMessageDialog(null, "Delete the data");
			tableview.getItems().remove(selectedID);
		}
	}

	/**
	 * addItem method adds the new items to database. New item added by Rajapinta
	 * class
	 * 
	 * @param event the event
	 * @throws IOException
	 */
	@FXML
	void addItem(ActionEvent event) {

		System.out.println("test");
		try {

			postcontroller.lainaaPost(asiakasID.getText(), kirjaID.getText());
			Kirjatiedot t = Tietokanta.get_kirja(Integer.parseInt(kirjaID.getText())).getkTiedot();
			data.add(t);

		} catch (Exception e) {
			if (asiakasID.getText().isBlank() || kirjaID.getText().isBlank()) {
				JOptionPane.showMessageDialog(null, "Please fill the data!");
			} else {
				JOptionPane.showMessageDialog(null, "Not available");
			}

		}

	}

	/**
	 * Initialize default method from Scene Builder where this context of the page
	 * show details of the input fields. Also it call the method UpdateTable() where
	 * it update the book.
	 * 
	 * @param url the url
	 * @param rb  the rb
	 */
	public void initialize(URL url, ResourceBundle rb) {
		UpdateTable();
	}

	/**
	 * This method update the book which is selected.
	 * 
	 * @param event the event
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void UpdateTable() {
		this.data = FXCollections.observableArrayList();

		kirja_ISBN.setCellValueFactory(new PropertyValueFactory<Kirjatiedot, Long>("kirja_ISBN"));
		nimi.setCellValueFactory(new PropertyValueFactory<Kirjatiedot, String>("Nimi"));
		kunstantaja.setCellValueFactory(new PropertyValueFactory<Kirjatiedot, String>("kunstantaja"));
		kirjoittajat.setCellValueFactory(new PropertyValueFactory<Kirjatiedot, String>("kirjoittajat"));
		kuva.setCellValueFactory(new PropertyValueFactory<Kirjatiedot, String>("kuva"));
		julkasuvuosi.setCellValueFactory(new PropertyValueFactory<Kirjatiedot, String>("julkasuvuosi"));
		sivumäärä.setCellValueFactory(new PropertyValueFactory<Kirjatiedot, Integer>("sivumäärä"));

		tableview.setItems(data);
	}

}
