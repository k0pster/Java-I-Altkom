package pl.altkom.daty;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterTest {

    public static void main(String[] args) {
        var dzis = LocalDate.now();
        System.out.println("Dziś (domyślny formatter): " + dzis);

        var fmt = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println("Dziś (formatter ISO_LOCAL_DATE): " + dzis.format(fmt));

        for (var styl: FormatStyle.values()) {
            fmt = DateTimeFormatter.ofLocalizedDate(styl);
            System.out.printf("Dziś (styl %s): %s%n", styl, dzis.format(fmt));
        }

        fmt = DateTimeFormatter.ofPattern("dd-MMM-yyyy, EEEE");
        System.out.println("Dziś (własny format): " + dzis.format(fmt));
    }
}
