package pl.altkom.regex;

import java.util.regex.Pattern;

public class Podzial1 {

    public static void main(String[] args) {
        var pattern = Pattern.compile("[,\\s]+");
        var tablica = pattern.split("raz,dwa, trzy cztery , pięć");
        for (var element : tablica) {
            System.out.println("[" + element + "]");
        }
    }
}
