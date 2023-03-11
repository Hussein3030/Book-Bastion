package view;

import java.sql.ResultSet;

import java.util.ResourceBundle;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Asiakas;
import model.Asiakastiedot;

public class AsiakastiedotController implements Initializable {

	@FXML
	private Button addUser;
	@FXML
	private Button delete;
	@FXML
	private Button edit;
	@FXML
	private TableView<Asiakas> tableview;
	@FXML
	private TableColumn<Asiakas, String> etunimi;
	@FXML
	private TableColumn<Asiakastiedot, String> kaupunki;
	@FXML
	private TableColumn<Asiakastiedot, String> osoite;
	@FXML
	private TableColumn<Asiakastiedot, Integer> posti_numero;
	@FXML
	private TableColumn<Asiakastiedot, Integer> puh_numero;
	@FXML
	private TableColumn<Asiakastiedot, String> s_posti;
	@FXML
	private TableColumn<Asiakas, String> sukunimi;
	@FXML
	private TableColumn<Asiakastiedot, Integer> tiedot_id;

	String query = null;
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet res = null;
	Asiakastiedot astiedot = null;
	Asiakas as = null;

	ObservableList<Asiakas> astList = FXCollections.observableArrayList();

	public void initialize(URL url, ResourceBundle rb) {

		etunimi.setCellValueFactory(new PropertyValueFactory<Asiakas, String>("etunimi"));
		sukunimi.setCellValueFactory(new PropertyValueFactory<Asiakas, String>("sukunimi"));
		kaupunki.setCellValueFactory(new PropertyValueFactory<Asiakastiedot, String>("kaupunki"));
		osoite.setCellValueFactory(new PropertyValueFactory<Asiakastiedot, String>("osoite"));
		posti_numero.setCellValueFactory(new PropertyValueFactory<Asiakastiedot, Integer>("posti_numero"));
		puh_numero.setCellValueFactory(new PropertyValueFactory<Asiakastiedot, Integer>("puh_numero"));
		tiedot_id.setCellValueFactory(new PropertyValueFactory<Asiakastiedot, Integer>("tiedot_id"));

		tableview.setItems(astList);

	}

	@FXML
	void addUser(ActionEvent event) {

	}

	@FXML
	void deleteUser(ActionEvent event) {

	}

	@FXML
	void editUser(ActionEvent event) {

	}

}
