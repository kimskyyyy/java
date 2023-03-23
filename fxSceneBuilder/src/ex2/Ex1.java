package ex2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Ex1 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ex1.fxml"));
		Parent form = loader.load();
		
		TextField id = (TextField)form.lookup("#id");
		PasswordField pw = (PasswordField)form.lookup("#pw");		
		Button loginBtn = (Button)form.lookup("#loginBtn");
		
		// 로그인 버튼 클릭했을 때 이벤트
		loginBtn.setOnMouseClicked((e) -> {
			String userId = id.getText();
			String userPw = pw.getText();
			System.out.println("userId: " + userId);
			System.out.println("userPw: " + userPw);									
		});
		
		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("ex1");
		primaryStage.show();
		
	}

}
