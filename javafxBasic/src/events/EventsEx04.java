package events;


import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class EventsEx04 extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button1 = new Button();
		button1.setText("클릭");
		button1.setPrefSize(50, 50);
		
		Button button2 = new Button();
		ImageView image = new ImageView("/img/smilerere.png");
		image.setFitHeight(40);
		image.setFitWidth(40);
		button2.setGraphic(image);
		
		button1.setOnMouseClicked((e) -> {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("알림");
			alert.setContentText("버튼을 클릭했습니다.");
			alert.show();
		});
		
		button2.setOnMouseClicked((e) -> {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("에러");
			alert.setContentText("이미지를 클릭했습니다.");
			alert.show();
		});
		
		HBox box = new HBox();
		box.getChildren().addAll(button1, button2);
		box.setAlignment(Pos.CENTER);
		box.setSpacing(40);
		
		primaryStage.setTitle("EventEx4");
		primaryStage.setScene(new Scene(box, 300, 200));
		primaryStage.show();
		
	}

}
