package pvdk84.editor;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pvdk84.editor.EditorMenuBar;
import pvdk84.editor.EditorTextArea;

/*
 * Just a simple text editor.
 * With a menubar and a textarea.
 * And menubar has menu "file" with items "new", "open", and "save".
 */

 
public class Editor extends Application {

	// set variables
	private static Stage stage;
	private static int width = 600;
	private static int height = 400;
	private static String title = "Simple Text Editor";

 	public static Stage getStage() {
        	return stage;
    	}
	
	@Override
	public void start(Stage stage) {

		// create vbox root for menubar and textarea
		VBox root = new VBox();
		root.setPadding(new Insets(10));
        	root.setSpacing(5);

		// create menubar and textarea and add to root
		MenuBar menuBar = EditorMenuBar.createMenuBar();
		TextArea textArea = EditorTextArea.createTextArea(width, height);
		root.getChildren().addAll(menuBar, textArea);

		// create the whole thing
 		Scene scene = new Scene(root, width, height);
        	stage.setTitle(title);
        	stage.setScene(scene);
        	stage.show();
    	}
	
 	public static void main(String[] args) {
        	launch(args);
    	}
}
