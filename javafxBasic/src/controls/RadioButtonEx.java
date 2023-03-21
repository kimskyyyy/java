package controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RadioButtonEx extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	/*
	 * 라디오 버튼은 단일 선택할 때 사용(ToggleGroup 사용 필요, 사용 안할 시 다중 선택)
	 */

	@Override
	public void start(Stage primaryStage) throws Exception {
		RadioButton radio1 = new RadioButton("라디오1");
		RadioButton radio2 = new RadioButton("라디오2");
		
		// 단일 선택을 할 수 있는 기능을 제공해주는 ToggleGroup
		ToggleGroup group = new ToggleGroup();
		radio1.setToggleGroup(group);
		radio2.setToggleGroup(group);
		
		radio1.setText("멍때리기"); // setText()없으면 위에 생성할때 넣은 이름으로 
		radio2.setText("침대와 혼연일체");
		
		radio1.setSelected(true); // radio1 선택(true)이 기본 선택
		
		System.out.println("radio1: " + radio1.isSelected()); // isSelected()메서드로 체크 확인
		System.out.println("radio2: " + radio2.isSelected());
		
		
		HBox box = new HBox();
		box.getChildren().addAll(radio1, radio2);
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10); // Spacing 설정(HBox box = new HBox(10); 이렇게 하는 것도 가능) 
		
		primaryStage.setTitle("RadioButtonEx");
		primaryStage.setScene(new Scene(box, 300, 100));
		primaryStage.show();
	}

}
