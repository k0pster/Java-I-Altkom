package pl.altkom.tokenizer;

import java.util.StringTokenizer;

public class TestTokenizer {

    public static void main(String[] args) {
        String input = "Witaj w świecie Javy";
        StringTokenizer parser = new StringTokenizer(input);
        int counter = 0;
        while (parser.hasMoreTokens()) {
            String token = parser.nextToken();
            System.out.printf("%2d: [%s]%n", ++counter, token);
        }
    }
}
