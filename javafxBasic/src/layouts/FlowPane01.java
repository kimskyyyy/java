package layouts;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPane01 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button1 = new Button("버튼1");
		Button button2 = new Button("버튼2");
		Button button3 = new Button("버튼3");
		Button button4 = new Button("버튼4");
		Button button5 = new Button("버튼5");
		Button button6 = new Button("버튼6");
		
		// FlowPane: 행 배치 구조, Scene의 사이즈에 맞춰서 자동으로 다음 행에 배치됨
		FlowPane flow = new FlowPane();
		flow.getChildren().add(button1);
		flow.getChildren().addAll(button2, button3, button4, button5);
		flow.getChildren().add(button6);
		
		ArrayList<Button> buttons = new ArrayList<>();
		for(int i = 0; i < 15; i++) {
			buttons.add(new Button("버튼" +(i+7)));
			flow.getChildren().add(buttons.get(i));
		}
		
		primaryStage.setScene(new Scene(flow, 500, 50));
		primaryStage.show();
	}

}
