package pl.altkom.tablica;

import java.util.Random;

public class Kopiowanie {
    public static void main(String[] args) {
        int rozmiar = 50_000_000;
        //deklaruje tablice
        int[] tab1 = new int[rozmiar];
        int[] tab2 = new int[rozmiar];
        //deklaracja random
        Random rand = new Random();
        /*
        generator.nextInt(n)  -> 0 a n-1
        generator.nextInt(n) + 10 -> 10 a n+9
        n+9=99 -> n=90
        albo dodać do Random dwa argumenty
         */
        int random = rand.nextInt(10,99);

        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = rand.nextInt();
        }
        //mierzymy czas
        // można dwoma metodami al w przypadku nano musimy róznice (stop-start) musimy podzielic na milion
        // long start = System.currentTimeMillis();
        long start = System.nanoTime();

        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = tab1[i];
        }
        //spradzam czas
        //long stop = System.currentTimeMillis();
        long stop = System.nanoTime();
        System.out.println("Kopiowanie za pomoca pętli trwało: "+ (stop-start)/1e6 + " ms");

        //zmierzenie czasu kopiowania metoda arraycopy
        //start = System.currentTimeMillis();
        start = System.nanoTime();
        System.arraycopy(tab1,0,tab2,0,rozmiar);
        //stop = System.currentTimeMillis();
        stop = System.nanoTime();
        System.out.println("Kopiowanie metoda Arraycopy trwało: "+ (stop-start)/1e6+ " ms");
    }

}
