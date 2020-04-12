import java.awt.Dimension;

public class TextEditor {
  // Algorithm for 4:3 Aspect ratio.
  public static final int WIDTH = 720, HEIGHT = (WIDTH / 12) * 9;

  public TextEditor() {
    new Window(WIDTH, HEIGHT, "Text Editor");
  }

  public static void main(String[] args) {
    new TextEditor();
  }
}
