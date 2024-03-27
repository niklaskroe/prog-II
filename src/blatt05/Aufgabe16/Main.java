package blatt05.Aufgabe16;
import Prog1Tools.IOTools;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        IOTools.readLine("Stoppuhr starten mit Eingabetaste!");

        Date start = new Date();
        System.out.println("Startzeitpunkt: " + start);

        Thread t = new UhrzeitThread();
        t.start();
        System.out.println("Stoppuhr anhalten mit Eingabetaste!");

        IOTools.readLine();

        Date ende = new Date();
        t.interrupt();
        System.out.println("Stoppzeitpunkt: " + ende);

        double laufzeit = ende.getTime() - start.getTime();
        System.out.println("Gesamtlaufzeit: " + laufzeit);
    }
}