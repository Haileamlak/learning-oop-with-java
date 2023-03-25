import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.BoxLayout;
import javax.swing.border.Border;
import javax.swing.filechooser.*;
import java.awt.*;
import java.util.Vector;

import javax.swing.event.*;

public class NewAccount extends JFrame {

    public static Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
    String des = "     በኢ/ኦ/ተ/ቤ/ክ/በሰ/ት/ቤቶች\n      ማደራጃ እና መምሪያ \n        ማኅበረ ቅዱሳን\n       ፬ ኪሎ ግቢ ጉባኤ";

    public static void main(String[] args) {
        NewAccount nacc = new NewAccount();
        nacc.setVisible(true);
    }

    NewAccount() {
        super("፬ ኪሎ ግቢ ጉባኤ");
        setFont(new Font("Power Geez Unicode1", Font.BOLD, 25));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds((int) center.getX() - 475, (int) center.getY() - 375, 950, 750);
        getContentPane().setBackground(new Color(45, 167, 199));// new Color(0, 150, 250)

        JPanel p1 = new JPanel(null);
        p1.setBackground(Color.white);
        p1.setBounds(10, 10, 440, 700);
        add(p1);

        // JScrollPane ppan = new JScrollPane(p1, 
        //         JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        // ppan.setBounds(10,10,300,300);
        // add(ppan);

        // JFileChooser chooser = new JFileChooser();
        // chooser.setBounds(290, 40, 200, 200);
        // FileNameExtensionFilter filter = new FileNameExtensionFilter(
        //         "JPG & GIF Images", "jpg", "gif");
        // chooser.setFileFilter(filter);
        // int returnVal = chooser.showOpenDialog(null);
        // if (returnVal == JFileChooser.APPROVE_OPTION) {
        //     System.out.println("You chose to open this file: " +
        //             chooser.getSelectedFile().getName());
        // }  

        // p1.add(chooser);

        JButton photoChooser = new JButton("Add Photo");
        photoChooser.setBounds(300, 240, 100, 30);
        p1.add(photoChooser);

        JLabel idLabel = new JLabel("ID Number");
        idLabel.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 14));
        idLabel.setBounds(20, 40, 250, 35);
        p1.add(idLabel);

        JTextField idNo = new JTextField(15);
        idNo.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 16));
        idNo.setBounds(20, 75, 250, 35);
        p1.add(idNo);

        JLabel fnameLabel = new JLabel("First Name");
        fnameLabel.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 14));
        fnameLabel.setBounds(20, 110, 250, 35);
        p1.add(fnameLabel);

        JTextField fName = new JTextField(15);
        fName.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 16));
        fName.setBounds(20, 145, 250, 35);
        p1.add(fName);

        JLabel lnameLabel = new JLabel("Last Name");
        lnameLabel.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 14));
        lnameLabel.setBounds(20, 180, 250, 35);
        p1.add(lnameLabel);

        JTextField lName = new JTextField(15);
        lName.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 16));
        lName.setBounds(20, 215, 250, 35);
        p1.add(lName);

        JLabel snameLabel = new JLabel("Spritual Name");
        snameLabel.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 14));
        snameLabel.setBounds(20, 250, 250, 35);
        p1.add(snameLabel);

        JTextField sName = new JTextField(15);
        sName.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 16));
        sName.setBounds(20, 285, 250, 35);
        p1.add(sName);

        JLabel pnumLabel = new JLabel("Phone Number");
        pnumLabel.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 14));
        pnumLabel.setBounds(20, 320, 250, 35);
        p1.add(pnumLabel);

        JTextField pNum = new JTextField(15);
        pNum.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 16));
        pNum.setBounds(20, 355, 250, 35);
        p1.add(pNum);

        JLabel emailLabel = new JLabel("e-Mail");
        emailLabel.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 14));
        emailLabel.setBounds(20, 390, 250, 35);
        p1.add(emailLabel);

        JTextField eMail = new JTextField(15);
        eMail.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 16));
        eMail.setBounds(20, 425, 250, 35);
        p1.add(eMail);

        Vector dept = new Vector<String>();
        dept.add("Physics");
        dept.add("Chemistry");
        dept.add("Biology");
        dept.add("Mathematics");
        dept.add("Statistics");
        dept.add("Geology");
        dept.add("Computer Science");
        dept.add("Engineering");
        dept.add("Other");

        JLabel deptLabel = new JLabel("Department");
        deptLabel.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 16));
        deptLabel.setBounds(20, 460, 100, 35);
        p1.add(deptLabel);

        JComboBox deptList = new JComboBox(dept);
        deptList.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 14));
        deptList.setBounds(20, 495, 250, 35);
        deptList.setBackground(Color.white);
        p1.add(deptList);

        Vector batch = new Vector<String>();
        batch.add("First Year");
        batch.add("Second Year");
        batch.add("Third Year");
        batch.add("Fourth Year");
        batch.add("Fifth Year");
        batch.add("Other");

        JLabel batchLabel = new JLabel("Batch");
        batchLabel.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 16));
        batchLabel.setBounds(20, 530, 100, 35);
        p1.add(batchLabel);

        JComboBox batchList = new JComboBox(batch);
        batchList.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 12));
        batchList.setBounds(20, 565, 250, 35);
        batchList.setBackground(Color.white);
        p1.add(batchList);

        JLabel passLabel = new JLabel("Password");
        passLabel.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 14));
        passLabel.setBounds(20, 600, 250, 35);
        p1.add(passLabel);

        JPasswordField password = new JPasswordField(15);
        password.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 16));
        password.setBounds(20, 635, 250, 35);
        p1.add(password);

    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        g.drawRoundRect(300, 120, 150, 150, 15, 15);
    }
}
