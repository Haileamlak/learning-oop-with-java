import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.BoxLayout;
import javax.swing.border.Border;

import java.awt.*;
import javax.swing.event.*;
import javax.swing.plaf.ColorChooserUI;

public class ColorChooser {
    public static void main(String[] args) {
        JFrame fff = new JFrame();
        fff.setSize(700,700);
        fff.setLayout(new GridLayout(16, 16));
        for (int i = 0; i < 256; i++) {
            JButton bt = new JButton(Character.toString(i));
            bt.setBackground(new Color(i));
            fff.add(bt);
        }
        fff.setVisible(true);
    }
}
