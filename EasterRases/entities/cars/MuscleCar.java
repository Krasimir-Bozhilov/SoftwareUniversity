package easterRaces.entities.cars;

public class MuscleCar extends BaseCar implements Car {
    public static final double FINAL_CUBIC_CENTIMETERS=5000;
    public MuscleCar(String model, int horsePower, double cubicCentimeters) {
        super(model, horsePower, cubicCentimeters);
        this.setCubicCentimeters(FINAL_CUBIC_CENTIMETERS);
        this.setHorsePower(horsePower);
    }
    @Override
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
@Override
    public void setCubicCentimeters(double cubicCentimeters) {
        this.cubicCentimeters = FINAL_CUBIC_CENTIMETERS;
    }

}
