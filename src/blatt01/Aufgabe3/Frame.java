package blatt01.Aufgabe3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    Container c;
    JRadioButton[] r = new JRadioButton[3];
    JButton[] b = new JButton[3];
    public Frame() {
        c = getContentPane();
        c.setLayout(new GridLayout(3, 2));

        EventListener el = new EventListener();

        // Buttons
        ButtonGroup bg = new ButtonGroup(); // defining group which only allows one to be selected
        String[] buttonText = new String[]{"rot", "gelb", "grün"};
        for(int i = 0; i < 3; i++){
            r[i] = new JRadioButton(buttonText[i]);
            bg.add(r[i]);
            c.add(r[i]);
            r[i].addActionListener(el);

            b[i] = new JButton();
            b[i].setActionCommand(buttonText[i]);
            b[i].setOpaque(true);
            b[i].setBorderPainted(false);
            b[i].setBackground(Color.BLACK);
            c.add(b[i]);
            b[i].addActionListener(el);
        }
        r[0].setSelected(true);
        b[0].setBackground(Color.RED);
    }

    public class EventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            b[0].setBackground(Color.BLACK);
            b[1].setBackground(Color.BLACK);
            b[2].setBackground(Color.BLACK);

            switch(e.getActionCommand()) {
                case "rot":
                    b[0].setBackground(Color.RED);
                    break;
                case "gelb":
                    b[1].setBackground(Color.YELLOW);
                    break;
                case "grün":
                    b[2].setBackground(Color.GREEN);
                    break;
            }
        }
    }
}