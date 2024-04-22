package pl.altkom.telefon;

public class TelefonNaKarte {
    private int minuty;

    public TelefonNaKarte(int minutyNaStart) {
        this.minuty = minutyNaStart;
    }

    public int ileMinutNaRozmowy() {
        return minuty;
    }

    public void doladuj(int dodatkoweMinuty){
        minuty += dodatkoweMinuty;
    }

    public void rozmawiaj(int czasRozmowy) throws BrakMinut {
        if (czasRozmowy > minuty) { //czy mamy sytuację wyjątkową?
            throw new BrakMinut(minuty);
        }
        System.out.println("Fajnie się rozmawiało...");
        minuty -= czasRozmowy;
    }
}
