package pvdk84.editor;

import java.io.*;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.*;
import javafx.stage.Stage;

/*
 * Constructor like function for menu item "open".
 * On click, the item "open" opens filechooser dialogue.
 * Only for "java" or "text" files.
 * And the chosen file is then added to the text area.
 */
 
public class MenuItemOpen {

	// init menu item "open"
	private static MenuItem menuItemOpen = new MenuItem("Open");

	// add functionality to open filechooser upon click
	public static MenuItem createMenuItemOpen() {
		
		menuItemOpen.setOnAction(action -> {
            		MenuItemOpen.openFile(Editor.getStage());
        	});

		return menuItemOpen;
	}

	// functionality to open filechooser for text and java files
	private static void openFile(Stage stage) {

		FileChooser fileChooser = new FileChooser();

		fileChooser.getExtensionFilters().addAll(
      			new ExtensionFilter("Text Files", "*.txt"),
         		new ExtensionFilter("Java Files", "*.java")
		);
		
		File file = fileChooser.showOpenDialog(stage);
		MenuItemOpen.addFileToTextArea(file);
	}

	// functionality to read file and add to textarea
	private static void addFileToTextArea(File file) {

		String text;

		TextArea textArea = EditorTextArea.getTextArea();
		textArea.clear();

        	try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            		while ((text = bufferedReader.readLine()) != null) {
                	textArea.appendText(text + "\n");
            		}
        	} catch (IOException e) {
            		e.printStackTrace();
        	}
	}
}