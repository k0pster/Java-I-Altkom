package pl.altkom.figury;

public class Kolo implements FiguraRegularna {
    private double d; // średnica

    public Kolo(double d) {
        this.d = d;
    }

    @Override
    public double obliczPolePowierzchni() {
        return Math.PI * d * d / 4;
    }

    @Override
    public double obliczObwod() {
        return Math.PI * d;
    }

}
