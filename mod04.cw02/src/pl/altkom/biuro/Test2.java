package pl.altkom.biuro;


import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

// klasa testowa
public class Test2 {
    //konfiguracja logów
    private static void setupLogger() {
        //pozdbycie się defaultowych handlerów
        Logger root = Logger.getLogger("");
        for(Handler handler: root.getHandlers()) {
            root.removeHandler(handler);
        }

        Logger logger = Logger.getLogger("pl.altkom.biuro");
        logger.setLevel(Level.INFO);
        try {
            Handler handler = new FileHandler("log.txt");
            handler.setFormatter(new SimpleFormatter()); //może być XMLFormatter() wtedy to pliku xml
            logger.addHandler(handler);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // metoda główna
    public static void main(String[] args) {
        setupLogger();
        // utwórz biuro podroży
        TravelOffice to = new TravelOffice();
        MainHandler mh = new MainHandler(to);

        Scanner scan = new Scanner(System.in);
        top:
        while (true) {
            System.out.println("SELECT OPTION:");
            System.out.println("1 - Add Customer");
            System.out.println("2 - Add trip");
            System.out.println("3 - Assign trip to customer");
            System.out.println("4 - Remove Customer");
            System.out.println("5 - Remove Trip");
            System.out.println("6 - Show Customers");
            System.out.println("7 - Show Trips");
            System.out.println("0 - Exit");
            int choice;
            if (scan.hasNextInt()) {
                choice = scan.nextInt();
            } else {
                scan.next(); // przeczytanie błędnej danej z bufora
                continue;
            }
            switch (choice) {
                case 1 -> mh.addCustomer();
                case 2 -> mh.addTrip();
                case 3 -> mh.assign();
                case 4 -> mh.removeCustomer();
                case 5 -> mh.removeTrip();
                case 6 -> mh.showCustomers();
                case 7 -> mh.showTrips();
                case 0 -> {
                    break top;
                }
            }
        }
        scan.close();
    }
}
