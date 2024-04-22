package pl.altkom.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dopasowanie {

    public static void main(String[] args) {
        final var REGEX = "w*c";
        final var TEKST = "wzorzec";

        var pattern = Pattern.compile(REGEX);
        var matcher = pattern.matcher(TEKST);
        var dopasowanie1 = matcher.matches();
        System.out.println("Wynik dopasowania: " + dopasowanie1);

        // gdy dopasowanie jest jednorazowe, to można prościej:
        var dopasowanie2 = Pattern.matches(REGEX, TEKST);
        System.out.println("Wynik dopasowania: " + dopasowanie2);
    }
}
