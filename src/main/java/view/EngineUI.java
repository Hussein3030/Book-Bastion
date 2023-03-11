package view;

import java.io.IOException;
import application.Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.LangPackage;

/**
 * The Class EngineUI.
 */
public class EngineUI extends Application implements IengineUI {

	/** The primary stage. */
	private static Stage primaryStage;

	/**
	 * Gets the primary stage - to return the main page view.
	 *
	 * @return the primary stage
	 */
	public static Stage getPrimaryStage() {
		return primaryStage;
	}

	/**
	 * Start - view page to start when software starts.
	 *
	 * @param stage the stage
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@Override
	public void start(Stage stage) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/LogIn.fxml"), LangPackage.rBundle);

		Scene scene = new Scene(fxmlLoader.load()); // scene

		primaryStage = stage; // current stage(primaryStage) is stage
		stage.setTitle(LangPackage.rBundle.getString("Title"));
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		launch();
	}

}
