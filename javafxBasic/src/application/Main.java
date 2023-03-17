package application;
	
import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
			
			Label label = new Label();
			label.setText("안녕~~!!");
			
			Font font = new Font(100); // 폰트 사이즈
			label.setFont(font);
			
			Scene scene = new Scene(label,1000,400); // 2 가로사이즈, 3 세로사이즈

			// import awt, Toolkit의 getScreenSize(): 현재 화면 해상도를 확인할 수 있음
			Toolkit tk = Toolkit.getDefaultToolkit();
			Dimension screenSize = tk.getScreenSize();
			System.out.println("width : " + screenSize.width);
			System.out.println("height : " + screenSize.height);
			int x = screenSize.width;
			int y = screenSize.height;
			
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("제목");
			primaryStage.setX(x/2 - 500); // 창이 뜨는 위치값 X, scene의 사이즈를 고려하여 위치 계산
			primaryStage.setY(y/2 - 200);			 
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
