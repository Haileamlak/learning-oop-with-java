import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

import org.w3c.dom.Text;

public class LabCalculator extends JFrame implements ActionListener {

    JTextField num1Field;
    JTextField num2Field;
    JTextField resField;

    public static void main(String[] args) {
        LabCalculator labCalculator = new LabCalculator();
        labCalculator.setVisible(true);
    }

    public LabCalculator() {
        super();
        setFont(new Font("Power Geez Unicode1", Font.BOLD, 16));
        setBounds(250, 200, 250, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); 

        JLabel num1Label = new JLabel("Number 1 : ");
        num1Label.setFont(new Font("Power Geez Unicode1", Font.BOLD, 16));
        num1Label.setBounds(20, 30, 70, 25);
        add(num1Label);

        num1Field = new JTextField(10);
        num1Field.setFont(new Font("Power Geez Unicode1", Font.BOLD, 16));
        num1Field.setBounds(100, 30, 100, 25);
        add(num1Field);

        JLabel num2Label = new JLabel("Number 2 : ");
        num2Label.setBounds(20, 60, 70, 25);
        add(num2Label);

        num2Field = new JTextField(10);
        num2Field.setBounds(100, 60, 100, 25);
        add(num2Field);

        JLabel resLabel = new JLabel("Result : ");
        resLabel.setBounds(20, 90, 70, 25);
        add(resLabel);

        resField = new JTextField(10);
        resField.setBounds(100, 90, 100, 25);
        resField.setFont(new Font("Power Geez Unicode1", Font.BOLD, 16));
        resField.setEditable(false);
        add(resField);

        JButton sum = new JButton("+");
        sum.setBounds(5, 130, 50, 20);
        sum.setBackground(Color.ORANGE);
        sum.addActionListener(this);
        add(sum);

        JButton diff = new JButton("-");
        diff.setBounds(60, 130, 50, 20);
        diff.addActionListener(this);
        diff.setBackground(Color.ORANGE);
        add(diff);

        JButton mult = new JButton("X");
        mult.setBounds(115, 130, 50, 20);
        mult.addActionListener(this);
        mult.setBackground(Color.ORANGE);
        add(mult);

        JButton div = new JButton("/");
        div.setBounds(170, 130, 50, 20);
        div.addActionListener(this);
        div.setBackground(Color.ORANGE);
        add(div);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // if(!Character.isDigit(num1Field.getText().charAt(0)) &&
        // num2Field.getText().charAt(0)
        try {

            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());

            if (e.getActionCommand().equals("+"))
                resField.setText(num1 + num2 + "");
            else if (e.getActionCommand().equals("-"))
                resField.setText(num1 - num2 + "");
            else if (e.getActionCommand().equals("X"))
                resField.setText(num1 * num2 + "");
            else if (e.getActionCommand().equals("/")) {
                // if (num2 != 0)
                //     resField.setText(num1 / num2 + "");
                // else
                    resField.setText("Can't divide by 0");
            } else
                resField.setText("Invalid Action");
        } catch (Exception ee) {
            resField.setText(ee.getMessage());
        }
    }
}
