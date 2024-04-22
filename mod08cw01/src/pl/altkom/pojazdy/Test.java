package pl.altkom.pojazdy;

public class Test {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Renault"),
                new Truck("Star"),
                new RaceCar("Ferrari"),
                new Ship("Titanic"),
                new Plane("Dreamliner")
        };
        for(Vehicle v:vehicles ){
            v.go();
            //wywowałnie metody która jest tylko w samolocie
            if(v instanceof Flying p){
                p.callAirControl();
            }
            v.stop();
            System.out.printf("Efficiency: %.1f l/100km%n%n",v.calculateFuelConsumption());
        }
    }
}
