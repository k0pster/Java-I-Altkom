package pl.altkom.telefon;

public class BrakMinut extends Exception {
    public BrakMinut(int pozostaleMinuty) {
        super("Nie wystarczająca liczba minut na rozmowę... Pozostało tylko " + pozostaleMinuty + " min.!");
    }
}
