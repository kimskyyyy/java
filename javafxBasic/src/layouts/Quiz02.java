package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Quiz02 extends Application{
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
		p1.setPrefWidth(200);
		p2.setPrefWidth(200);
		p3.setPrefWidth(200);
		
		p1.setStyle("-fx-background-color: blue");
		p2.setStyle("-fx-background-color: red");
		p3.setStyle("-fx-background-color: black");
		
		HBox box = new HBox();
		box.getChildren().addAll(p1, p2, p3);
		box.setSpacing(10); // 간격
		box.setPadding(new Insets(40));
		
		HBox box2 = new HBox();
		box2.getChildren().addAll(p1, p2, p3);
		box2.setSpacing(10); // 간격
		box2.setPadding(new Insets(40));
		
		

//		GridPane.setConstraints(box, 0, 0); // 0열 0행
//		GridPane.setConstraints(box, 0, 1); // 0열 1행
//		
//		GridPane grid = new GridPane();
//		grid.add(box, 0, 0);
//		grid.add(box, 0, 1);
////		grid.getChildren().addAll(box);
//		grid.setPadding(new Insets(40));
//		grid.setAlignment(Pos.CENTER);
//		grid.setHgap(50); // 외부 여백
//		grid.setVgap(30);
		
		primaryStage.setScene(new Scene(box, 600, 300));
		primaryStage.setScene(new Scene(box2, 600, 300));
//		primaryStage.setScene(new Scene(grid, 1000, 500));
		primaryStage.setTitle("Quiz02");
		primaryStage.show();
		
	}

}
