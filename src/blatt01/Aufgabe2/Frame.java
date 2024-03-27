package blatt01.Aufgabe2;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class Frame extends JFrame {
    Container c;
    private JLabel beschriftung, datumsAnzeige;
    private JComboBox<String> formatAuswahl;
    private Date datum;
    private JButton aktualisierung;
    private static final SimpleDateFormat lang = new SimpleDateFormat("E, d. MMM, hh:mm");
    private static final SimpleDateFormat mittel = new SimpleDateFormat("d. MMM, hh:mm:ss");
    private static final SimpleDateFormat kurz = new SimpleDateFormat("d.MM.YYYY (hh:mm)");
    public static SimpleDateFormat gewaehlt = lang;
    public Frame() {
        c = getContentPane();
        c.setLayout(new BorderLayout());

        String[] auswahl = new String[] {"Tag, Datum und Uhrzeit", "Datum und Uhrzeit mit Sekunden", "Datum mit Jahr und Uhrzeit"};
        formatAuswahl = new JComboBox<String>(auswahl);
        c.add(formatAuswahl, BorderLayout.NORTH);
        AnzeigeListener al = new AnzeigeListener();
        formatAuswahl.addItemListener(al);

        beschriftung = new JLabel("Datum und Uhrzeit:");
        datum = new Date();
        datumsAnzeige = new JLabel(gewaehlt.format(datum));
        c.add(beschriftung, BorderLayout.WEST);
        c.add(datumsAnzeige, BorderLayout.EAST);

        aktualisierung = new JButton("Anzeige aktualisieren");
        c.add(aktualisierung, BorderLayout.SOUTH);
        KnopfHorcher bl = new KnopfHorcher(datumsAnzeige);
        aktualisierung.addActionListener(bl);

    }

    public class AnzeigeListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            datum = new Date();
            switch (formatAuswahl.getSelectedIndex()) {
                case 0:
                    gewaehlt = lang;
                    break;
                case 1:
                    gewaehlt = mittel;
                    break;
                case 2:
                    gewaehlt = kurz;
                    break;
            }
        }
    }
}
