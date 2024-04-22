package pl.altkom.biuro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public class MainHandler implements UserInterface {
    private TravelOffice to;
    private Scanner sc;
    private Logger logger = Logger.getLogger("pl.altkom.biuro");

    public MainHandler(TravelOffice to) {
        this.to = to;
        sc = new Scanner(System.in);
        sc.useDelimiter("\n");
    }

    @Override
    public Customer addCustomer() {
        System.out.print("First name? ");
        String firstName = sc.next();
        System.out.print("Last name? ");
        String lastName = sc.next();
        Customer customer = new Customer(firstName + " " + lastName);
        System.out.print("Street? ");
        String street = sc.next();
        System.out.print("Zip code? ");
        String zipCode = sc.next();
        System.out.print("Location? ");
        String location = sc.next();
        Address address = new Address(street, zipCode, location);
        customer.setAddress(address);
        to.addCustomer(customer);
        System.out.println("System has accepted new customer...");
        logger.info("Dodano nowego klienta!");
        return customer;
    }

    @Override
    public Trip addTrip() {
        System.out.print("Trip id? ");
        String id = sc.next();
        System.out.print("Destination? ");
        String destination = sc.next();
        System.out.print("Start date [yyyy-mm-dd]? ");
        String start = sc.next();
        System.out.print("End date [yyyy-mm-dd]? ");
        String end = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startDate = LocalDate.parse(start, formatter);
        LocalDate endDate = LocalDate.parse(end,formatter);
        System.out.print("Price? ");
        int price = sc.nextInt();
        System.out.print("Trip type [a/l]? ");
        String type = sc.next();
        Trip trip;
        if ("a".equals(type)) {
            System.out.print("Insurance? ");
            int insurance = sc.nextInt();
            trip = new AbroadTrip(startDate, endDate, destination);

            ((AbroadTrip) trip).setInsurance(insurance);
        } else {
            System.out.print("own arrival discount? ");
            int discount = sc.nextInt();
            trip = new DomesticTrip(startDate, endDate, destination);
            ((DomesticTrip) trip).setOwnArrivalDiscount(discount);
        }
        trip.setPrice(price);
        to.addTrip(id, trip);
        System.out.println("System has accepted new trip...");
        return null;
    }

    @Override
    public void assign() {
        System.out.print("First name? ");
        String firstName = sc.next();
        System.out.print("Last name? ");
        String lastName = sc.next();
        Customer customer = to.findCustomerByName(firstName + " " + lastName);
        if (customer == null) {
            System.out.println("No such customer...");
            return;
        }
        System.out.print("Trip id? ");
        String id = sc.next();
        Trip trip = to.getTrips().get(id);
        if (trip == null){
            System.out.println("No such trip...");
            return;
        }
            customer.assignTrip(trip);
            System.out.println("System has assigned trip to customer...");
    }

    @Override
    public boolean removeCustomer() {
        System.out.print("First name? ");
        String firstName = sc.next();
        System.out.print("Last name? ");
        String lastName = sc.next();
        to.getCustomers().removeIf(c -> c.toString().startsWith("Name: " + firstName + " " + lastName + "\n"));
        return true;
//        Customer customer = to.findCustomerByName(firstName + " " + lastName);
//        if (customer == null) {
//            System.out.println("No such customer...");
//            return false;
//        }
//        return to.removeCustomer(customer);
    }

    @Override
    public boolean removeTrip() {
        System.out.print("Trip id? ");
        String id = sc.next();
        return to.removeTrip(id);
    }

    @Override
    public void showTrips() {
        System.out.println("Trip list:");
//        for (Map.Entry<String, Trip> entry : to.getTrips().entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
        //pierwszy sposób
        //to.getTrips().entrySet().forEach(e -> System.out.println(e.getKey() + ": "+ e.getValue()));
        to.getTrips().forEach((id, trip) -> System.out.println(id + ": " + trip));
    }

    @Override
    public void showCustomers() {
        System.out.println("Customer list:");
//        for (Customer customer : to.getCustomers()) {
//            System.out.println(customer + "\n");
//        }
        to.getCustomers().forEach(c -> System.out.println(c + "\n"));
    }
}
