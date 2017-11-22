package Tutorial;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application
{

	Stage window;
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		window = primaryStage; 
		
		window.setTitle("hi");
		
		button = new Button("Click Me");
		button.setOnAction(e-> Alertbox.display("HI", "YO"));
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout,300,200);
		
		
		window.setScene(scene);
		window.show();

	}
}
