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

public class GridPane02 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label1 = new Label("아이디");
		Label label2 = new Label("비밀번호");

		TextField id = new TextField();
		PasswordField pw = new PasswordField();
		

		GridPane.setConstraints(label1, 0, 0); // 0열 0행
		GridPane.setConstraints(label2, 0, 1); // 0열 1행
		GridPane.setConstraints(id, 1, 0); // 1열 0행
		GridPane.setConstraints(pw, 1, 1); // 1열 1행

		GridPane grid = new GridPane();
		grid.getChildren().addAll(id, pw, label1, label2);
		grid.setVgap(20); // 수직 gap
		grid.setHgap(40); // 수평 gap
		//new Insets(30);
		// new Insets(TOP, RIGHT, BOTTOM, LEFT)
		grid.setPadding(new Insets(50, 0, 0, 30));

		FlowPane flow = new FlowPane();
		flow.getChildren().add(new Button("0열 2행 병합한 자리에 생성한 버튼")); // "0열 2행 병합"이 입력된 버튼
		flow.setPrefSize(250, 20); // 버튼 사이즈
		flow.setStyle("-fx-background-color: #6EE3F7"); // 배경 색상
		flow.setAlignment(Pos.CENTER); // 정렬

		grid.add(flow, 0, 2, 2, 1); // 병합

		Scene scene = new Scene(grid, 300, 200); // 사이즈
		primaryStage.setTitle("GridPaneEx2"); // 제목
		primaryStage.setScene(scene); 
		primaryStage.show(); // 화면 출력
	}



}





