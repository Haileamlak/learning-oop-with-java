import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;

public class ExampleGUI {

    public static void main(String[] args) {
        JFrame fff = new JFrame();
        fff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fff.setSize(200, 200);
        fff.setLayout(new FlowLayout());

        HelinaListener listener1 = new HelinaListener();
        HaylaListener listener2 = new HaylaListener();

        JButton bt = new JButton("Click Me");
        bt.addActionListener(new HelinaListener());
        fff.add(bt);
        fff.setVisible(true);
    }
}
