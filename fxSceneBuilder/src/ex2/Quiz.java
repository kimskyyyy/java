package ex2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Quiz extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("quiz.fxml"));
		Parent form = loader.load();
		QuizController con = loader.getController();		
		
		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("quiz");
		primaryStage.show();
		
	}

}
