import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

import java.io.File;
import java.io.IOException;

public class Window {

  public void AddConstraints(GridBagConstraints gbc, int widthVal, double weightxVal,
                        double weightyVal, int xVal, int yVal) {
    gbc.gridwidth = widthVal;
    gbc.weightx = weightxVal;
    gbc.weighty = weightyVal;
    gbc.gridx = xVal;
    gbc.gridy = yVal;
  }

  public JPanel MakePanels() {
    JPanel panels = new JPanel(new CardLayout());
    JPanel mainPanel = new JPanel(new GridBagLayout());
    JPanel editPanel = new JPanel(new GridBagLayout());

    JLabel intro1 = new JLabel("Welcome to Personal Text Editor V1.0!");
    JLabel intro2 = new JLabel("Click 'OK' to begin.");

    JButton okButton = new JButton("OK");
    JButton backButton = new JButton("<< Back");
    JButton nextButton = new JButton("Next >>");

    JTextArea txtFld = new JTextArea();
    txtFld.setPreferredSize(new Dimension(706,420));
    txtFld.setLineWrap(true);
    Font txtFont = new Font("SansSerif", Font.PLAIN, 15);
    txtFld.setFont(txtFont);

    txtFld.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent e) {
        txtFld.setEditable(false);
      }

      public void focusLost(FocusEvent e) {
        txtFld.setEditable(true);
      }
    });

    editPanel.add(txtFld);

    GridBagConstraints gbc = new GridBagConstraints();

    gbc.fill = GridBagConstraints.NONE;
    gbc.anchor = GridBagConstraints.NORTH;
    gbc.insets = new Insets(150,0,0,0);  // (Top, Left, Bottom, Right)
    AddConstraints(gbc,0,0,0.5,0,0);
    mainPanel.add(intro1, gbc);

    gbc.fill = GridBagConstraints.NONE;
    gbc.anchor = GridBagConstraints.NORTH;
    gbc.insets = new Insets(175,0,0,0);
    AddConstraints(gbc,0,0,0.5,0,0);
    mainPanel.add(intro2, gbc);

    gbc.fill = GridBagConstraints.NONE;
    gbc.anchor = GridBagConstraints.NORTH;
    gbc.insets = new Insets(225,0,0,0);
    AddConstraints(gbc,0,0,0.5,0,0);
    mainPanel.add(okButton, gbc);

    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.anchor = GridBagConstraints.NORTH;
    gbc.insets = new Insets(0,0,0,0);
    AddConstraints(gbc,0,1,0.5,0,0);
    editPanel.add(GetMenu(), gbc);

    gbc.fill = GridBagConstraints.NONE;
    gbc.anchor = GridBagConstraints.PAGE_END;
    gbc.insets = new Insets(0,0,10,100);
    AddConstraints(gbc,0,0,0,0,1);
    editPanel.add(backButton, gbc);

    gbc.fill = GridBagConstraints.NONE;
    gbc.anchor = GridBagConstraints.PAGE_END;
    gbc.insets = new Insets(0,100,10,0);
    AddConstraints(gbc,0,0,0,0,1);
    editPanel.add(nextButton, gbc);

    panels.add(mainPanel, "Panel 1");
    panels.add(editPanel, "Panel 2");

    CardLayout panel = (CardLayout) panels.getLayout();
    panel.show(panels, "Panel 1");


    okButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e1) {
        panel.show(panels, "Panel 2");
      }
    });

    backButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e1) {
        panel.previous(panels);
      }
    });

    return panels;
  }

  // Creates a new object of JMenuBar and returns it.
  public JMenuBar GetMenu() {
    final JMenuBar menuBar = new JMenuBar();

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

    JMenuItem info = new JMenuItem("Info");

    tab1.add(open);
    tab1.add(save);
    tab1.add(exit1);
    tab4.add(info);

    menuBar.add(tab1);
    menuBar.add(tab2);
    menuBar.add(tab3);
    menuBar.add(tab4);

    return menuBar;
  }

  // Opens a window application.
  public Window(int width, int height, String title) {
    JFrame MyWindow = new JFrame(title);
    JPanel p = MakePanels();

    // Will automatically close the application upon exiting.
    MyWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    MyWindow.setPreferredSize(new Dimension(width, height));

    MyWindow.pack(); // Sizes the frame
    MyWindow.setLocationRelativeTo(null); // Sets the location of the program to the middle of the screen
    //window.setJMenuBar(GetMenu()); // Sets the Menu Bar
    MyWindow.add(p); // Adds panel(s)

    MyWindow.setVisible(true);
  }
}
