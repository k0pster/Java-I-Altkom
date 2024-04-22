package pl.altkom.pojazdy;

public class Car extends Vehicle{
    public Car(String name) {
        super(name);
    }

    @Override
    double getDistance() {
        return 1000;
    }

    @Override
    double getFuelNeeds() {
        return 60;
    }
}
