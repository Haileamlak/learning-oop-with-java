import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;

import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.FlowLayout;

public class Temperature extends JFrame implements ActionListener {
    JTextField celsiusField;
    JTextField fahrenheitField;
    double cel, fah, res;

    public static void main(String[] args) {
        Temperature ss = new Temperature();
        ss.setVisible(true);
    }

    public Temperature() {
        super();
        setBounds(500,250, 260, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel celLabel = new JLabel("      Celsius");
        add(celLabel);

        celsiusField = new JTextField(15);
        celsiusField.setBackground(Color.WHITE);
        add(celsiusField);

        JLabel fahLabel = new JLabel("Fahrenheit");
        add(fahLabel);

        fahrenheitField = new JTextField(15);
        fahrenheitField.setBackground(Color.WHITE);
        fahrenheitField.setEditable(false );
        add(fahrenheitField);

        JButton change = new JButton("Convert");
        change.setBackground(Color.ORANGE);
        change.addActionListener(this);

        add(change);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Convert")) {
            cel = Double.parseDouble(celsiusField.getText());
            fah = 9.0 / 5.0 * cel + 32;
            fahrenheitField.setText(fah+"");
        }
    }

}
