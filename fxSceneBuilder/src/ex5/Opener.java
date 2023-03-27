package ex5;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class Opener {
	private Stage primaryStage;

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;;
		
	}

	// 메뉴
	public void menuOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
		Parent menuForm = null;
		
		try {
			menuForm = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scene scene = new Scene(menuForm);
		primaryStage.setTitle("메인 화면");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	// 회원 가입 화면 실행
	public void regOpen() {
		Stage regStage = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("regForm.fxml"));
		Parent regForm = null;
		try {
			regForm = loader.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		RegController regCon = loader.getController();
		regCon.setRegForm(regForm);
		
		ComboBox<String> ageBox = (ComboBox<String>)regForm.lookup("#ageCombo");
		ageBox.getItems().addAll("10대", "20대", "30대", "40대");
		
		Scene scene = new Scene(regForm);
		regStage.setTitle("회원가입 화면");
		regStage.setScene(scene);
		regStage.show();
		
	}

}
