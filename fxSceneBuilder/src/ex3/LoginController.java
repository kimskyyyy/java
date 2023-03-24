package ex3;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginController implements Initializable{
	private LoginService loginService = new LoginService();
	
	// @FXML 어노테이션은 lookup 기능을 해줌
	@FXML TextField id; 
	@FXML PasswordField pw;
	@FXML Button loginBtn;	
	
	String userId = "";
	String userPw = "";
	
	public String idLengthCheck(String userId) {
		//최대 길이 10자리
		if(userId.length() > 10) {
			return userId.substring(0, 10);
		}
		return userId;
	}
	
	// 로그인 버튼
	public void loginProc() {
		/*
		 * LoginService Class를 생성하고, Method를 loginProc을 구현하세요.
		 * LoginDAO Class를 생성하고, Method를 LoginProc을 구현하세요.
		 * DAO는 데이터베이스 접근
		 * Service는 데이터(입력 값) 검증
		 * 
		 * 출력: 로그인 성공 또는 실패  Alert를 출력하기
		 * table Name: javaFx
		 * Column Name: id, pw, name, gender(성별), hobbys(취미)
		 * 
		 */
//		System.out.println("아이디: " + userId);
//		System.out.println("비밀번호: " + userPw);
		
		userId = id.getText();
		userPw = pw.getText();
		
		loginService.loginProc(userId, userPw);	
		
	}
	
	// 취소 버튼
	public void cancelProc() {
		id.clear();
		pw.clear();		
		id.requestFocus();
	}
	
	// 가입 버튼
	public void regProc() {		
//	String userId = id.getText();
//	String userPw = pw.getText();
//	System.out.println("아이디: " + userId);
//	System.out.println("비밀번호: " + userPw);
//	
//	loginService.regProc(userId, userPw);
		
		
//		
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
