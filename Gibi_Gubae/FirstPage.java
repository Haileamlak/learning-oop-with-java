import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// import javax.swing.JPasswordField;
// import javax.swing.JTable;
// import javax.swing.JTextArea;
// import javax.swing.JTextField;
// import javax.swing.SwingConstants;
// import javax.swing.border.Border;
// import javax.swing.BoxLayout;
// import javax.swing.border.Border;

import java.awt.*;
// import javax.swing.event.*;
// import javax.swing.plaf.ColorChooserUI;

public class FirstPage extends JFrame {
    JPanel pp;
    JButton guest, member, admin, newUser;
    public static Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();

    public static void main(String[] args) {
        FirstPage fp = new FirstPage();
        fp.setVisible(true);
    }

    public FirstPage() {
        super("፬ ኪሎ ግቢ ጉባኤ");
        setFont(new Font("Power Geez Unicode1", Font.BOLD, 14));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds((int) center.getX() - 450, (int) center.getY() - 350, 900, 700);
        getContentPane().setBackground(Color.WHITE);
 
        ImageIcon logoImage = new ImageIcon("mklogo.png");
        JLabel logo = new JLabel(logoImage);
        // logo.setBounds(10,10,200,200);;
        logo.setBounds(50, 70, logoImage.getIconWidth(), logoImage.getIconHeight());
        add(logo);

        JLabel welcome = new JLabel("እንኳን በደኅና መጡ።");
        welcome.setFont(new Font("Power Geez Unicode1", Font.BOLD, 50));
        welcome.setBounds(200, 80, 500, 75);
        welcome.setForeground(Color.ORANGE);
        add(welcome);

        pp = new JPanel(new GridLayout(2, 2, 20,20));
        pp.setBounds(200, 200, 500, 300);

        guest = new JButton("GUEST");
        guest.setBackground(new Color(0, 150, 250));
        guest.setForeground(Color.white);
        guest.setFont(new Font("Power Geez Unicode1", Font.BOLD, 25));
        // guest.addActionListener(l);
        pp.add(guest);

        member = new JButton("MEMBER");
        member.setBackground(new Color(0, 150, 250));
        member.setForeground(Color.white);
        member.setFont(new Font("Power Geez Unicode1", Font.BOLD, 25));

        // member.addActionListener(l);
        pp.add(member);

        admin = new JButton("ADMIN");
        admin.setBackground(new Color(0, 150, 250));
        admin.setForeground(Color.white);
        admin.setFont(new Font("Power Geez Unicode1", Font.BOLD, 25));

        // admin.addActionListener(l);
        pp.add(admin);

        newUser = new JButton("newUser");
        newUser.setBackground(new Color(0, 150, 150));
        newUser.setForeground(Color.white);
        newUser.setFont(new Font("Power Geez Unicode1", Font.BOLD, 25));

        // newUser.addActionListener(l);
        pp.add(newUser);

        add(pp);
    }
}
