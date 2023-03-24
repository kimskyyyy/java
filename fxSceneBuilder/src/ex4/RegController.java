package ex4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class RegController {
	private RegService regService = new RegService();
	
	@FXML TextField name; 
	@FXML TextField id; 
	@FXML PasswordField pw;
	@FXML PasswordField confirm;
	@FXML RadioButton manRadio;
	@FXML RadioButton womanRadio;
	@FXML ToggleGroup gender;
	@FXML ComboBox ageCombo;
	@FXML CheckBox musicCheck;
	@FXML CheckBox sportCheck;
	@FXML CheckBox movieCheck;
	@FXML Button loginBtn;	

	// 회원 가입 버튼 
	public void regProc() {
		/*
		 javafx 테이블에 age_group 컬럼을 추가
		 regService.regProc() Method
		  - 데이터 전달
		 regDAO.regProc() Method
		  - 입력 데이터 검증, 아이디 중복 체크
		  - javafx 테이블에 데이터 입력
		 */
		
		String userName = name.getText();
		String userId = id.getText();
		String userPw = pw.getText();
		String confirmPw = confirm.getText();
//		String gender = manRadio.getTypeSelector();
		String gender = manRadio.getAccessibleText();
		System.out.println(gender);
		
		String music = musicCheck.getText();
		System.out.println(music);
		
		RegDTO regDto = new RegDTO();
		regDto.setName(userName);
		regDto.setId(userId);
		regDto.setPw(userPw);
		regDto.setConfirm(confirmPw);
		
		regService.regProc(regDto);	
	}
	
	// 회원 화면에서 취소 버튼
	public void regCancelProc() {
		name.clear();
		id.clear();
		pw.clear();	
		confirm.clear();
		name.requestFocus();
		
	}
}
