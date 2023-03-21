package controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CheckBoxEx extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	/*
	 * 체크박스는 다중 선택할 때 사용
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		CheckBox check1 = new CheckBox("체크1");
		CheckBox check2 = new CheckBox("체크2");
		
		check1.setText("멍때리기"); // setText()없으면 위에 생성할때 넣은 이름으로 
		check2.setText("침대와 혼연일체");
		
		check2.setSelected(true); // check2에 체크(true)
		
		System.out.println("chek1: " + check1.isSelected()); // isSelected()메서드로 체크 확인
		System.out.println("chek2: " + check2.isSelected());
		
		
		HBox box = new HBox(10);
		box.getChildren().addAll(check1, check2);
		box.setAlignment(Pos.CENTER);
		
		primaryStage.setTitle("CheckBoxEx");
		primaryStage.setScene(new Scene(box, 300, 100));
		primaryStage.show();
	}

}
