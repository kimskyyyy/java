package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz03 extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p1 = new Pane(); // 아무것도 없는 레이아웃, 기능이 없음
		Pane p2 = new Pane();
		Pane p3 = new Pane();

		p1.setMaxWidth(400);
		p2.setMaxWidth(400);
		p3.setMaxWidth(200);
		
		//Preferred
		p1.setPrefHeight(150);
		p2.setPrefHeight(150);
		p3.setPrefHeight(300);
		
		p1.setStyle("-fx-background-color: red");
		p2.setStyle("-fx-background-color: black");
		p3.setStyle("-fx-background-color: blue");
		
		
		VBox box = new VBox();
		box.getChildren().addAll(p1, p2);
		box.setSpacing(10); // 간격
//		box.setPadding(new Insets(40));
		box.setAlignment(Pos.CENTER);
		
		
		GridPane.setConstraints(box, 0, 0); // 0열, 0행		 
		GridPane.setConstraints(p3, 1, 0); // 1열, 0행		
//		GridPane.setConstraints(p3, 0, 2, 2, 1); // 0열, 2행, 열범위, 행범위
		
		
		GridPane grid = new GridPane();
		grid.getChildren().addAll(box, p3);
//		grid.setAlignment(Pos.CENTER); // grid 정렬
//		grid.setAlignment(Pos.CENTER_RIGHT);
//		grid.setAlignment(Pos.TOP_CENTER);
				
//		grid.setHgap(100); // 외부 여백
//		grid.setVgap(30);
		
//		grid.setPadding(new Insets(50, 0, 0, 30)); // 내부 여백(TOP, RIGHT, BOTTOM, LEFT)
		
		
//		primaryStage.setScene(new Scene(grid, 1000, 1000)); // 크기
		primaryStage.setScene(new Scene(box, 600, 600));
		primaryStage.setTitle("Quiz3");
		primaryStage.show(); // 화면 출력
		
	}

}
