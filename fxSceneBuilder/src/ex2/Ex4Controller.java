package ex2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Ex4Controller implements Initializable{
	// @FXML 어노테이션은 lookup 기능을 해줌
	@FXML TextField id; 
	@FXML PasswordField pw;
	@FXML Button loginBtn;	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println(id.textProperty());
		id.textProperty().addListener((a, before, after) -> {
//			System.out.println(a);
			System.out.println("before: " + before);
			System.out.println("after:" + after);
			String result = idLengthCheck(after);
			id.setText(result);
		});
		
		System.out.println(pw.textProperty());
		pw.textProperty().addListener((a, before, after) -> {
		if(after.length() > 10) {
			pw.setText(before);
		}
		});
	}
	
	public String idLengthCheck(String userId) {
		//최대 길이 10자리
		if(userId.length() > 10) {
			return userId.substring(0, 10);
		}
		return userId;
	}
	
	// 로그인 버튼이 클릭되면 동작함.
	public void loginButtonMethod() {
		String userId = id.getText();
		String userPw = pw.getText();
		System.out.println("아이디: " + userId);
		System.out.println("비밀번호: " + userPw);
		
		String dbId = "admin";
		String dbPw = "1234";
		
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("알림");
		
		if(userId.isEmpty()) {
			alert.setContentText("아이디를 입력하세요."); 
		} else if(userPw.isEmpty()) {
			alert.setContentText("비밀번호를 입력하세요.");
		} else if(userId.equals(dbId) && userPw.equals(dbPw)) {
			alert.setContentText("로그인 성공");
		} else {
			alert.setContentText("로그인 실패");
			id.clear();
			pw.clear();
		}		
		
		alert.show();
	}

}
