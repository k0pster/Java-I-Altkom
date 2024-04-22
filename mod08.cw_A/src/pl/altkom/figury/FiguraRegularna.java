package pl.altkom.figury;

public interface FiguraRegularna {
    double obliczPolePowierzchni();

    double obliczObwod();

    double PI = 3.14;

    default void opiszFigure() {
        String figura = getClass().getSimpleName();
        double obwod = obliczObwod();
        double pole = obliczPolePowierzchni();
        System.out.printf("%s [obwód = %.2f, pole = %.2f]%n", figura, obwod, pole);
    }

    static void opiszFigury(FiguraRegularna... figury) {
        for (FiguraRegularna figura : figury) {
            figura.opiszFigure();
        }
    }
}
