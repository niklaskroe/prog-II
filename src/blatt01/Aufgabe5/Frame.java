package blatt01.Aufgabe5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Frame extends JFrame {
    Container c;
    private JLabel euro;
    JTextField input, output;
    JComboBox currencySelector;
    public Frame() {
        c = getContentPane();
        c.setLayout(new GridLayout(4, 1));

        euro = new JLabel("Euro");
        input = new JTextField();
        input.setActionCommand("input");
        currencySelector = new JComboBox();
        output = new JTextField();
        output.setActionCommand("output");

        for(int i = 0; i < 12; i++) {
            currencySelector.addItem(EuroConverter.getBezeichnung(i));
        }

        EventListener el = new EventListener();
        input.addActionListener(el);
        output.addActionListener(el);
        currencySelector.addItemListener(new SelectorListener());

        c.add(euro);
        c.add(input);
        c.add(currencySelector);
        c.add(output);
    }

    public class EventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("input")) {
                double inputDouble = Double.parseDouble(input.getText());
                output.setText("" + EuroConverter.convertFromEuro(inputDouble, currencySelector.getSelectedIndex()));
            } else if (e.getActionCommand().equals("output")) {
                double outputDouble = Double.parseDouble(output.getText());
                input.setText("" + EuroConverter.convertToEuro(outputDouble, currencySelector.getSelectedIndex()));
            }
        }
    }

    public class SelectorListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            double inputDouble = Double.parseDouble(input.getText());
            output.setText("" + EuroConverter.convertFromEuro(inputDouble, currencySelector.getSelectedIndex()));
        }
    }
}
