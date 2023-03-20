package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBox01 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p1 = new Pane(); // 아무것도 없는 레이아웃, 기능이 없음
		Pane p2 = new Pane();
		Pane p3 = new Pane();
		
		p1.setMaxWidth(100);
		p2.setMaxWidth(100);
		p3.setMaxWidth(100);
		
		//Preferred
		p1.setPrefHeight(120);
		p2.setPrefHeight(120);
		p3.setPrefHeight(120);		
		
		p1.setStyle("-fx-background-color: green");
		p2.setStyle("-fx-background-color: red");
		p3.setStyle("-fx-background-color: black");
		
		VBox box = new VBox();
		box.getChildren().addAll(p1, p2, p3);
		box.setSpacing(10); // 간격
		box.setPadding(new Insets(40));
		box.setAlignment(Pos.CENTER);		
		
		primaryStage.setScene(new Scene(box, 600, 300));		
		
		primaryStage.setTitle("VBoxEx");
		primaryStage.show();
	}

}
