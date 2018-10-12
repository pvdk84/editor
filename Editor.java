package pvdk84.editor;

import pvdk84.editor.EditorMenuBar;
import pvdk84.editor.EditorTextArea;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

 
public class Editor extends Application {

	private static Stage stage;
	private int width = 600;
	private int height = 400;

 	public static Stage getStage() {
        	return stage;
    	}
	
	@Override
	public void start(Stage stage) {

		// create vbox root for menubar and textarea
		VBox root = new VBox();
       		root.setPadding(new Insets(10));
        	root.setSpacing(5);

		// add menubar and textarea to root
		MenuBar menuBar = EditorMenuBar.createMenuBar();
		TextArea textArea = EditorTextArea.createTextArea(width, height);
		root.getChildren().addAll(menuBar, textArea);

		// create the whole thing
 		Scene scene = new Scene(root, width, height);
        	stage.setTitle("Simple TextEditor Yo");
        	stage.setScene(scene);
        	stage.show();
    	}
	
 	public static void main(String[] args) {
        	launch(args);
    	}
}
