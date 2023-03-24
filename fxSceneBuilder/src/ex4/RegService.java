package ex4;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class RegService {
	private RegDAO regDao = new RegDAO();

	public void regProc(RegDTO regDto) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("알림");
		
		if(regDto.getId() == null || regDto.getId().isEmpty()) {
			alert.setContentText("아이디는 필수 항목입니다. 입력하세요.");
			return;
		}
		
		if(regDao.findId(regDto.getId())){ // id   존재여부 확인
			alert.setContentText("중복된 아이디입니다.");
		} else {
			// 비밀번호 확인
			if(regDto.getPw().equals(regDto.getConfrirm())) {
				regDao.regProc(regDto);
				alert.setContentText("회원 가입 완료");
				
			} else {
				alert.setContentText("비밀번호가 일치하지 않습니다.");
			}
			
			
		}
		alert.show();
		
		
		regDao.regProc(regDto);
	}

}
