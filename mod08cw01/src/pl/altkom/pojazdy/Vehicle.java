package pl.altkom.pojazdy;

public abstract class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    abstract double getDistance();

    abstract double getFuelNeeds();

    public double calculateFuelConsumption() {
        return getFuelNeeds() / getDistance() * 100;
    }

    /*
    Class c = String.class;
    Class c = obj.getClass();
    Class c = Class.forName("java.lang.String");
    */
    public void go() {
        System.out.println(getClass().getSimpleName() + ": " + this + " started");
    }

    public void stop() {
        System.out.println(getClass().getSimpleName() + ": " + this + " stopped");
    }
}
