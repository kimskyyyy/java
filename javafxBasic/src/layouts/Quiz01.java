package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Quiz01 extends Application {

	public static void main(String[] args)  {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// TOP
		Label labelMenu = new Label("메뉴");
		Label labelHome = new Label("홈");
		Label labelLogin = new Label("로그인");
		
		GridPane.setConstraints(labelMenu, 0, 0); // 0열, 0행
		GridPane.setConstraints(labelHome, 1, 0); // 1열, 0행
		GridPane.setConstraints(labelLogin, 2, 0); // 2열, 0행
		
		GridPane grid = new GridPane();
		grid.getChildren().addAll(labelMenu, labelHome, labelLogin);
		grid.setVgap(20); // 수직 gap
		grid.setHgap(40); // 수평 gap
		grid.setAlignment(Pos.CENTER); // 정렬
		//new Insets(30);
		// new Insets(TOP, RIGHT, BOTTOM, LEFT)
		grid.setPadding(new Insets(20, 0, 20, 0));
		grid.setStyle("-fx-background-color: #F6CEF5");
		
		
		// Left
		FlowPane flowL = new FlowPane();
		flowL.getChildren().add(new Button("메뉴 나열")); // "0열 2행 병합"이 입력된 버튼
		flowL.setPrefSize(100, 30); // 버튼 사이즈
		flowL.setStyle("-fx-background-color: #A9E2F3"); // 배경 색상
		flowL.setAlignment(Pos.TOP_LEFT); // 정렬
		flowL.setPadding(new Insets(0, 0, 20, 0));
		
		
		// Center
		FlowPane flowC = new FlowPane();
		flowC.getChildren().add(new Button("내용 들어가는 곳")); // "0열 2행 병합"이 입력된 버튼
		flowC.setPrefSize(100, 30); // 버튼 사이즈
		flowC.setStyle("-fx-background-color: #D0F5A9"); // 배경 색상
		flowC.setAlignment(Pos.TOP_LEFT); // 정렬
		flowC.setPadding(new Insets(0, 0, 20, 0));
		
		
		// Right
		Button button1 = new Button("아이디 입력");
		Button button2 = new Button("비밀번호 입력");
		Button button3 = new Button("로그인");
		
		button1.setPrefSize(100, 30); // 버튼 사이즈		
		button2.setPrefSize(100, 30); // 버튼 사이즈	
		button3.setPrefSize(100, 60); // 버튼 사이즈	
		
		GridPane.setConstraints(button1, 0, 0); // 0열, 0행
		GridPane.setConstraints(button2, 0, 1); // 1열, 0행
		GridPane.setConstraints(button3, 1, 0); // 2열, 0행
		
		GridPane loginGrid = new GridPane();
		loginGrid.add(button1, 0, 0);
		loginGrid.add(button2, 0, 1);
		loginGrid.add(button3, 1, 0, 1, 2); // 병합
		loginGrid.setAlignment(Pos.CENTER); // 정렬
		// new Insets(TOP, RIGHT, BOTTOM, LEFT)
		loginGrid.setPadding(new Insets(0, 10, 0, 10));
		loginGrid.setStyle("-fx-background-color: #F5F6CE");		
		
		// BOTTOM
		FlowPane flowB = new FlowPane();
		flowB.getChildren().add(new Button("바닥글이 들어가는 곳")); // "0열 2행 병합"이 입력된 버튼
		flowB.setPrefSize(250, 20); // 버튼 사이즈
		flowB.setStyle("-fx-background-color: #F7BE81"); // 배경 색상
		flowB.setAlignment(Pos.CENTER); // 정렬
		flowB.setPadding(new Insets(20, 0, 20, 0));
		grid.add(flowB, 0, 3, 3, 1); // 병합
		
		BorderPane border = new BorderPane();		
		border.setTop(grid);
		border.setLeft(flowL);
		border.setCenter(flowC);
		border.setRight(loginGrid);
		border.setBottom(flowB);
		
		primaryStage.setScene(new Scene(border, 600, 300));
		primaryStage.setTitle("Quiz1");
		primaryStage.show();
	}
		
}


