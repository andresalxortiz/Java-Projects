import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public class Window {


  // Creates a new object of JMenuBar and returns it.
  public JMenuBar GetMenu() {
    final JMenuBar menuBar = new JMenuBar();
    // Textfield t = new Textfield();

    JMenu tab1 = new JMenu("File");
    JMenu tab2 = new JMenu("Edit");
    JMenu tab3 = new JMenu("Help");
    JMenu tab4 = new JMenu("About");

    JMenuItem open = new JMenuItem("Open");
    open.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          Desktop.getDesktop().open(new File("C:/ProgramData"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
      }
    });

    JMenuItem save = new JMenuItem("Save");
    JMenuItem exit1 = new JMenuItem("Exit");

    JMenuItem t3_slot1 = new JMenuItem("Giovanna");
    JMenuItem t3_slot2 = new JMenuItem("is");
    JMenuItem t3_slot3 = new JMenuItem("a");
    JMenuItem t3_slot4 = new JMenuItem("LOSER");

    JMenuItem info = new JMenuItem("Info");

    tab1.add(open);
    tab1.add(save);
    tab1.add(exit1);
    tab3.add(t3_slot1);
    tab3.add(t3_slot2);
    tab3.add(t3_slot3);
    tab3.add(t3_slot4);
    tab4.add(info);

    menuBar.add(tab1);
    menuBar.add(tab2);
    menuBar.add(tab3);
    menuBar.add(tab4);

    return menuBar;
  }

  // Opens a window application.
  public Window(int width, int height, String title) {
    JFrame window = new JFrame(title);

    // Will automatically close the application upon exiting.
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    window.setPreferredSize(new Dimension(width, height));
    window.setMaximumSize(new Dimension(width, height));
    window.setMinimumSize(new Dimension(width, height));

    window.setLocationRelativeTo(null); // Sets the location of the program to the middle of the screen
    window.setLayout(null);
    window.setJMenuBar(GetMenu());
    window.setVisible(true);
  }
}
