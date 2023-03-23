package ex2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Ex3 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ex3.fxml"));
		Parent form = loader.load();
		Ex3Controller con = loader.getController();		
		
		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("ex3");
		primaryStage.show();
		
	}

}
