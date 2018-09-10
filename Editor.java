package editor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

public class Editor extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		TextArea textArea = new TextArea();
		
		MenuBar menuBar = new MenuBar();
		
		Scene scene = new Scene(textArea, 800, 600);
		
		primaryStage.setTitle("Editor");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String args[]) {
		Application.launch(args);
	}
}
