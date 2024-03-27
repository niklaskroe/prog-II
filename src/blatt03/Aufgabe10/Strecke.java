package blatt03.Aufgabe10;

import java.awt.*;

public class Strecke implements GeoObjekt {
    private Punkt p1, p2;

    Strecke(Punkt p1, Punkt p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void drehen(double phi) {
        p1.drehen(phi);
        p2.drehen(phi);
    }
    public void zeichnen(Graphics g, int xNull, int yNull) {

        g.drawLine( xNull + (int) p1.getX(),
                yNull + (int) p1.getY(),
                xNull + (int) p2.getX(),
                yNull + (int) p2.getY());
    }
}