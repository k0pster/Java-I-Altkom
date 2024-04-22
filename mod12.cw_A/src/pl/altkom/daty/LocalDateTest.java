package pl.altkom.daty;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class LocalDateTest {

    public static void main(String[] args) {
        var dzis = LocalDate.now();
        System.out.println("Dzisiejsza data: " + dzis);

        var ladowanie = LocalDate.of(1969, Month.JULY, 20);  // data lądowania na Księżycu
        System.out.println("Data lądowania na Księżycu: " + ladowanie);

        var przeszlosc = ladowanie.isBefore(dzis);
        var dzienTygodnia = ladowanie.getDayOfWeek();
        if (przeszlosc) {
            System.out.println("Lądowanie na Księżycu już miało miejsce");
            System.out.println("Dzień lądowania: "
                    + dzienTygodnia.getDisplayName(TextStyle.FULL, Locale.of("pl")));
        }

        var przestepny = dzis.isLeapYear();
        if (przestepny) {
            System.out.println("Bieżący rok jest przestępny");
        } else {
            System.out.println("Bieżący rok nie jest przestępny");
        }

        var przyszlosc = dzis.plusMonths(3).minusDays(29);
        System.out.println("Dziś + 3 miesiące - 29 dni: " + przyszlosc);

        var najblizszaNiedziela = dzis.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println("Najbliższa niedziela: " + najblizszaNiedziela);
    }
}
