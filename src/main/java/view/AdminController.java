package view;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.LangPackage;

public class AdminController {

	/** The primary stage. */
	private static Stage primaryStage;

	public static Stage getPrimaryStage() {
		return primaryStage;
	}

	/** The borderpane. */
	@FXML
	private BorderPane borderpane;

	/** Buttons. */
	@FXML
	private Button btnBook;
	@FXML
	private Button btnLogout;
	@FXML
	private Button btnReturnBook;
	@FXML
	private Button btnUsers;
	@FXML
	private Button btnBorrowBook;

	/** Label */
	@FXML
	private Label portalName;

	/**
	 * All books - method that open the Pane panel view for all book list option.
	 *
	 * @param event the event
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML
	void AllBooks(ActionEvent event) throws IOException {
		Pane view = FXMLLoader.load(getClass().getResource("Kirjatiedot.fxml"), LangPackage.rBundle);
		borderpane.setCenter(view);
	}

	/**
	 * All users - method that open the Pane panel view for adding new user option.
	 *
	 * @param event the event
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML
	void AllUsers(ActionEvent event) throws IOException {
		Pane view = FXMLLoader.load(getClass().getResource("Users.fxml"), LangPackage.rBundle);
		borderpane.setCenter(view);

	}

	/**
	 * Borrow book - method that open the Pane panel view for borrowing book option.
	 *
	 * @param event the event
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML
	void BorrowBook(ActionEvent event) throws IOException {
		Pane view = FXMLLoader.load(getClass().getResource("BooksToBorrow.fxml"), LangPackage.rBundle);
		borderpane.setCenter(view);
	}

	/**
	 * Return book - method that open the Pane panel view for Return book option.
	 *
	 * @param event the event
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML
	void ReturnBook(ActionEvent event) throws IOException {
		Pane view = FXMLLoader.load(getClass().getResource("ReturnBook.fxml"), LangPackage.rBundle);
		borderpane.setCenter(view);
	}

	/**
	 * User log out - method that log out from system.
	 *
	 * @param event the event
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML
	void userLogOut(ActionEvent event) throws IOException {
		Pane view = FXMLLoader.load(getClass().getResource("Login.fxml"), LangPackage.rBundle);
		borderpane.setCenter(view);

		try {
			FXMLLoader fxmlLoader = new FXMLLoader(EngineUI.class.getResource("Login.fxml"), LangPackage.rBundle);
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
