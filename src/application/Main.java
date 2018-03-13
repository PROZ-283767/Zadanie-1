package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
			GridPane root = new GridPane();
			root.setAlignment(Pos.CENTER);
			root.setVgap(10);
			root.setHgap(10);			
			
			primaryStage.setTitle("Logowanie");
			primaryStage.setScene(new Scene(root, 300, 275));
			primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
