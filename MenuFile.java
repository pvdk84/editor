package pvdk84.editor;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import pvdk84.editor.MenuItemNew;
import pvdk84.editor.MenuItemOpen;
import pvdk84.editor.MenuItemSave;

/*
 * Constructor like function for menu file with items "new", "open", and "save".
 * (Didn't make an actual constructor, because this can't be added to menubar.)
 */
 
public class MenuFile {

	private static Menu menuFile = new Menu("File");

	public static Menu createMenuFile() {
		
		MenuItem menuItemNew = MenuItemNew.createMenuItemNew(); 
		MenuItem menuItemOpen = MenuItemOpen.createMenuItemOpen(); 
		MenuItem menuItemSave = MenuItemSave.createMenuItemSave(); 

		menuFile.getItems().addAll(
			menuItemNew,
			menuItemOpen,
			menuItemSave
		);

		return menuFile;
	}
}