package pvdk84.editor;
 
import pvdk84.editor.EditorTextArea;
import javafx.scene.control.TextArea;

 
public class EditorTextArea {

	public static TextArea createTextArea(int width, int height) {

		TextArea textArea = new TextArea();
		textArea.setPrefSize(width, height);

		return textArea;
	}
}
