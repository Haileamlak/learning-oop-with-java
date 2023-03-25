
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SpinnerModel;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame.JDesktopIcon;
import javax.swing.border.Border;
import javax.swing.BoxLayout;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.Shape;
import java.util.Date;
import java.util.Vector;
import java.awt.Component.*;
import javax.swing.event.*;

public class DateConvert extends JFrame {
    JTextField p1, p2;
    JTextField nameTextField;
    JPasswordField passPassField;
    public static Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();

    public static void main(String[] args) {
        DateConvert dc = new DateConvert();
        dc.setVisible(true);
    }

    DateConvert() {
        super("፬ ኪሎ ግቢ ጉባኤ");
        setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds((int) center.getX() - 450, (int) center.getY() - 350, 900, 700);
        getContentPane().setBackground(new Color(0, 153, 204));
        ;// new Color(0, 150, 300)

        p1 = new JTextField(null);
        p1.setBounds(20, 40, 420, 600);
        p1.setBackground(Color.white);
        add(p1);

        p2 = new JTextField(null);
        p2.setBounds(460, 40, 400, 600);
        p2.setBackground(new Color(0, 153, 204));
        add(p2);

        JTextField grDay = new JTextField(2);
        grDay.setBackground(new Color(255, 153, 0));
        grDay.setBounds(40, 100, 70, 60);
        grDay.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        grDay.setForeground(new Color(0, 153, 204));
        p2.add(grDay);

        JTextField grMonth = new JTextField(2);
        grMonth.setBounds(130, 100, 70, 60);
        grMonth.setText(grDay.getText());
        grMonth.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        p2.add(grMonth);

        JTextField grYear = new JTextField(4);
        grYear.setBounds(230, 100, 120, 60);
        grYear.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        p2.add(grYear);

        JTextField grDay2 = new JTextField(2);
        // grDay2.setBackground(Color.ORANGE);
        grDay2.setBounds(40, 175, 70, 60);
        grDay2.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        grDay2.setForeground(new Color(0, 153, 204));
        p2.add(grDay2);

        JTextField grMonth2 = new JTextField(2);
        grMonth2.setBounds(130, 175, 70, 60);
        grMonth2.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        p2.add(grMonth2);

        JTextField grYear2 = new JTextField(4);
        grYear2.setBounds(230, 175, 120, 60);
        grYear2.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        p2.add(grYear2);

        JTextField grDay3 = new JTextField(2);
        // grDay3.setBackground(Color.ORANGE);
        grDay3.setBounds(40, 250, 70, 60);
        grDay3.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        grDay3.setForeground(new Color(0, 153, 204));
        p2.add(grDay3);

        JTextField grMonth3 = new JTextField(2);
        grMonth3.setBounds(130, 250, 70, 60);
        grMonth3.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        p2.add(grMonth3);

        JTextField grYear3 = new JTextField(4);
        grYear3.setBounds(230, 250, 120, 60);
        grYear3.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        p2.add(grYear3);

        JTextField etDay = new JTextField(2);
        etDay.setBackground(new Color(255, 153, 0));
        etDay.setBounds(40, 100, 70, 60);
        etDay.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        etDay.setForeground(Color.white);
        p1.add(etDay);

        JTextField etMonth = new JTextField(2);
        etMonth.setBackground(new Color(0, 153, 204));
        etMonth.setBounds(130, 100, 70, 60);
        etMonth.setForeground(Color.white);
        etMonth.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        p1.add(etMonth);

        JTextField etYear = new JTextField(4);
        etYear.setBackground(new Color(0, 153, 204));
        etYear.setBounds(230, 100, 120, 60);
        etYear.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        p1.add(etYear);

        JTextField etDay2 = new JTextField(2);
        etDay2.setBackground(new Color(0, 153, 204));
        etDay2.setBounds(40, 175, 70, 60);
        etDay2.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        etDay2.setForeground(new Color(0, 153, 204));
        p1.add(etDay2);

        JTextField etMonth2 = new JTextField(2);
        etMonth2.setBackground(new Color(0, 153, 204));
        etMonth2.setBounds(130, 175, 70, 60);
        etMonth2.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        p1.add(etMonth2);

        JTextField etYear2 = new JTextField(4);
        etYear2.setBackground(new Color(0, 153, 204));
        etYear2.setBounds(230, 175, 120, 60);
        etYear2.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        p1.add(etYear2);

        JTextField etDay3 = new JTextField(2);
        etDay3.setBackground(new Color(0, 153, 204));
        etDay3.setBounds(40, 250, 70, 60);
        etDay3.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        etDay3.setForeground(new Color(0, 153, 204));
        p1.add(etDay3);

        JTextField etMonth3 = new JTextField(2);
        etMonth3.setBackground(new Color(0, 153, 204));
        etMonth3.setBounds(130, 250, 70, 60);
        etMonth3.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        p1.add(etMonth3);

        JTextField etYear3 = new JTextField(4);
        etYear3.setBackground(new Color(0, 153, 204));
        etYear3.setBounds(230, 250, 120, 60);
        etYear3.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        p1.add(etYear3);
    }

    // JTextField gettxtFastel() {
        
    // }
}
