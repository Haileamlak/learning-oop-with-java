// package GUIPACK; 

import java.awt.*;
import java.awt.Color;
import java.util.concurrent.Flow;

import javax.swing.*;
import javax.swing.border.Border;

/**
 * JFRAME - Appendix 5
 */
public class FirstSwing {

    public static void main(String[] args) {
        JFrame win1 = new JFrame("Hello GUI");
        win1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win1.setBounds(500, 250, 300, 200);
        win1.getContentPane().setBackground(Color.BLACK);
        win1.setLayout(new BorderLayout(4, 1));
        // win1.setShape(SwingConstants.);
        JLabel t1 = new JLabel("Hello GUI World 1");
        t1.setBackground(Color.GREEN);
        win1.add(t1,BorderLayout.NORTH);
        t1 = new JLabel("Hello GUI World 2");        
        t1.setBackground(Color.YELLOW);
        win1.add(t1,BorderLayout.SOUTH);
        t1 = new JLabel("Hello GUI World 3");
        t1.setBackground(Color.RED);
        win1.add(t1,BorderLayout.EAST);
        // t1 = new JLabel("Hello GUI World 4");
        // win1.add(t1);
        // tt.setBounds(20, 20, 30, 20);
        // tt.setBackground(Color.RED);
        // win1.setLayout();
        // win1.setJMenuBar(menubar);
        // JButton endButton = new JButton("HELINA");
        // endButton.setBounds(95, 50, 100, 30);
        // endButton.setBackground(Color.ORANGE);
        // tt.setHorizontalAlignment(SwingConstants.CENTER);
        // tt.setVerticalAlignment(SwingConstants.TOP);
        // endButton.add(tt);
        // win1.add(endButton);
        // win1.add(t1);
        // win1.add(t2);
        // win1.add(t3);
        // win1.add(t4);
        win1.setVisible(true);
    }

}