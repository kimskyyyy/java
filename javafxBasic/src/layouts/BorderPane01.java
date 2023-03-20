package layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPane01 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button[] buttons = new Button[5];
		String[] strings =  {"TOP", "LEFT", "CENTER", "RIGHT", "BOTTOM"};

		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new Button(strings[i]);
		}
		
		buttons[0].setPrefSize(400, 100); // buttons[0]의 size 가로 400, 세로 100
		buttons[1].setPrefHeight(100); // buttons[1]의 height 높이 100
		buttons[4].setPrefWidth(400); // buttons[4]의 width 넓이 400
		
		BorderPane border = new BorderPane(); // borderPane 생성
		border.setTop(buttons[0]); // border top buttons[0] 배치
		border.setLeft(buttons[1]); // border left buttons[1] 배치
		border.setCenter(buttons[2]); // border center buttons[2] 배치
		border.setRight(buttons[3]); // border right buttons[3] 배치
		border.setBottom(buttons[4]); // border bottom buttons[4] 배치
		
		primaryStage.setScene(new Scene(border, 400, 300)); // 윈도우창 scene에 border배치 가로 400, 세로 300 사이즈
		primaryStage.setTitle("BoderPaneEx"); // 제목
		primaryStage.show();
	}



}





