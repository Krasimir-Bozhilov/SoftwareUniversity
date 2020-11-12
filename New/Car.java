package New;

public class Car implements Vehicle {
    private static final double AIR_CONDITIONER_ADDITIONAL_CONSUMPTION = 0.9;
    private double fuel;
    private double consumption;

    public Car(double fiel, double consumption) {
        this.fuel = fiel;
        this.consumption = consumption + AIR_CONDITIONER_ADDITIONAL_CONSUMPTION;
    }

    @Override
    public String drive(double distance) {
        double fuelNeeded = distance * this.consumption;

        if (fuelNeeded > this.fuel) {
            return String.format("Car travelled %.0f km", distance);
        }
        return String.format("Car travelled %.0f km", distance);
    }

    @Override
    public String refuel(double liters) {
        return null;
    }
}