package blatt05.Aufgabe17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutomatFrame extends JFrame {
    ColorRunLabel label1, label2, label3;
    StartStopButton button1, button2, button3;
    public AutomatFrame() {
        setLayout(new GridLayout(2, 3));

        label1 = new ColorRunLabel(Color.red);
        label2 = new ColorRunLabel(Color.yellow);
        label3 = new ColorRunLabel(Color.green);
        button1 = new StartStopButton(Color.red);
        button2 = new StartStopButton(Color.yellow);
        button3 = new StartStopButton(Color.green);

        add(label1);
        add(label2);
        add(label3);
        add(button1);
        add(button2);
        add(button3);

        button1.addActionListener(new ButtonListener(label1, button1));
        button2.addActionListener(new ButtonListener(label2, button2));
        button3.addActionListener(new ButtonListener(label3, button3));
    }

    public class ButtonListener implements ActionListener {
        ColorRunLabel label;
        StartStopButton button;
        public ButtonListener(ColorRunLabel label, StartStopButton button) {
            this.button = button;
            this.label = label;
        }
        public void actionPerformed(ActionEvent e) {
            if(button.isStart()) {
                label.start();
            } else {
                label.stop();
            }
            button.switchText();
        }
    }

    public static void main(String[] args) {
        AutomatFrame frame = new AutomatFrame();
        frame.setVisible(true);
        frame.setTitle("Spielautomat");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
