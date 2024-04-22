package pl.altkom.regex;

public class Podzial2 {

    public static void main(String[] args) {
        final var TEKST = "Raz1dwa124trzy";
        
        String[] d1 = TEKST.split("d");
        System.out.println(d1.length);

        String[] d2 = TEKST.split("\\d");
        System.out.println(d2.length);
    }
}
