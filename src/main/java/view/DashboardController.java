package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Kirjatiedot;
import model.LangPackage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.ResourceBundle;
import controller.Controller;

import java.net.URL;

public class DashboardController extends EngineUI implements Initializable {

	public DashboardController() {

	}

	@FXML
	private Button buttonLogOut;
	@FXML
	private TableColumn<Kirjatiedot, String> erapaivaColumn;
	@FXML
	private TableColumn<Kirjatiedot, Integer> idColumn;
	@FXML
	private Button lainaaButton;
	@FXML
	private Button lainaaButtonBottom;
	@FXML
	private TableView<Kirjatiedot> lainaaView;
	@FXML
	private Button lainassaButton;
	@FXML
	private TableColumn<Kirjatiedot, String> nimiColumn;
	@FXML
	private Button palauttaaButtonBottom;
	@FXML
	private Button palautusButton;
	@FXML
	private TextField search;

	@FXML
	private Button searchButton;

	ObservableList<Kirjatiedot> data = FXCollections.observableArrayList(
			new Kirjatiedot(31223, "SceneBuilder", "Oracle", "Oracle CO.", "Java Framework", 2000, 300));

	@Override
	public void initialize(URL url, ResourceBundle rb) {

		idColumn.setCellValueFactory(new PropertyValueFactory<Kirjatiedot, Integer>("kirja_ISBN"));
		nimiColumn.setCellValueFactory(new PropertyValueFactory<Kirjatiedot, String>("Nimi"));
		erapaivaColumn.setCellValueFactory(new PropertyValueFactory<Kirjatiedot, String>("Eräpäivä"));

		lainaaView.setItems(data);
	}

	@FXML
	void userLogOut(ActionEvent event) throws IOException {
		buttonLogOut.getScene().getWindow().hide();

		BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("LogIn.fxml"), LangPackage.rBundle);
		Scene scene = new Scene(root, 900, 330);

		Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Kirjaston lainausjärjestelmä ");
		primaryStage.show();

	}

	public static void changeScene() throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource("Library.fxml"), LangPackage.rBundle);
		Scene scene = new Scene(fxmlLoader.load()); // scene

		Stage stage = getPrimaryStage();
		stage.hide();
		stage.setTitle("Kirjaston lainausjärjestelmä ");
		stage.setScene(scene);
		stage.show();
	}

}
