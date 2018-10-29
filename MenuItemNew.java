package pvdk84.editor;

import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import pvdk84.editor.EditorTextArea;

/*
 * Constructor like function for menu item "new".
 * On click, the item "new" clears the text area.
 */
 
public class MenuItemNew {

	private static MenuItem menuItemNew = new MenuItem("New");

	public static MenuItem createMenuItemNew() {
		
		TextArea textArea = EditorTextArea.getTextArea();

		menuItemNew.setOnAction(action -> {
            		MenuItemNew.clearTextArea(textArea);
        	});

		return menuItemNew;
	}

	private static void clearTextArea(TextArea textArea) {
		
		textArea.clear();	
	} 
}