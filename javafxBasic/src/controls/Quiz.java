package controls;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane border = new BorderPane();
		
		// TOP
		ArrayList<Label> topLabels = new ArrayList<Label>();
		topLabels.add(new Label("홈"));
		topLabels.add(new Label("사회"));
		topLabels.add(new Label("경제"));
		topLabels.add(new Label("국제"));
		topLabels.add(new Label("문화"));
		
		FlowPane flowTop = new FlowPane();
		flowTop.setHgap(40); // 라벨 사이 간격
		flowTop.setAlignment(Pos.CENTER);
		flowTop.setPadding(new Insets(15)); // 내부 여백
		
		flowTop.getChildren().addAll(topLabels);
		border.setTop(flowTop);
		
		
		// LEFT
		Label label1 = new Label("카테고리");
		Label label2 = new Label("노트북");
		Label label3 = new Label("자동차용품");
		Label label4 = new Label("휴대폰");
		Label label5 = new Label("캠핑/낚시");
		
		
		VBox box = new VBox();
		box.getChildren().addAll(label1, label2, label3, label4, label5);
		box.setSpacing(20); // 간격
		box.setPadding(new Insets(10));
		box.setAlignment(Pos.TOP_LEFT);
		box.setMaxWidth(80.0);
		
		
		FlowPane flowLeft = new FlowPane();
		flowLeft.setVgap(40);
		flowLeft.setAlignment(Pos.TOP_LEFT);
		flowLeft.setPadding(new Insets(10));
		flowLeft.setMaxWidth(90.0);
		
		flowLeft.getChildren().addAll(box);
		border.setLeft(flowLeft);
		
		
		
		// CENTER
		Label labelId = new Label("ID");
		Label labelPw = new Label("PW");
		
		TextField id = new TextField();
		PasswordField pw = new PasswordField();
		id.setMaxWidth(120);
		pw.setMaxWidth(120);
		id.setText("test");
		pw.setText("pass");

		GridPane.setConstraints(labelId, 0, 0); // 0열, 0행
		GridPane.setConstraints(labelPw, 0, 1); // 0열, 0행
		 
		GridPane.setConstraints(id, 1, 0); // 1열, 0행
		GridPane.setConstraints(pw, 1, 1); // 1열, 1행				
		
		GridPane grid = new GridPane();
		grid.getChildren().addAll(labelId, labelPw, id, pw);
		grid.setAlignment(Pos.TOP_LEFT); // grid 정렬
				
		grid.setHgap(15); // 외부 여백
		grid.setVgap(15);
		
//		grid.setPadding(new Insets(50, 0, 0, 30)); // 내부 여백(TOP, RIGHT, BOTTOM, LEFT)
		
		
		// RadioButton 여/남 선택
		RadioButton radio1 = new RadioButton("여");
		RadioButton radio2 = new RadioButton("남");
		
		ToggleGroup group = new ToggleGroup();
		radio1.setToggleGroup(group);
		radio2.setToggleGroup(group);
		
		radio1.setSelected(true); // radio1 선택(true)이 기본 선택	
				
		HBox radioBox = new HBox();
		radioBox.getChildren().addAll(radio1, radio2);
		radioBox.setAlignment(Pos.TOP_LEFT);
		radioBox.setSpacing(10); // Spacing 설정(HBox box = new HBox(10); 이렇게 하는 것도 가능) 
				
		
		// CheckBox 게임/공부 선택
		CheckBox check1 = new CheckBox("게임");
		CheckBox check2 = new CheckBox("공부");
		
		check1.setSelected(true);
		check2.setSelected(true);
		
		HBox checkBox = new HBox(10);
		checkBox.getChildren().addAll(check1, check2);
		checkBox.setAlignment(Pos.TOP_LEFT);
		
		// Label 하고 싶은 말
		Label label = new Label("하고 싶은 말");
		
		// TextArea
		TextArea area = new TextArea();
		area.setMaxSize(200, 150);
		area.setText("하고 싶은 말을 적어주세요.");
		
		HBox textBox = new HBox();
		textBox.getChildren().addAll(area);
		textBox.setAlignment(Pos.TOP_LEFT);
		
		
		
		
		VBox box2 = new VBox();
		box2.getChildren().addAll(grid, radioBox, checkBox, label, textBox);
		box2.setSpacing(10); // 간격
		box2.setPadding(new Insets(10));
		box2.setAlignment(Pos.TOP_LEFT);
		box2.setMaxWidth(200.0);
		
		border.setCenter(box2);
		
		
		// RIGHT		
		TextField loginId = new TextField();
		PasswordField loginPw = new PasswordField();
		loginId.setMaxWidth(120);
		loginPw.setMaxWidth(120);
		loginId.setText("test");
		loginPw.setText("pass");
		

		Button buttonLogin = new Button("로그인");
		buttonLogin.setPrefSize(90, 60);
		
		GridPane gridRight = new GridPane();
		gridRight.add(loginId, 0, 0);
		gridRight.add(loginPw, 0, 1);
		gridRight.add(buttonLogin, 1, 0, 1, 2);
		gridRight.setPadding(new Insets(10));
		gridRight.setAlignment(Pos.TOP_LEFT);
		gridRight.setMaxWidth(200.0);
		
//		gridRight.setHgap(15); // 외부 여백
		gridRight.setVgap(10);
		
		
		border.setRight(gridRight);
	
		
		
		
		
		
		primaryStage.setTitle("Quiz");
		primaryStage.setScene(new Scene(border, 600, 400));
		primaryStage.show();
		
		
		
	}

}
