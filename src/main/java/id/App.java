package id;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        frame.setSize(600, 300);        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        
        JButton btn1 = new JButton("Hola word"); //crean los elem
        JLabel lbl1 = new JLabel("Jlabel Example");
        JCheckBox checkBox = new JCheckBox("opt1");
        panel.add(btn1); //agregan los elm
        panel.add(lbl1);
        panel.add(checkBox);
        panel.add(new JButton("Button 2"));
        frame.setVisible(true);
    }
}
