package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.LangPackage;
import javafx.event.ActionEvent;
import java.io.IOException;
import javax.swing.JOptionPane;
import application.Main;
import controller.Controller;
import controller.V2M;

public class LogInController extends Main {

	private String inputNullError = "Please enter your data.";
	private String inputWrongError = "Wrong username or password";
	V2M postController = new Controller();
	LangPackage lang;

	/** The buttons */
	@FXML
	private Button button;
	@FXML
	private Button enlag;
	@FXML
	private Button finlang;
	// labels
	@FXML
	private Label error;
	@FXML
	private Label userText;
	@FXML
	private Label passText;
	// TextFields
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;

	/**
	 * Enlag - created for button to change the language.
	 *
	 * @param event the event
	 */
	@FXML
	void enlag(ActionEvent event) {
		LangPackage.getrBundle_NZ();
		changeText();
	}

	/**
	 * Finlang - created for button to change the language.
	 * 
	 * @param event the event
	 */
	@FXML
	void finlang(ActionEvent event) {
		LangPackage.getrBundle_FI();
		changeText();
	}

	/**
	 * Change text. Method that use for changing the language of the system and
	 * calls the methods from {@link LangPackage} class
	 * 
	 */
	void changeText() {
		userText.setText(LangPackage.rBundle.getString("Username"));
		passText.setText(LangPackage.rBundle.getString("Password"));
		password.setPromptText(LangPackage.rBundle.getString("Password"));
		username.setPromptText(LangPackage.rBundle.getString("Username"));
	}

	/**
	 * Initialize.
	 */
	@FXML
	public void initialize() {
	}

	/**
	 * User login - mthod that calls the checkLogin for log in.
	 *
	 * @param event the event
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void userLogin(ActionEvent event) throws IOException {
		checkLogin();
	}

	/**
	 * Check login - method that check the credentials of the user befor log in to
	 * the system.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void checkLogin() throws IOException {

		try {

			if (postController.tarkistaLogin(username.getText(), password.getText(), 1)) {

				error.setText("Success!");

				changeScene();

			} else if (username.getText().isEmpty() && password.getText().isEmpty()) {

				JOptionPane.showMessageDialog(null, inputNullError);
			} else if (username.getText().isEmpty() || password.getText().isEmpty()) {

				JOptionPane.showMessageDialog(null, inputNullError);
			} else {

				JOptionPane.showMessageDialog(null, inputWrongError);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Change scene - method after log in to open new window.
	 * 
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void changeScene() throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(EngineUI.class.getResource("AdminManagement.fxml"), LangPackage.rBundle);
		Scene scene = new Scene(fxmlLoader.load()); // scene

		Stage stage = EngineUI.getPrimaryStage();
		stage.hide();
		stage.setTitle(LangPackage.rBundle.getString("Title"));
		stage.setScene(scene);
		stage.show();
	}

}
