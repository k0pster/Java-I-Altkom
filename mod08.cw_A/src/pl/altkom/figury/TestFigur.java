package pl.altkom.figury;

public class TestFigur {
    public static void main(String[] args) {
        var trojkat = new TrojkatRownoboczny(1);
        var kwadrat = new Kwadrat(1);
        var kolo = new Kolo(1);

        FiguraRegularna.opiszFigury(trojkat, kwadrat, kolo);
    }
}
