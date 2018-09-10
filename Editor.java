package editor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox; 
import javafx.stage.Stage;

// nice to have's
    // tab = python/java compatible
    // control d = duplicate
    // copy, cut, paste

public class Editor extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		TextArea textArea = new TextArea();
		
		VBox vBox = new VBox(textArea);
		
		Scene scene = new Scene(vBox, 200, 100);
		
		primaryStage.setTitle("Editor");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String args[]) {
		Application.launch(args);
	}
}

