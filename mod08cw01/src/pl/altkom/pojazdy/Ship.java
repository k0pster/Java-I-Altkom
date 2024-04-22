package pl.altkom.pojazdy;

public class Ship extends Vehicle implements Sailing{

    public Ship(String name) {
        super(name);
    }

    @Override
    public void dock() {
        System.out.println(this + " docked");
    }

    @Override
    double getDistance() {
        return 6000;
    }

    @Override
    double getFuelNeeds() {
        return 24000*60;
    }
    @Override
    public void stop() {
        dock();
    }
}
