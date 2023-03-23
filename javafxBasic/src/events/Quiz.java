package events;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		EventHandler<Event> eh;
		
		// image
		ImageView image = new ImageView("/img/search.png");
		
		Label label1 = new Label("search");
		label1.setTextFill(Color.web("#58ACFA"));
		label1.setFont(new Font("Cambria Math", 24));
		label1.setLayoutX(80);
		label1.setLayoutY(40);	
		
		eh= (e) -> {
			image.setScaleX(2);
			image.setScaleY(2);
			label1.setFont(new Font(34));
		};
		
		// 마우스 올리면 이벤트 발생	
		image.setOnMouseEntered(eh);
		label1.setOnMouseEntered(eh); 
		
		eh= (e) -> {
			image.setScaleX(1);
			image.setScaleY(1);
			label1.setFont(new Font("Cambria Math", 24));

		};
		
		// 마우스 떼면 이벤트 발생
		image.setOnMouseExited(eh); 
		label1.setOnMouseExited(eh); 
	
		
		
		// Values
		Label label2 = new Label("Values");
		label2.setFont(new Font("Consolas", 30));
		label2.setLayoutX(160);
		label2.setLayoutY(60);	
		label2.setRotate(270.0);
		
		eh= (e) -> {
			label2.setFont(new Font(40));
			label2.setRotate(180.0);
		};
		
		// 마우스 올리면 이벤트 발생	
		label2.setOnMouseEntered(eh);
		
		eh= (e) -> {
			label2.setFont(new Font("Consolas", 30));
			label2.setRotate(90.0);
		};
		
		// 마우스 떼면 이벤트 발생
		label2.setOnMouseExited(eh); 

		
		
		// A label that needs to be wrapped
		Label label3 = new Label("A label that \nneeds to be\nwrapped");
		label3.setFont(new Font("Ink Free", 13));
		label3.setLayoutX(280);
		label3.setLayoutY(40);
		
		eh= (e) -> {
			label3.setFont(new Font(23));
		};
		
		// 마우스 올리면 이벤트 발생	
		label3.setOnMouseEntered(eh);
		
		eh= (e) -> {
			label3.setFont(new Font("Ink Free", 13));
		};
		
		// 마우스 떼면 이벤트 발생
		label3.setOnMouseExited(eh); 
		
		
		
		
		AnchorPane anchor = new AnchorPane();
		anchor.getChildren().addAll(image, label1, label2, label3);
		
		primaryStage.setTitle("Label sample");
		primaryStage.setScene(new Scene(anchor, 420, 170));
		primaryStage.show();
		
	}

}
