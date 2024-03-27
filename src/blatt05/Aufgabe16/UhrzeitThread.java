package blatt05.Aufgabe16;
import java.text.SimpleDateFormat;
import java.util.*;

public class UhrzeitThread extends Thread {
    static final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    public void run() {
        while(!isInterrupted()) {
            Date zeitpunkt = new Date();
            System.out.println(format.format(zeitpunkt));
            try {
                sleep(1000);
            } catch (InterruptedException ie) {
                interrupt();
            }
        }
    }
}
