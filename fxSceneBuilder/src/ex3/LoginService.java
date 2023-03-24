package ex3;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginService {
	private LoginDAO loginDao = new LoginDAO();
	
	@FXML TextField id; 
	@FXML PasswordField pw;
	@FXML Button loginBtn;	
	
	public void loginProc(String userId, String userPw) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("알림");
		
		if(userId.isEmpty()) {
			alert.setContentText("아이디를 입력하세요."); 
		} else if(userPw.isEmpty()) {
			alert.setContentText("비밀번호를 입력하세요.");
		}		
		
		if(loginDao.findId(userId) && loginDao.checkPw(userId, userPw)){ // id   존재여부 확인, 아이디 있으면 패스워드 확인
			alert.setContentText("로그인 성공");
		} else {
			alert.setContentText("아이디, 비밀번호를 확인해주세요.");
		}
		alert.show();
	}

	// 회원가입
	public void regProc(String userId, String userPw) {
//		loginDao.insert();
	}

}
