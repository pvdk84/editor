package pvdk84.editor;

import pvdk84.editor.Editor;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
 
public class EditorMenuBar {

	private static Stage stage;
	private static FileChooser fileChooser = new FileChooser();

	public static MenuBar createMenuBar() {
		

		// create menu dropdown "file"
		Menu menuFile = new Menu("File");

		// create menuitem "new"
		MenuItem menuFileNew = new MenuItem("New");
		menuFileNew.setOnAction(e -> {
            		Editor.
        	});


		// create menuitem "open"
		MenuItem menuFileOpen = new MenuItem("Open");
		menuFileOpen.setOnAction(e -> {
            		fileChooser.showOpenDialog(Editor.getStage());
			// load file, default file
        	});


		// create menuitem "save"
		MenuItem menuFileSave = new MenuItem("Save");


		menuFile.getItems().addAll(
			menuFileNew, 
			menuFileOpen, 
			menuFileSave);

		// create menubar for "file" dropdown 
		MenuBar menuBar = new MenuBar();		
		menuBar.getMenus().add(menuFile);
		
		return menuBar;
	}
}
