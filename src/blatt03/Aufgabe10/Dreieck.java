package blatt03.Aufgabe10;

import java.awt.*;

public class Dreieck implements GeoObjekt {
    Strecke s1, s2, s3;

    Dreieck(Punkt p1, Punkt p2, Punkt p3) {
        s1 = new Strecke(p1, p2);
        s2 = new Strecke(p2, p3);
        s3 = new Strecke(p3, p1);
    }

    public void drehen(double phi) {
        s1.drehen(phi);
        s2.drehen(phi);
        s3.drehen(phi);
    }

    public void zeichnen(Graphics g, int xNull, int yNull) {
        s1.zeichnen(g, xNull, yNull);
        s2.zeichnen(g, xNull, yNull);
        s3.zeichnen(g, xNull, yNull);
    }
}