package blatt03.Aufgabe10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrehPanel extends JPanel {
    static final double SCHRITTWEITE = Math.PI / 60;
    private GeoObjekt drehObjekt;

    DrehPanel(){

        setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton bt;
        bt = new JButton("Links");
        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drehObjekt.drehen(-1 * SCHRITTWEITE);
                repaint();
            }
        });
        add(bt);

        bt = new JButton("Rechts");
        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drehObjekt.drehen(SCHRITTWEITE);
                repaint();
            }
        });
        add(bt);

        bt = new JButton("Strecke");
        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drehObjekt = erzeugeStrecke();
                repaint();
            }
        }
        );
        add(bt);

        bt = new JButton("Dreieck");
        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drehObjekt = erzeugeDreieck();
                repaint();
            }
        });
        add(bt);
        drehObjekt = erzeugeStrecke();
    }

    private Strecke erzeugeStrecke(){
        return new Strecke(new Punkt(0,0),
                new Punkt(100,0));
    }
    private Dreieck erzeugeDreieck(){
        return new Dreieck(new Punkt(0,0),
                new Punkt(100,0),
                new Punkt(50,-66)
        );
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drehObjekt.zeichnen(g,getWidth()/2, getHeight()/2);
    }
}