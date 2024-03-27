package blatt01.Aufgabe2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class KnopfHorcher implements ActionListener {
    JLabel datumsAnzeige;
    public KnopfHorcher(JLabel datumsAnzeige) {
        this.datumsAnzeige = datumsAnzeige;
    }

    public void actionPerformed(ActionEvent e) {
        Date datum = new Date();
        datumsAnzeige.setText(Frame.gewaehlt.format(datum));
    }
}
