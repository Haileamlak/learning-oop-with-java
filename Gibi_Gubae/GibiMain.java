
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
import java.lang.reflect.Member;

import javax.swing.event.*;
import javax.swing.table.TableModel;

public class GibiMain extends JFrame {
    JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7;

    public Color butbackColor = new Color(255, 153, 0);
    public Color butfrontColor = Color.black;
    public Color butbackColor2 = Color.white;
    public Color butfrontColor2 = new Color(0, 153, 204);

    public static Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();

    public static void main(String[] args) {
        GibiMain gibi = new GibiMain();
        gibi.setVisible(true);
    }

    GibiMain() {
        super("፬ ኪሎ ግቢ ጉባኤ");
        setFont(new Font("Power Geez Unicode1", Font.BOLD, 14));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds((int) center.getX() - 475, (int) center.getY() - 375, 950, 750);
        // getContentPane().setBackground(Color.WHITE);
        JPanel barPanel = menuPanel(1);
        add(barPanel);
        JPanel pp = new ProfilePage();
        add(pp);
    }

    JPanel menuPanel(int index) {
        JPanel pan = new JPanel(new FlowLayout());
        pan.setBounds(50, 10, 850, 40);
        pan.setBackground(Color.white);

        bt1 = new JButton("Home");
        bt1.setFont(new Font("Power Geez Unicode1", Font.BOLD, 18));
        bt1.setBounds(index == 1 ? 121 : 50, 10, 250, 60);
        // bt1.addActionListener(this);
        bt1.setActionCommand("Buttons");
        bt1.setBackground(index == 1 ? butbackColor2 : butbackColor);
        bt1.setForeground(index == 1 ? butfrontColor2 : butfrontColor);
        bt1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pan.add(bt1);

        bt2 = new JButton("Library");
        bt2.setFont(new Font("Power Geez Unicode1", Font.BOLD, 18));
        bt2.setBounds(index == 2 ? 121 : 50, 100, 250, 60);
        // bt2.addActionListener(this);
        bt2.setActionCommand("bUttons");
        bt2.setBackground(index == 2 ? butbackColor2 : butbackColor);
        bt2.setForeground(index == 2 ? butfrontColor2 : butfrontColor);
        bt2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pan.add(bt2);

        bt3 = new JButton("Serv-Dept");
        bt3.setFont(new Font("Power Geez Unicode1", Font.BOLD, 18));
        bt3.setBounds(index == 3 ? 121 : 50, 190, 250, 60);
        // bt3.addActionListener(this);
        bt3.setActionCommand("buTtons");
        bt3.setBackground(index == 3 ? butbackColor2 : butbackColor);
        bt3.setForeground(index == 3 ? butfrontColor2 : butfrontColor);
        bt3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pan.add(bt3);

        bt4 = new JButton("Beteseb");
        bt4.setFont(new Font("Power Geez Unicode1", Font.BOLD, 18));
        bt4.setBounds(index == 4 ? 121 : 50, 280, 250, 60);
        // bt4.addActionListener(this);
        bt4.setActionCommand("butTons");
        bt4.setBackground(index == 4 ? butbackColor2 : butbackColor);
        bt4.setForeground(index == 4 ? butfrontColor2 : butfrontColor);
        bt4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pan.add(bt4);

        bt5 = new JButton("Channel");
        bt5.setFont(new Font("Power Geez Unicode1", Font.BOLD, 18));
        bt5.setBounds(index == 5 ? 121 : 50, 370, 250, 60);
        // bt5.addActionListener(this);
        bt5.setActionCommand("buttOns");
        bt5.setBackground(index == 5 ? butbackColor2 : butbackColor);
        bt5.setForeground(index == 5 ? butfrontColor2 : butfrontColor);
        bt5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pan.add(bt5);

        bt6 = new JButton("Group");
        bt6.setFont(new Font("Power Geez Unicode1", Font.BOLD, 18));
        bt6.setBounds(index == 6 ? 121 : 50, 460, 250, 60);
        // bt6.addActionListener(this);
        bt6.setActionCommand("buttoNs");
        bt6.setBackground(index == 6 ? butbackColor2 : butbackColor);
        bt6.setForeground(index == 6 ? butfrontColor2 : butfrontColor);
        bt6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pan.add(bt6);

        return pan;
    }

    private class ProfilePage extends JPanel {

