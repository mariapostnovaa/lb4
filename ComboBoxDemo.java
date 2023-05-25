package lb4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxDemo implements ActionListener {

    private JFrame frame;
    private JComboBox<String> comboBox;

    public ComboBoxDemo() {
        frame = new JFrame("ComboBox Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] items = {"Red", "Green", "Blue"};
        comboBox = new JComboBox<>(items);
        comboBox.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(comboBox);

        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String color = (String)comboBox.getSelectedItem();
        System.out.println(color + " selected");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ComboBoxDemo();
            }
        });
    }
}