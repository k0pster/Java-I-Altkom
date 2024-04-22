package pl.altkom.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wyszukiwanie {

    public static void main(String[] args) {
        var s = "Pon Wt Śr Czw Pt Sob Nd";
        System.out.println(s);

        var pattern = Pattern.compile("[A-Z][a-z]*");
        var matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.printf("(%2d - %2d): %s%n", matcher.start(), matcher.end() - 1, matcher.group());
        }
    }
}
