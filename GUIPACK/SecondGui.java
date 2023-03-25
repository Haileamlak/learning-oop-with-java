// package GUIPACK;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import javax.swing.ImageIcon;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.*;

// import javax.print.attribute.standard.OrientationRequested;
// import javax.swing.Icon;
import javax.swing.JButton;
// import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecondGui extends JFrame implements ActionListener {
    private JPanel gPanel, yPanel, rPanel;

    public static void main(String[] args) {
        SecondGui sGui = new SecondGui(600, 300);
        sGui.setVisible(true);
    }

    public SecondGui(int w, int h) {
        super("ETHIOPIA");
        setLayout(new BorderLayout());
        setBounds(325, 200, w, h);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel whoPanel = new JPanel();
        whoPanel.setLayout(new GridLayout(3, 1));

        gPanel = new JPanel();
        gPanel.setBackground(Color.LIGHT_GRAY);
        whoPanel.add(gPanel);

        yPanel = new JPanel();
        yPanel.setBackground(Color.LIGHT_GRAY);
        whoPanel.add(yPanel);

        rPanel = new JPanel();
        rPanel.setBackground(Color.LIGHT_GRAY);
        whoPanel.add(rPanel);

        add(whoPanel, BorderLayout.CENTER);

        JPanel butPanel = new JPanel();
        butPanel.setBackground(Color.LIGHT_GRAY);
        butPanel.setLayout(new GridLayout(3, 1));
        // butPanel.setBounds(0,20,50,30);
        ImageIcon imm = new ImageIcon("sub_bell.png");
        JButton gButton = new JButton("GREEN");
        gButton.setMargin(new Insets(4,4,4,4));
        gButton.setBackground(Color.GREEN);
        gButton.addActionListener(this);
        gButton.setIcon(imm);
        butPanel.add(gButton);

        JButton yButton = new JButton("YELLOW");
        yButton.setSize(50, 15);
        yButton.setBackground(Color.YELLOW);
        yButton.addActionListener(this);
        yButton.setActionCommand("YELLOW");
        butPanel.add(yButton);

        JButton rButton = new JButton("RED");
        rButton.setVerticalTextPosition(SwingConstants.CENTER);
        rButton.setSize(50, 15);
        rButton.setBackground(Color.RED);
        rButton.addActionListener(this);
        butPanel.add(rButton);
        add(butPanel, BorderLayout.WEST);

        JMenu mJMenu = new JMenu("Main Menu");

        mJMenu.setLayout(new FlowLayout());

        JMenuItem mItem2 = new JMenuItem("GREEN");
        mItem2.setBackground(Color.BLACK);
        mItem2.addActionListener(this);
        mItem2.setIcon(imm);
        mJMenu.add(mItem2);

        JMenuItem mItem3 = new JMenuItem("YELLOW");
        mItem3.setBackground(Color.BLACK);
        mItem3.addActionListener(this);
        mJMenu.add(mItem3);

        JMenuItem mItem4 = new JMenuItem("RED");
        mItem4.setBackground(Color.BLACK);
        mItem4.addActionListener(this);
        mJMenu.add(mItem4);

        JMenuBar mBar = new JMenuBar();
        mBar.add(mJMenu);
        add(mBar, BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String butString = e.getActionCommand();
        if (butString.equals("GREEN")) {
            gPanel.setBackground(Color.GREEN);
            JLabel gLabel = new JLabel("Ethiopia", SwingConstants.CENTER);
            gPanel.add(gLabel);
        } else if (butString.equals("YELLOW")) {
            yPanel.setBackground(Color.YELLOW);
            JLabel yLabel = new JLabel("Ethiopia", SwingConstants.CENTER);
            yPanel.add(yLabel);
        } else if (butString.equals("RED")) {
            rPanel.setBackground(Color.RED);
            JLabel rLabel = new JLabel("Ethiopia", SwingConstants.CENTER);
            rPanel.add(rLabel);
        } else
            System.out.println("Error : unknown event fired");

    }
}
