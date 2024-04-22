package pl.altkom.kostka;
import java.util.Random;
public class Kostka {
    public static void main(String[] args) {
        Random generator = new Random();
        int diceThrow = generator.nextInt(6)+1;
        System.out.println(diceThrow);
    }
}
