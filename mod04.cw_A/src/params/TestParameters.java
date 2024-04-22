package params;

import java.util.Date;

public class TestParameters {
    // metoda zmienia wartość parametru a
    public void changeValue(int a) {
        a = 10;
    }

    // metoda zmienia wartość parametru msg
    public void changeValue(String msg) {
        msg = "pies"; // tworzony jest nowy obiekt
    }

    // metoda zmienia stan (dane) obiektu wskazanego przez parametr data (referencję typu Date)
    public void changeValue(Date data) {
        data.setTime(0); // data i czas ustawiana jest na początek epoki unix'owej (1 stycznia 1970, godz. 0:00)
    }

    // metoda główna
    public static void main(String[] args) {
        int a = 5;
        String msg = "kot";
        Date date = new Date();

        // wartości początkowe
        System.out.println("WARTOSCI POCZATKOWE:");
        System.out.println("a    = " + a);
        System.out.println("msg  = " + msg);
        System.out.println("date = " + date);

        // aby wywołać metodę na rzecz obiektu należy go najpierw utworzyć
        TestParameters test = new TestParameters();
        test.changeValue(a);
        test.changeValue(msg);
        test.changeValue(date);

        // sprawdzenie wartości
        System.out.println("\nWARTOSCI KONCOWE:");
        System.out.println("a    = " + a);
        System.out.println("msg  = " + msg);
        System.out.println("date = " + date);
    }
}
