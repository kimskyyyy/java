package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HBox01 extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p1 = new Pane(); // 아무것도 없는 레이아웃, 기능이 없음
		Pane p2 = new Pane();
		Pane p3 = new Pane();
		
		p1.setMaxHeight(100);
		p2.setMaxHeight(100);
		p3.setMaxHeight(100);
		
		//Preferred
		p1.setPrefWidth(120);
		p2.setPrefWidth(120);
		p3.setPrefWidth(120);
		
		p1.setStyle("-fx-background-color: green");
		p2.setStyle("-fx-background-color: red");
		p3.setStyle("-fx-background-color: black");
		
		HBox box = new HBox();
		box.getChildren().addAll(p1, p2, p3);
		box.setSpacing(10); // 간격
		box.setPadding(new Insets(40));
		box.setAlignment(Pos.CENTER);
		
		primaryStage.setScene(new Scene(box, 600, 300));
		primaryStage.setTitle("HBoxEx");
		primaryStage.show();
	}

}
