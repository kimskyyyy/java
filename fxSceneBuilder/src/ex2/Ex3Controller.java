package ex2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Ex3Controller implements Initializable{
	// @FXML 어노테이션은 lookup 기능을 해줌
	@FXML TextField id; 
	@FXML PasswordField pw;
	@FXML Button loginBtn;	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	// 로그인 버튼이 클릭되면 동작함.
	public void loginButtonMethod() {
		System.out.println("아이디: " + id.getText());
		System.out.println("비밀번호: " + pw.getText());
	}

}
