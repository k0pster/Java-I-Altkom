package pl.altkom.teksty;

public class Porownanie {
    public static void porownaj(String tekst1, String tekst2) {
        System.out.println("Porównanie za pomocą metody equals: " + tekst1.equals(tekst2));
        System.out.println("Porównanie za pomocą operatora == : " + (tekst1 == tekst2));
    }

    public static void main(String[] args) {
        String s1 = new String("abc"); // użycie konstruktora
        String s2 = new String("abc"); // uzycie konstruktora
        System.out.println("[Użycie konstruktorów]");
        porownaj(s1, s2);

        s1 = "abc";
        s2 = "abc";
        System.out.println("\n[Użycie literałów]");
        porownaj(s1, s2);
    }
}
