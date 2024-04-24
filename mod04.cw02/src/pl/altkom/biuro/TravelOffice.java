package pl.altkom.biuro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TravelOffice {
    //tablica klientów
   private Set<Customer> customers = new HashSet<>();
   private Map<String,Trip> trips = new HashMap<>();

    public Set<Customer> getCustomers() {
        return customers;
    }

    public Map<String, Trip> getTrips() {
        return trips;
    }

    //dodanie klienta
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addTrip(String id,Trip trip){
        trips.put(id,trip);
    }
    //usuwanie wycieczki po kluczu
    public boolean removeTrip(String id){
        return trips.remove(id) != null;
    }

    public Customer findCustomerByName(String name) {
        for (Customer customer : customers){
            if (customer.toString().startsWith("Name: "+name+"\r\n")) {
                return customer;
            };
        }
        return null;
    }

    boolean removeCustomer(Customer customer) {
        if (customer != null){
            return customers.remove(customer);
        }
        return false;
    }

    //pobranie ilości klientów
    public int getCustomerCount() {
        return customers.size();
    }
    @Override
    public String toString(){
        String report = "";
        for(Customer customer: customers){
            report += customer + "\n";
        }
        return report;
    }


}
