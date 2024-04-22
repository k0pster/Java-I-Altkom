package pl.altkom.daty;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeTest {

    public static void main(String[] args) {
        var teraz = LocalTime.now();
        System.out.println("Bieżący czas: " + teraz);

        var pozniej = teraz.plusHours(2).minusMinutes(15);
        System.out.println("Teraz + 2 godz - 15 min: " + pozniej);

        var terazBezSekund = teraz.truncatedTo(ChronoUnit.MINUTES);
        System.out.println("Bieżący czas bez sekund: " + terazBezSekund);

        var minutyOdPoczatkuDnia = teraz.toSecondOfDay() / 60;
        System.out.println("Od początku dnia upłynęło: " + minutyOdPoczatkuDnia + " min.");

        var samoPoludnie = LocalTime.NOON;
        var czyPoPoludniu = teraz.isAfter(samoPoludnie);
        if (czyPoPoludniu) {
            System.out.println("Jest już po południu");
        } else {
            System.out.println("jest południe lub przed południem");
        }

        var poraSniadania = LocalTime.of(7, 30);
        var minutyPoSniadaniu = poraSniadania.until(teraz, ChronoUnit.MINUTES);
        System.out.println("Od śniadania upłynęło: " + minutyPoSniadaniu + " min.");
    }
}
