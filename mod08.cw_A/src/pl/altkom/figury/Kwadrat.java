package pl.altkom.figury;

public class Kwadrat implements FiguraRegularna {
    private double a; // bok

    public Kwadrat(double a) {
        this.a = a;
    }

    @Override
    public double obliczPolePowierzchni() {
        return a * a;
    }

    @Override
    public double obliczObwod() {
        return 4 * a;
    }

}
