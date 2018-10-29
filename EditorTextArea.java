package pvdk84.editor;

import javafx.scene.control.TextArea;

/*
 * Constructor like function for textarea.
 * (Didn't make an actual constructor, because this can't be added to root.)
 */
 
public class EditorTextArea {

	// init text area
	private static TextArea textArea = new TextArea();

	// set pre-defined size
	public static TextArea createTextArea(int width, int height) {

		textArea.setPrefSize(width, height);

		return textArea;
	}

	public static TextArea getTextArea() {

		return textArea;
	}	
}
