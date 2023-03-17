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
import javafx.stage.Stage;

public class GridPane01 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label labelId = new Label("아이디");
		Label labelPw = new Label("비밀번호");
		
		TextField id = new TextField();
		PasswordField pw = new PasswordField();
		id.setMaxWidth(200);
		pw.setMaxWidth(200);
		
		Button loginBtn = new Button("로그인");
		Button cancelBtn = new Button("취소");
		loginBtn.setPrefSize(100, 30);
		cancelBtn.setPrefSize(100, 30);
		
		FlowPane flow = new FlowPane();
		flow.getChildren().addAll(loginBtn, cancelBtn);
		flow.setAlignment(Pos.CENTER);
		flow.setHgap(50);
		
		GridPane.setConstraints(labelId, 0, 0); // 0열, 0행
		GridPane.setConstraints(labelPw, 0, 1); // 0열, 0행
		 
		GridPane.setConstraints(id, 1, 0); // 1열, 0행
		GridPane.setConstraints(pw, 1, 1); // 1열, 1행
		
		GridPane.setConstraints(flow, 0, 2, 2, 1); // 0열, 2행, 열범위, 행범위
		
		
		GridPane grid = new GridPane();
		grid.getChildren().addAll(labelId, labelPw, id, pw, flow);
		grid.setAlignment(Pos.CENTER); // grid 정렬
//		grid.setAlignment(Pos.CENTER_RIGHT);
//		grid.setAlignment(Pos.TOP_CENTER);
				
		grid.setHgap(100); // 외부 여백
		grid.setVgap(30);
		
		grid.setPadding(new Insets(50, 0, 0, 30)); // 내부 여백(TOP, RIGHT, BOTTOM, LEFT)
		
		
		primaryStage.setScene(new Scene(grid, 400, 200)); // 크기
		primaryStage.show(); // 화면 출력
	}



}





