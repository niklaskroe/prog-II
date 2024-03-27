package blatt05.Aufgabe17;

import javax.swing.*;
import java.awt.*;

public class ColorRunLabel extends JLabel implements Runnable{
    private boolean running = false;

    public ColorRunLabel(Color col) {
        setBackground(col);
        setFont(new Font("Arial", Font.BOLD, 50));
        setHorizontalAlignment(JLabel.CENTER);
        setOpaque(true);
    }

    public void start() {
        running = true;
        new Thread(this).start();
    }

    public void stop() {
        running = false;
    }

    public void run() {
        while(running) {
            setText("" + (int) (Math.random() * 10));
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                return;
            }
        }
    }
}
