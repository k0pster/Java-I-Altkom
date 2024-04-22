package pl.altkom.biuro;


import java.time.LocalDate;
import java.util.Locale;

public abstract class Trip {
    private LocalDate start;
    private LocalDate end;
    private String destination;
    private int price;

    public Trip(LocalDate start, LocalDate end, String destination) {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("from %s to %s, %s, price: %d",start,end,destination,getPrice());
    }
}

