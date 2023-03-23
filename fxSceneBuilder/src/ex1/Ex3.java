package ex1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class Ex3 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ex3.fxml"));
		Parent form = loader.load();
		
		ListView<String> lv = (ListView<String>)form.lookup("#listView"); // 식별자#: listView id를 가진 것을 찾아서 인스턴스의 참조값 반환
		lv.getItems().addAll("아이템1", "아이템2", "아이템3");
		
		Scene scene = new Scene(form);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("ex3");
		primaryStage.show();
		
	}

}
