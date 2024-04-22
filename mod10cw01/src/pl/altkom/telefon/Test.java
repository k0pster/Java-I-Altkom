package pl.altkom.telefon;

public class Test {
    public static void main(String[] args){
        var telefon = new TelefonNaKarte(10);

        for (int i = 0; i < 10; i++) {
            try {
                telefon.rozmawiaj(7);
            } catch (BrakMinut e) {
                System.out.println("---->"+e.getMessage());
                telefon.doladuj(4);
            }
            System.out.printf("Na rozmowy zostało %d min.%n",telefon.ileMinutNaRozmowy());
        }
    }

}
