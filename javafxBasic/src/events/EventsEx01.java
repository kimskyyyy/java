package events;


import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class EventsEx01 extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("클릭");
		label.setFont(new Font(24));
		label.setLayoutX(120);
		label.setLayoutY(80);
		
		// 오버라이드로 표현
//		EventHandler eh = new EventHandler() {
//
//			@Override
//			public void handle(Event event) {
//				System.out.println("레이블 위에 마우스 포인터가 있다.");
//			}
//			
//		};
		
		// 람다식으로 표현
		EventHandler eh = (e) -> {
			System.out.println("레이블 위에 마우스 포인터가 있다.");
		};
		
		
//		label.setOnMouseClicked(eh); // 클릭
		label.setOnMouseEntered(eh); // 올리기
		
		AnchorPane anchor = new AnchorPane();
		anchor.getChildren().add(label);
		
		primaryStage.setTitle("EventEx1");
		primaryStage.setScene(new Scene(anchor, 300, 200));
		primaryStage.show();
		
	}

}
