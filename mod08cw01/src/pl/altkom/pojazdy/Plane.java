package pl.altkom.pojazdy;

public class Plane extends Vehicle implements Flying{

    public Plane(String name) {
        super(name);
    }

    @Override
    public void takeOff() {
        System.out.println(this + " took off");
    }

    @Override
    public void land() {
        System.out.println(this + " landed");
    }

    @Override
    public void callAirControl() {
        System.out.println(this + " requested clearance for landing");
    }

    @Override
    double getDistance() {
        return 1600;
    }

    @Override
    double getFuelNeeds() {
        return 12000;
    }

    @Override
    public void go() {
        super.go();
        takeOff();
    }

    @Override
    public void stop() {
        land();
        super.stop();
    }
}
