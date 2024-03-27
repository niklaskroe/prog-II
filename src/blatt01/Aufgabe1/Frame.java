package blatt01.Aufgabe1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame {
    Container c;
    JButton b;

    public Frame() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("Drueck mich!");
        c.add(b);
        ButtonBearbeiter bl = new ButtonBearbeiter();
        b.addActionListener(bl);
        MausBearbeiter mb = new MausBearbeiter();
        c.addMouseListener(mb);
    }

    public class ButtonBearbeiter implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            c.setBackground(Color.BLACK);
        }
    }

    public class MausBearbeiter implements MouseListener {
        public void mouseClicked(MouseEvent e) {

        }

        public void mousePressed(MouseEvent e) {
            c.setBackground(Color.WHITE);
        }

        public void mouseReleased(MouseEvent e) {

        }

        public void mouseEntered(MouseEvent e) {

        }

        public void mouseExited(MouseEvent e) {

        }
    }
}
