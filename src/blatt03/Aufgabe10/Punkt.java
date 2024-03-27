package blatt03.Aufgabe10;

public class Punkt {
    private double x, y;
    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void drehen(double phi) {
        this.x = x * Math.cos(phi) - y * Math.sin(phi);
        this.y = x * Math.cos(phi) - y * Math.sin(phi);
    }
}
