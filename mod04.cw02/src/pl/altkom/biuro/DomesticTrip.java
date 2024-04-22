package pl.altkom.biuro;

import java.time.LocalDate;

public class DomesticTrip extends Trip{
    private int ownArrivalDiscount;
    public DomesticTrip(LocalDate start, LocalDate end, String destination) {
        super(start, end, destination);
    }

    public void setOwnArrivalDiscount(int ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public int getPrice() {
        return super.getPrice() - ownArrivalDiscount;
    }
}
