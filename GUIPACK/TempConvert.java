import java.awt.*;
import java.awt.event.*;

public class TempConvert extends Frame implements WindowListener, ActionListener {
    float fValue, cValue;
    Frame theFrame = new Frame();
    TextField cText = new TextField("");
    Label cLabel = new Label("Celsius");
    TextField fText = new TextField("");
    Label fLabel = new Label("Fahrenheit");
    Button resultButton = new Button("Convert");

    TempConvert() {
        func();
    }

    void func() {
        fText.setEditable(true);
        cText.setEditable(true);
        cLabel.setBounds(10, 70, 50, 30);
        cText.setBounds(15, 70, 250, 30);
        fLabel.setBounds(10, 130, 100, 30);
        fText.setBounds(85, 130, 180, 30);
        resultButton.setBounds(100, 190, 100, 30);

        theFrame.addWindowListener(this);
        theFrame.add(cLabel);
        theFrame.add(cText);
        theFrame.add(fText);
        theFrame.add(fLabel);
        theFrame.add(resultButton);
        theFrame.setLayout(null);

        resultButton.addActionListener(this);

        theFrame.setVisible(true);
        theFrame.setSize(300, 300);

    }

    public static void main(String[] args) {
        TempConvert calc = new TempConvert();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resultButton) {
            if (cText.getText().isEmpty() && fText.getText().isEmpty()) {

            } else if (cText.getText().isEmpty()) {
                fValue = Float.parseFloat(fText.getText());
                cValue = (fValue - 32) * 5 / 9;
                cText.setText(String.valueOf(cValue));
            } else if (fText.getText().isEmpty()) {
                cValue = Float.parseFloat(cText.getText());
                fValue = (9 / 5) * cValue + 32;
                fText.setText(String.valueOf(fValue));
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {

    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {

    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {

    }
}