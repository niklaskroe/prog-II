package blatt01.Aufgabe4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    Container c;
    private JTextField input1, input2;
    private JLabel operator, equal, result;
    private JButton plus, minus, mul, div, del;

    public Frame() {
        c = getContentPane();
        c.setLayout(new GridLayout(2, 5));

        // Input
        input1 = new JTextField();
        input2 = new JTextField();

        // Labels
        operator = new JLabel("", JLabel.CENTER);
        equal = new JLabel("=", JLabel.CENTER);
        result = new JLabel();

        // operator buttons
        plus = new JButton("add");
        minus = new JButton("substract");
        mul = new JButton("multiply");
        div = new JButton("divide");
        del = new JButton("delete all");

        // button action (cmd= ) modifier
        plus.setActionCommand("+");
        minus.setActionCommand("-");
        mul.setActionCommand("*");
        div.setActionCommand("/");
        del.setActionCommand("l");

        // Operator Button Listener
        plus.addActionListener(new OperatorListener());
        minus.addActionListener(new OperatorListener());
        mul.addActionListener(new OperatorListener());
        div.addActionListener(new OperatorListener());
        del.addActionListener(new OperatorListener());

        // Component layout
        c.add(input1);
        c.add(operator);
        c.add(input2);
        c.add(equal);
        c.add(result);
        // -----------
        c.add(plus);
        c.add(minus);
        c.add(mul);
        c.add(div);
        c.add(del);
    }

    public class OperatorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("l")) {
                input1.setText("");
                input2.setText("");
                operator.setText("");
                result.setText("");
                return;
            }

            try {
                double input1Double = Double.valueOf(input1.getText()).doubleValue();
                double input2Double = Double.valueOf(input2.getText()).doubleValue();

                switch (e.getActionCommand()) {
                    case "+":
                        operator.setText("+");
                        result.setText(input1Double + input2Double + "");
                        break;
                    case "-":
                        operator.setText("-");
                        result.setText(input1Double - input2Double + "");
                        break;
                    case "*":
                        operator.setText("*");
                        result.setText(input1Double * input2Double + "");
                        break;
                    case "/":
                        if (input2Double == 0) {
                            result.setText("cannot divide by 0");
                            break;
                        }
                        operator.setText("/");
                        result.setText(input1Double / input2Double + "");
                        break;
                }
            } catch (Exception ex) {
                result.setText("Eingabe unzulässig");
            }
        }
    }
}
