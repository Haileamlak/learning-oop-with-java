// package Gibi_Gubae;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame.JDesktopIcon;
import javax.swing.border.Border;
import javax.swing.BoxLayout;
import javax.swing.border.Border;

import java.awt.*;
import java.util.Vector;
import java.awt.Component.*;
import javax.swing.event.*;

public class Login extends JFrame {
    JPanel p1, p2;
    JTextField nameTextField;
    JPasswordField passPassField;
    public static Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
    String des = "     በኢ/ኦ/ተ/ቤ/ክ/በሰ/ት/ቤቶች\n      ማደራጃ እና መምሪያ \n        ማኅበረ ቅዱሳን\n       ፬ ኪሎ ግቢ ጉባኤ";

    public static void main(String[] args) {
        String loginType = "an Admin";
        Login log = new Login(loginType);
        log.setVisible(true);
    }

    public Login(String loginType) {
        super("፬ ኪሎ ግቢ ጉባኤ");
        setFont(new Font("Power Geez Unicode1", Font.BOLD, 25));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds((int) center.getX() - 450, (int) center.getY() - 350, 900, 700);
        getContentPane().setBackground(new Color(45, 167, 199));// new Color(0, 150, 250)
        
        
        p1 = new JPanel(null);
        p1.setBackground(new Color(45, 167, 199));
        p1.setBounds(20, 20, 420, 620);
        p2 = new JPanel(null);
        p2.setBounds(460, 20, 400, 620);
        p2.setBackground(Color.white);

        ImageIcon logoImage = new ImageIcon("mklogo.png");
        JLabel logo = new JLabel(logoImage);
        logo.setBounds(50, 50, logoImage.getIconWidth(), logoImage.getIconHeight());
        // logo.setBackground(Color.green);
        p1.add(logo);

        JTextArea desField = new JTextArea(5, 20);
        desField.setBounds(10, 370, 400, 250);
        desField.setLineWrap(true);
        desField.setEditable(false);
        desField.setFont(new Font("Power Geez Unicode1", Font.BOLD, 25));
        desField.setForeground(Color.white);// new Color(255, 155, 77)
        desField.setBackground(new Color(45, 167, 199));
        desField.setText(des);
        p1.add(desField);

        add(p1);
        
        JLabel loginAs = new JLabel("Login as " + loginType);
        loginAs.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 24));
        loginAs.setBounds(50, 30, 400, 50);
        loginAs.setForeground(new Color(0, 150, 250));
        p2.add(loginAs);

        nameTextField = new JTextField("የተጠቃሚ ስም", 15);
        nameTextField.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 16));
        nameTextField.setBounds(50, 150, 210, 50);
        nameTextField.setBackground(Color.white);
        p2.add(nameTextField);


        passPassField = new JPasswordField("የይልፍ ቃል", 15);
        passPassField.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 16));
        passPassField.setBounds(50, 220, 210, 50);
        p2.add(passPassField);

        Vector vv = new Vector<String>();
        vv.add("አገልግሎት ክፍል 1");
        vv.add("አገልግሎት ክፍል 2");
        vv.add("አገልግሎት ክፍል 3");
        vv.add("አገልግሎት ክፍል 4");
        vv.add("አገልግሎት ክፍል 5");
        vv.add("አገልግሎት ክፍል 6");
        vv.add("አገልግሎት ክፍል 7");
        vv.add("አገልግሎት ክፍል 8");
        vv.add("አገልግሎት ክፍል 9");
        vv.add("አገልግሎት ክፍል 10");
        vv.add("አገልግሎት ክፍል 11");
        vv.add("አገልግሎት ክፍል 12");
        vv.add("አገልግሎት ክፍል 13");
        vv.add("አገልግሎት ክፍል 14");

        JComboBox pp = new JComboBox(vv);
        pp.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 12));
        pp.setBounds(120, 110,140, 30);
        // pp.setForeground(new Color(0, 150, 250));
        p2.add(pp);

        JButton logButton = new JButton("LOGIN");
        logButton.setFont(new Font("Power Geez Unicode1", Font.BOLD, 16));
        // logButton.setIcon(logoImage);
        logButton.setBounds(50, 290, 210, 50);
        logButton.setBackground(new Color(0, 150, 250));
        logButton.setMargin(new Insets(10, 20, 10, 20));
        logButton.setForeground(Color.white);
        p2.add(logButton);

        JLabel forgot = new JLabel("Forgot Password?");
        forgot.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 15));
        forgot.setBounds(50,350,250,50);
        forgot.setForeground(new Color(0, 150, 250));
        forgot.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p2.add(forgot);
 
        JLabel noAccount = new JLabel("Don`t have an account? Create new Account");
        noAccount.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 15));
        noAccount.setBounds(50, 390, 400, 50);
        noAccount.setForeground(new Color(0, 150, 250));
        p2.add(noAccount);

        add(p2);
        // add(tb);
    }
}