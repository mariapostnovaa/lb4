package lb4;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CheckBoxDemo implements ItemListener {
  JCheckBox checkbox1, checkbox2, checkbox3;

  public CheckBoxDemo() {
    JFrame frame = new JFrame("Пример чекбоксов");
    JPanel panel = new JPanel();
    checkbox1 = new JCheckBox("Чекбокс 1");
    checkbox2 = new JCheckBox("Чекбокс 2");
    checkbox3 = new JCheckBox("Чекбокс 3");
    checkbox1.addItemListener(this);
    checkbox2.addItemListener(this);
    checkbox3.addItemListener(this);
    panel.add(checkbox1);
    panel.add(checkbox2);
    panel.add(checkbox3);
    frame.add(panel);
    frame.setSize(300,100);
    frame.setVisible(true);
  }

  public void itemStateChanged(ItemEvent e) {
    if(e.getSource() == checkbox1) {
      System.out.println("Состояние чекбокса 1: " + checkbox1.isSelected());
    } else if(e.getSource() == checkbox2) {
      System.out.println("Состояние чекбокса 2: " + checkbox2.isSelected());
    } else if(e.getSource() == checkbox3) {
      System.out.println("Состояние чекбокса 3: " + checkbox3.isSelected());
    }
  }

  public static void main(String[] args) {
    new CheckBoxDemo();
  }
}