        ProfilePage() {
            super(null);
            setBackground(Color.white);
            setBounds(25, 100, 880, 585);

            JButton photobt = new JButton("Change Profile Picture");
            photobt.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 12));
            photobt.setBounds(30, 220, 130, 30);
            // photobt.addActionListener(this);
            photobt.setActionCommand("buttonS");
            photobt.setBackground(butbackColor);
            photobt.setForeground(butfrontColor);
            photobt.setCursor(new Cursor(Cursor.HAND_CURSOR));
            add(photobt);

            JButton myAttendbt = new JButton("My Attendance");
            myAttendbt.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 12));
            myAttendbt.setBounds(500, 20, 130, 30);
            // myAttendbt.addActionListener(this);
            myAttendbt.setActionCommand("buttonS");
            myAttendbt.setBackground(butbackColor);
            myAttendbt.setForeground(butfrontColor);
            myAttendbt.setCursor(new Cursor(Cursor.HAND_CURSOR));
            add(myAttendbt);

            JButton editProf = new JButton("Edit Profile");
            editProf.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 12));
            editProf.setBounds(700, 20, 130, 30);
            // editProf.addActionListener(this);
            editProf.setActionCommand("buttonS");
            editProf.setBackground(butbackColor);
            editProf.setForeground(butfrontColor);
            editProf.setCursor(new Cursor(Cursor.HAND_CURSOR));
            add(editProf);

            // JTextField idNo = new JTextField("UGR/4204/13",15);
            // idNo.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 16));
            // idNo.setBounds(180, 50, 200, 35);
            // idNo.setBackground(Color.white);
            // idNo.setEditable(false);
            // add(idNo);

            // JTextField Name = new JTextField(15);
            // Name.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 16));
            // Name.setBounds(180, 145, 200, 35);
            // add(Name);

            // JTextField sName = new JTextField(15);
            // sName.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 16));
            // sName.setBounds(180, 285, 200, 35);
            // add(sName);

            // JTextField pNum = new JTextField(15);
            // pNum.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 16));
            // pNum.setBounds(180, 355, 200, 35);
            // add(pNum);

            // JTextField eMail = new JTextField(15);
            // eMail.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 16));
            // eMail.setBounds(180, 425, 200, 35);
            // add(eMail);

        }

        @Override
        protected void paintComponent(Graphics g) {
            // TODO Auto-generated method stub
            super.paintComponent(g);
            g.setColor(Color.white);// (175, 40, 250, 200, 5, 5,true);
            g.fill3DRect(175, 40, 250, 200, true);
            g.setColor(Color.black);
            g.drawRoundRect(25, 25, 140, 185, 15, 15);
            g.drawString("ID : ", 180, 70);
            g.drawString("Name : ", 180, 110);
            g.drawString("Spritual Name : ", 180, 150);
            g.drawString("Service Department : ", 180, 190);
            g.drawString("Department : ", 25, 320);
            g.drawString("Batch : ", 25, 370);
            g.drawString("P.No : ", 25, 420);
            g.drawString("e-Mail : ", 25, 470);
            // g.drawRoundRect(170, 90, 250, 30, 5, 5);
            // g.drawRoundRect(170, 130, 250, 30, 5, 5);
            // g.drawRoundRect(170, 170, 250, 60, 5, 5);
            g.drawRoundRect(15, 300, 300, 40, 5, 5);
            g.drawRoundRect(15, 350, 300, 40, 5, 5);
            g.drawRoundRect(15, 400, 300, 40, 5, 5);
            g.drawRoundRect(15, 450, 300, 40, 5, 5);

            g.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 16));
            g.drawString("UGR/4204/13 ", 210, 70);
            g.drawString("Haileamlak Belachew", 230, 110);
            g.drawString("ወልደ ሩፋኤል", 280, 150);
            g.drawString("ሙያና በጎ አድራጎት", 210, 220);
            g.drawString("Computer Science ", 110, 330);
            g.drawString("2nd Year", 80, 380);
            g.drawString("0906397248", 80, 430);
            g.drawString("haileamlakbeat@gmail.com", 80, 480);

        }
    }

    private class Members extends JPanel {

        Members() {
            super(null);
            setBackground(Color.white);
            setBounds(25, 100, 880, 585);

            Vector<String> ascDecs = new Vector<>();
            ascDecs.add("A-Z");
            ascDecs.add("Z-A");

            JComboBox id = new JComboBox<>(ascDecs);
            id.setBounds(25, 50, 100, 30);
            add(id);

            JTable tt = new JTable(100, 10);
            tt.setBounds(25, 25, 850, 550);
            add(tt);
        }
        @Override
        protected void paintComponent(Graphics g) {
            // TODO Auto-generated method stub
            super.paintComponent(g);
            g.drawRoundRect(5, 5, 870, 570, 15, 15);
        }
    }

}
