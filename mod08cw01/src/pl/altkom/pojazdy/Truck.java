package pl.altkom.pojazdy;

public class Truck extends Car{

    public Truck(String name) {
        super(name);
    }

    @Override
    double getFuelNeeds() {
        return 400;
    }
}
