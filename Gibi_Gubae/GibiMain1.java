// package Gibi_Gubae;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JColorChooser;

// import java.awt.Point;
// import java.awt.Window.*;
import java.awt.*;
public class GibiMain1 extends JFrame {
    JMenuBar gibiBar;
    public static Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
    
    public static void main(String[] args) {
        GibiMain1 gibiMain = new GibiMain1();
        gibiMain.setVisible(true);
    }

    public GibiMain1() {

        super("4 Kilo Gibi Gubae");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds((int) center.getX() - 450, (int) center.getY() - 350, 900, 700);
        setLayout(new FlowLayout());
        char c = 'አ';
        char d = 'ፍ';
        JMenu menu1 = new JMenu("");
        menu1.setPreferredSize(new Dimension(100,30));
        JMenuItem m1Item1 = new JMenuItem("menu1-Item1");
        menu1.add(m1Item1);
        JMenuItem m1Item2 = new JMenuItem("menu1-Item2");
        menu1.add(m1Item2);
        JMenuItem m1Item3 = new JMenuItem("menu1-Item3");
        menu1.add(m1Item3);

        JMenu menu2 = new JMenu("menu2");
        menu2.setPreferredSize(new Dimension(100, 30));
        JMenuItem m2Item1 = new JMenuItem("menu2-Item1");
        menu2.add(m2Item1);
        JMenuItem m2Item2 = new JMenuItem("menu2-Item2");
        menu2.add(m2Item2);
        JMenuItem m2Item3 = new JMenuItem("menu2-Item3");
        menu2.add(m2Item3);

        JMenu menu3 = new JMenu("menu3");
        menu3.setPreferredSize(new Dimension(100, 30));
        JMenuItem m3Item1 = new JMenuItem("menu3-Item1");
        menu3.add(m3Item1);
        JMenuItem m3Item2 = new JMenuItem("menu3-Item2");
        menu3.add(m3Item2);
        JMenuItem m3Item3 = new JMenuItem("menu3-Item3");
        menu3.add(m3Item3);

        JMenu menu4 = new JMenu("menu4");
        menu4.setPreferredSize(new Dimension(100, 30));
        JMenuItem m4Item1 = new JMenuItem("menu4-Item1");
        menu4.add(m4Item1);
        JMenuItem m4Item2 = new JMenuItem("menu4-Item2");
        menu4.add(m4Item2);
        JMenuItem m4Item3 = new JMenuItem("menu4-Item3");
        menu4.add(m4Item3);
        
        JMenu menu5 = new JMenu("menu5");
        menu5.setPreferredSize(new Dimension(100, 30));
        JMenuItem m5Item1 = new JMenuItem("menu5-Item1");
        menu5.add(m5Item1);
        JMenuItem m5Item2 = new JMenuItem("menu5-Item2");
        menu5.add(m5Item2);
        JMenuItem m5Item3 = new JMenuItem("menu5-Item3");
        menu5.add(m5Item3);
        
        JMenu menu6 = new JMenu("menu6");
        menu6.setPreferredSize(new Dimension(100, 30));
        JMenuItem m6Item1 = new JMenuItem("menu6-Item1");
        menu6.add(m6Item1);
        JMenuItem m6Item2 = new JMenuItem("menu6-Item2");
        menu6.add(m6Item2);
        JMenuItem m6Item3 = new JMenuItem("menu6-Item3");
        menu6.add(m6Item3);

        JMenu menu7 = new JMenu("menu7");
        menu7.setPreferredSize(new Dimension(100, 30));
        JMenuItem m7Item1 = new JMenuItem("menu7-Item1");
        menu7.add(m7Item1);
        JMenuItem m7Item2 = new JMenuItem("menu7-Item2");
        menu7.add(m7Item2);
        JMenuItem m7Item3 = new JMenuItem("menu7-Item3");
        menu7.add(m7Item3);

        gibiBar = new JMenuBar();
        gibiBar.setBackground(Color.ORANGE);
        gibiBar.add(menu1);
        gibiBar.add(menu2);
        gibiBar.add(menu3);
        gibiBar.add(menu4);
        gibiBar.add(menu5);
        gibiBar.add(menu6);
        gibiBar.add(menu7);
        add(gibiBar);

        
        add(gibiBar);
    }
    
    // public JMenuItem[] makeMenuItems(JMenuBar bar, )
}
