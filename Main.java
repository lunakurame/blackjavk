import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add("MainWindow.css");
		stage.setTitle("Blackjavk");
		stage.setScene(scene);
		stage.show();
	}
}