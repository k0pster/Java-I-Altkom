package pl.altkom.daty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalDateTimeTest {

    public static void main(String[] args) {
        var data = LocalDate.of(2024, Month.OCTOBER, 1);
        var czas = LocalTime.of(10, 0); // 10:00
        var poczatekRokuAkademickiego = LocalDateTime.of(data, czas);
        System.out.println("Rok akademicki rozpocznie się: " + poczatekRokuAkademickiego);


        var spotkanie = LocalDateTime.of(2024, Month.MAY, 8, 14, 30);
        System.out.println("Planowane spotkanie: " + spotkanie);

        var przesunieteSpotkanie = spotkanie.plusWeeks(1).minusHours(1);
        System.out.println("Nowy termin spotkania (za tydzień, godzinę wcześniej): " + przesunieteSpotkanie);

        var godzNowegoSpotkania = przesunieteSpotkanie.getHour(); // 13
        var minNowegoSpotkania = przesunieteSpotkanie.getMinute(); // 30
        var dzienTygodniaNowegoSpotkania = przesunieteSpotkanie.getDayOfWeek();
        System.out.printf("Nowe spotkanie odbędzie się o godz. %2d:%02d (%s)", godzNowegoSpotkania,
                minNowegoSpotkania,
                dzienTygodniaNowegoSpotkania.getDisplayName(TextStyle.FULL, Locale.of("pl")));
    }
}
