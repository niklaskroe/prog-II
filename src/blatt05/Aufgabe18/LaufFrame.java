package blatt05.Aufgabe18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LaufFrame extends JFrame {
  ColorRunButton knopf1, knopf2;
  JComboBox farbenWahl;
  JCheckBox buchstabenWahl;
  public LaufFrame() {
    // Swing-Komponenten erzeugen und einf�gen
    setLayout(new FlowLayout());

    knopf1 = new ColorRunButton();
    knopf2 = new ColorRunButton();
    farbenWahl = new JComboBox();
    farbenWahl.addItem("schwarze Schrift");
    farbenWahl.addItem("graue Schrift");
    buchstabenWahl = new JCheckBox("Buchstaben", true);

    add(knopf1);
    add(knopf2);
    add(farbenWahl);
    add(buchstabenWahl);

    knopf1.addActionListener(new KnopfListener(knopf1));
    knopf2.addActionListener(new KnopfListener(knopf2));
  }

  class KnopfListener implements ActionListener {
    ColorRunButton crb;
    KnopfListener (ColorRunButton crb) {
      this.crb = crb;
    }
    public void actionPerformed (ActionEvent e) {
      // Auswahl-Index des ComboBox-Objekts bestimmen und Schrift setzen
      if (farbenWahl.getSelectedIndex() == 0) {
        crb.setForeground(Color.black);
      } else {
        crb.setForeground(Color.gray);
      }
      //  Zustand der Checkbox bestimmen und Button-Zustand �ndern
      crb.change(buchstabenWahl.isSelected());
    }
  }

  // main-Methode
  public static void main(String[] args) {
    LaufFrame fenster = new LaufFrame();
    fenster.setTitle("LaufFrame");
    fenster.setSize(350,300);
    fenster.setVisible(true);
    fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}
