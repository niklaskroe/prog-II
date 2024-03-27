package blatt03.Aufgabe10;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("DrehFrame");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrehPanel panel = new DrehPanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}