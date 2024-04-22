package pl.altkom.biuro;


import java.time.LocalDate;

public class AbroadTrip extends Trip{
    private int insurance;
    public AbroadTrip(LocalDate start, LocalDate end, String destination) {
        super(start, end, destination);
    }
    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }
    //nadpisanie ceny z ubezpieczeniem
    @Override
    public int getPrice() {
        return super.getPrice() + insurance;
    }
}
