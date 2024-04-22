package pl.altkom.figury;

public class TrojkatRownoboczny implements FiguraRegularna {
    private double a; // bok

    public TrojkatRownoboczny(double a) {
        this.a = a;
    }

    @Override
    public double obliczPolePowierzchni() {
        return Math.sqrt(3) * a * a / 2;
    }

    @Override
    public double obliczObwod() {
        return 3 * a;
    }
}
