
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

public class ColorCc extends JFrame {

    JPanel p1, p2;
    JTextField nameTextField;
    JPasswordField passPassField;
    public static Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();

    public static void main(String[] args) {
        ColorCc fff = new ColorCc();
        fff.setVisible(true);
    }

    ColorCc() {
        super("፬ ኪሎ ግቢ ጉባኤ");
        setFont(new Font("Power Geez Unicode1", Font.BOLD, 25));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds((int) center.getX() - 450, (int) center.getY() - 350, 900, 700);
        getContentPane().setBackground(new Color(51,51,51));// new Color(0, 150, 250)

        JColorChooser jj = new JColorChooser();
        jj.setBounds(50, 50, 800, 600);
        add(jj);
    }
}










        // p2 = new JPanel(null);
        // p2.setBounds(370, 10, 500, 660);
        // p2.setBackground(Color.white);// new Color(0, 153, 204)
        // add(p2);

        // ImageIcon brana = new ImageIcon("brana - Copy.png");
        // JLabel branaLabel = new JLabel(brana);
        // branaLabel.setBounds(10, 0, brana.getIconWidth(), brana.getIconHeight());
        // p2.add(branaLabel);

        // JButton btup1 = new JButton("up");
        // btup1.setBounds(xMargin, yMargin, btxSize, btySize);
        // btup1.setBackground(Color.white);
        // p2.add(btup1);

        // JButton btup2 = new JButton("up");
        // btup2.setBounds(xMargin + 15 + btxSize, yMargin, btxSize, btySize);
        // btup2.setBackground(Color.white);
        // p2.add(btup2);

        // JButton btup3 = new JButton("up");
        // btup3.setBounds(xMargin + 40 + 2 * btxSize, yMargin, btxSize + 20, btySize);
        // btup3.setBackground(Color.white);
        // p2.add(btup3);

        // JTextField etDay = new JTextField(2);
        // etDay.setBackground(new Color(0, 177, 93));
        // etDay.setForeground(Color.white);
        // etDay.setBounds(xMargin - 5, yMargin + btySize + 5, btxSize + 10, btySize + 10);
        // etDay.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        // p2.add(etDay);

        // JTextField etMonth = new JTextField(2);
        // etMonth.setBackground(Color.yellow);// new Color(0, 153, 204));
        // etMonth.setForeground(Color.white);
        // etMonth.setBounds(xMargin + 10 + btxSize, yMargin + btySize + 5, btxSize + 10, btySize + 10);
        // etMonth.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        // p2.add(etMonth);

        // JTextField etYear = new JTextField(3);
        // etYear.setBackground(Color.red);// new Color(0, 153, 204));
        // etYear.setForeground(Color.white);
        // etYear.setBounds(xMargin + 30 + 2 * btxSize, yMargin + btySize + 5, btxSize + 40, btySize + 10);
        // etYear.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        // p2.add(etYear);

        // JButton btdw1 = new JButton("up");
        // btdw1.setBounds(xMargin, yMargin + 80, btxSize, btySize);
        // btdw1.setBackground(Color.white);
        // p2.add(btdw1);

        // JButton btdw2 = new JButton("up");
        // btdw2.setBounds(xMargin + 15 + btxSize, yMargin + 80, btxSize, btySize);
        // btdw2.setBackground(Color.white);
        // p2.add(btdw2);

        // JButton btdw3 = new JButton("up");
        // btdw3.setBounds(xMargin + 40 + 2 * btxSize, yMargin + 80, btxSize + 20, btySize);
        // btdw3.setBackground(Color.white);
        // p2.add(btdw3);

        // JLabel pan = new JLabel("መስከረም 10 2015 ዓ.ም");
        // pan.setFont(new Font("Power Geez Unicode1", Font.BOLD, 25));
        // pan.setBounds(120, 400, 300, 40);
        // pan.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        // p2.add(pan);

        // JLabel pan2 = new JLabel(" በዕለተ ማክሰኞ ይውላል።");
        // pan2.setFont(new Font("Power Geez Unicode1", Font.BOLD, 25));
        // pan2.setBounds(120, 440, 300, 40);
        // p2.add(pan2);










        //calendar



        // String[] numeral = new String[2];
        // numeral[0] = "Ethiopic Numeral";
        // numeral[1] = "Arabic Numeral";

        // JComboBox numBox = new JComboBox<>(numeral);
        // numBox.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 18));
        // numBox.setBackground(new Color(0, 153, 204));
        // numBox.setForeground(Color.white);
        // numBox.setBounds(30, 20, 175, 30);
        // numBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // pan.add(numBox);

        // String[] etGreg = new String[2];
        // etGreg[0] = "Ethopian Calender";
        // etGreg[1] = "Gregorian Calender";

        // JComboBox etGregBox = new JComboBox<>(etGreg);
        // etGregBox.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 18));
        // etGregBox.setBackground(new Color(0, 153, 204));
        // etGregBox.setForeground(Color.white);
        // etGregBox.setBounds(330, 20, 200, 30);
        // etGregBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // pan.add(etGregBox);

        // txtHead = new JLabel(" " + BahireCalc.get_ወር(etDate.getMonth()) + " " +
        // etDate.getYear()
        // + " ዓ.ም ");
        // txtHead.setFont(new Font("Power Geez Unicode1", Font.BOLD, 25));
        // txtHead.setForeground(Color.black);
        // txtHead.setBounds(100, 230, 390, 25);
        // add(txtHead);

        // int ዕለት_ማስያ = BahireCalc.ዕለት(etDate);
        // int temp_ቀን = (ዕለት_ማስያ == 0) ? -5 : 2 - ዕለት_ማስያ;

        // // << L"\t\t|| እሁድ ሠኞ ማግሠኞ ረቡዕ ሀሙስ ዐርብ ቅዳሜ ||\t\n";

        // for (int i = 0, k = 1; i < 6; i++, k++) {
        // for (int j = temp_ቀን, l = 1; j <= temp_ቀን + 6; j++, l++) {
        // JLabel txtbrana2 = new JLabel();
        // txtbrana2.setFont(new Font("Power Geez Unicode1", Font.PLAIN, 18));
        // txtbrana2.setForeground(Color.black);
        // txtbrana2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        // calLabels.add(txtbrana2);
        // txtbrana2.setBounds(30 + l * 60, 320 + k * 40, 25, 25);
        // add(txtbrana2);
        // if (j < 1 || j > 30
        // || (ቀን.ዘመነ_ዮሐንስ(etDate.getYear() + 1) && etDate.getMonth() == 13
        // && j > 6)
        // || (!ቀን.ዘመነ_ዮሐንስ(etDate.getYear() + 1)
        // && etDate.getMonth() == 13
        // && j > 5)) {
        // txtbrana2.setText("");
        // } else
        // txtbrana2.setText((j < 10 && j > 0) ? "0" + j : j + "");

        // if (l == 1)
        // txtbrana2.setForeground(Color.RED);
        // }
        // temp_ቀን += 7;
        // }

        // ImageIcon brana = new ImageIcon("brana2.jpg");
        // JLabel branaLabel = new JLabel(brana);
        // branaLabel.setBounds(-30, 200, brana.getIconWidth(), brana.getIconHeight());
        // add(branaLabel);
        // txtHead.setText(" " + BahireCalc.get_ወር(etDate.getMonth()) + " "
        // + etDate.getYear()
        // + " ዓ.ም ");

        // BahireCalc.printCal(etDate);









        // for (int i = 0, k = 0; i < 6; i++, k++) {

        // JLabel txtbrana2 = new JLabel("" + holy[i]);
        // txtbrana2.setFont(new Font("Power Geez Unicode1", Font.BOLD, 22));
        // txtbrana2.setForeground(Color.black);
        // txtbrana2.setBounds((k + 2) * 40 + k * 210, 225 + (i / 2) * 166, 236, 25);
        // add(txtbrana2);

        // JLabel txtbrana3 = new JLabel(holy2[i]);
        // txtbrana3.setFont(new Font("Power Geez Unicode1", Font.BOLD, 22));
        // txtbrana3.setForeground(Color.black);
        // holyLabels.add(txtbrana3);
        // txtbrana3.setBounds((k + 2) * 40 + k * 210, 250 + (i / 2) * 166, 236, 25);
        // add(txtbrana3);

        // JLabel txtbrana4 = new JLabel(" ይውላል። ");
        // txtbrana4.setFont(new Font("Power Geez Unicode1", Font.BOLD, 22));
        // txtbrana4.setForeground(Color.black);
        // txtbrana4.setBounds((k + 2) * 50 + k * 200, 275 + (i / 2) * 166, 236, 25);
        // add(txtbrana4);

        // ImageIcon holyBrana = new ImageIcon("branaHoly.png");
        // JLabel holyLabel = new JLabel(holyBrana);
        // holyLabel.setBounds((k + 2) * 20 + k * 236, 170 + (i / 2) * 166, 236, 166);
        // add(holyLabel);

        // if (k == 1)
        // k = -1;
        // }













        // JPanel Fast2() {
        //         JPanel pan = new JPanel(null);
        //         pan.setBounds(370, 10, 550, 690);
        //         pan.setBackground(Color.white);// new Color(0, 153, 204)

        //         JButton btupan = new JButton("up");
        //         btupan.setBounds(120, 30, 50 + 20, 30);
        //         btupan.setBackground(Color.white);
        //         pan.add(btupan);

        //         etYear = new JTextField(3);
        //         etYear.setBackground(new Color(0, 153, 204));// new Color(0, 153, 204));
        //         etYear.setForeground(Color.white);
        //         etYear.setBounds(110, 65, 50 + 40, 30 + 10);
        //         etYear.setFont(new Font("Power Geez Unicode1", Font.BOLD, 30));
        //         pan.add(etYear);

        //         JButton btdw3 = new JButton("up");
        //         btdw3.setBounds(120, 110, 50 + 20, 30);
        //         btdw3.setBackground(Color.white);
        //         btdw3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        //         pan.add(btdw3);

        //         JLabel txtFast = new JLabel("   የ2014 ዓ.ም ");
        //         txtFast.setFont(new Font("Power Geez Unicode1", Font.BOLD, 25));
        //         txtFast.setBounds(250, 40, 250, 40);
        //         pan.add(txtFast);

        //         JLabel txtFast2 = new JLabel(" መሠረታዊ ስሌቶች ");
        //         txtFast2.setFont(new Font("Power Geez Unicode1", Font.BOLD, 25));
        //         txtFast2.setBounds(250, 80, 250, 40);
        //         pan.add(txtFast2);

        //         String[] basic = new String[12];
        //         basic[0] = "በዓለ ደብረ ዘይት መስከረም 10 ይከበራል።";
        //         basic[1] = "  በዓለ ሆሳዕና መስከረም 10 ይከበራል።";
        //         basic[2] = "  በዓለ ስቅለት መስከረም 10 ይከበራል።";
        //         basic[3] = "  በዓለ ትንሣኤ መስከረም 10 ይከበራል።";
        //         basic[4] = " በዓለ ጰራቅሊጦስ መስከረም 10 ይከበራል።";
        //         basic[5] = "  በዓለ ዕርገት መስከረም 10 ይከበራል።";

        //         for (int i = 0; i < 6; i++) {
        //                 JLabel basic1 = new JLabel(basic[i]);
        //                 basic1.setFont(new Font("Power Geez Unicode1", Font.BOLD, 20));
        //                 basic1.setBounds(100, 250 + i * 60, 380, 40);
        //                 pan.add(basic1);

        //         }

        //         ImageIcon brana = new ImageIcon("branaFast4.jpg");
        //         JLabel branaLabel = new JLabel(brana);
        //         branaLabel.setBounds(-90, 150, brana.getIconWidth(), brana.getIconHeight());
        //         pan.add(branaLabel);

        //         return pan;
        // }
