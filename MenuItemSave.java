package pvdk84.editor;

import java.io.*;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/*
 * Constructor like function for menu item "save".
 * On click, the item "save" opens filechooser for saving files.
 */
 
public class MenuItemSave {

	// init menu item "save"
	private static MenuItem menuItemSave = new MenuItem("Save");

	// add functionality to open filechooser for saving files
	public static MenuItem createMenuItemSave() {
		
		menuItemSave.setOnAction(action -> {
            		MenuItemSave.saveFile(Editor.getStage());
        	});

		return menuItemSave;
	}

	// functionality to open filechooser and save file
	private static void saveFile(Stage stage) {

		FileChooser fileChooser = new FileChooser();

		TextArea textArea = EditorTextArea.getTextArea();

		String textToSave = textArea.getText(); 

        	try {
			File file = fileChooser.showSaveDialog(stage);

     			if (file != null) {
                		PrintWriter fileToSave = new PrintWriter(file);
                		BufferedWriter bufferedWriter = new BufferedWriter(fileToSave);
                		bufferedWriter.write(textToSave);
                		bufferedWriter.close();
            		}
		} catch (FileNotFoundException e) {
            		System.out.println("Error: " + e);
        	} catch (IOException e) {
            		e.printStackTrace();
        	}
	}
}