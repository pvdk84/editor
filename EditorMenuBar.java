package pvdk84.editor;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import pvdk84.editor.MenuFile;

/*
 * Constructor like function for menubar with menu file.
 * (Didn't make an actual constructor, because this can't be added to root.)
 */

public class EditorMenuBar {

	// init menubar
	private static MenuBar menuBar = new MenuBar();

	// add menu file
	public static MenuBar createMenuBar() {
				
		Menu menuFile = MenuFile.createMenuFile();
		
		menuBar.getMenus().addAll(
			menuFile
		);

		return menuBar;
	}
}
