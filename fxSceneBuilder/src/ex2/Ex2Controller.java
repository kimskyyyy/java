package ex2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Ex2Controller implements Initializable{
	// @FXML 어노테이션은 lookup 기능을 해줌
	@FXML TextField id; 
	@FXML PasswordField pw;
	@FXML Button loginBtn;	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		TextField id = (TextField)form.lookup("#id");
//		PasswordField pw = (PasswordField)form.lookup("#pw");		
//		Button loginBtn = (Button)form.lookup("#loginBtn");
//		
		// 로그인 버튼 클릭했을 때 이벤트
		loginBtn.setOnMouseClicked((e) -> {
			String userId = id.getText();
			String userPw = pw.getText();
			System.out.println("userId: " + userId);
			System.out.println("userPw: " + userPw);									
		});
	}

}
