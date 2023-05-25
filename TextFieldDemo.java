package lb4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFieldDemo implements ActionListener {

    private JFrame frame;
    private JTextField textField;

    public TextFieldDemo() {
        frame = new JFrame("TextField Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField(20);
        textField.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(textField);

        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        System.out.println("Entered text: " + text);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TextFieldDemo();
            }
        });
    }
}



