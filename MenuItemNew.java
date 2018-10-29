package pvdk84.editor;

import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

/*
 * Constructor like function for menu item "new".
 * On click, the item "new" clears the text area.
 */
 
public class MenuItemNew {
	
	// init menu item "new"
	private static MenuItem menuItemNew = new MenuItem("New");

	// add functionality to clear text area upon click
	public static MenuItem createMenuItemNew() {
		
		TextArea textArea = EditorTextArea.getTextArea();

		menuItemNew.setOnAction(action -> {
            		MenuItemNew.clearTextArea(textArea);
        	});

		return menuItemNew;
	}

	// functionality to clear text area
	private static void clearTextArea(TextArea textArea) {
		
		textArea.clear();	
	} 
}