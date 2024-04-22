package pl.altkom.pojazdy;

public class RaceCar extends Car{

    public RaceCar(String name) {
        super(name);
    }

    @Override
    double getFuelNeeds() {
        return 500;
    }
}
