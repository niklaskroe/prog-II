package blatt05.Aufgabe17;

import javax.swing.*;
import java.awt.*;

public class StartStopButton extends JButton {
    public StartStopButton(Color col) {
        setBackground(col);
        setFont(new Font("Arial", Font.PLAIN, 25));
        setHorizontalAlignment(JButton.CENTER);
        setText("START");
    }

    public boolean isStart() {
        return getText().equals("START");
    }

    public void switchText() {
        if(getText().equals("START")) {
            setText("STOP");
        } else {
            setText("START");
        }
    }
}
