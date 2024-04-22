package pl.altkom.zdanie;
import static java.lang.Character.*;
public class Zdanie {
    public static void main(String[] args) {
        String tekst = "Gdzie kucharek 6 tam nie ma co jeść!";

        int dlugoscTekstu = tekst.length();
        String wspak = "";
        for(int indeks=dlugoscTekstu - 1; indeks>=0; indeks--){
            char znak = tekst.charAt(indeks);
            if (isLetter(znak)){
                if(isLowerCase(znak)) {
                    znak = toUpperCase(znak);
                } else {
                    znak = toLowerCase(znak);
                }
            }
            //wspak = wspak + znak;
            wspak += znak;
        }
        System.out.println(tekst);
        System.out.println(wspak);
    }
}
