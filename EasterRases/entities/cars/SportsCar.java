package easterRaces.entities.cars;

public class SportsCar extends BaseCar implements Car {
    protected SportsCar(String model, int horsePower, double cubicCentimeters) {
        super(model, horsePower, cubicCentimeters);
    }
}
