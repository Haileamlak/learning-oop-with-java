
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.plaf.DimensionUIResource;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Cursor;
// import java.util.StringTokenizer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Translator extends JFrame implements ActionListener {
    private JTextArea beforeTranslate;
    private JTextArea afterTranslate;

    public static void main(String[] args) {
        Translator tt = new Translator();
        tt.setVisible(true);
    }

    public Translator() {
        super("English to Pig Latin Mini Translator");
        setBounds(200, 200, 600, 300);
        // setLayout(new BorderLayout());

        // JPanel cont = new JPanel();
        // cont.setLayout(new );
        JPanel wPanel = new JPanel(new GridLayout(1, 3));
        JPanel sPanel = new JPanel(new GridLayout(2, 1));

        beforeTranslate = new JTextArea(3, 5);
        beforeTranslate.setText("Enter a word to translate");
        beforeTranslate.setBackground(Color.GRAY);
        beforeTranslate.setLineWrap(true);

        wPanel.add(beforeTranslate);

        JButton trans = new JButton("TRANSLATE");
        trans.setBackground(Color.BLUE);
        trans.setSize(20, 10);
        trans.addActionListener(this);

        JButton clear = new JButton("CLEAR");
        clear.setBackground(Color.WHITE);
        clear.addActionListener(this);

        sPanel.add(trans);
        sPanel.add(clear);
        sPanel.setSize(20,10);
        wPanel.add(sPanel);

        // StringTokenizer tran = new StringTokenizer(beforeTranslate.getText());

        afterTranslate = new JTextArea(5, 10);
        afterTranslate.setEditable(false);
        afterTranslate.setBackground(Color.GRAY);
        afterTranslate.setLineWrap(true);
        afterTranslate.setBounds(20, 20, 20, 20);
        wPanel.add(afterTranslate);


        add(wPanel);// , BorderLayout.CENTER

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("TRANSLATE"))
            afterTranslate.setText(beforeTranslate.getText());
        else {
            beforeTranslate.setText("");
            afterTranslate.setText("");
        }
    }
}
