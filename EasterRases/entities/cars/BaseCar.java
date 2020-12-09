package easterRaces.entities.cars;

public abstract class BaseCar implements Car {
    private String model;
    protected int horsePower;
    protected double cubicCentimeters;

    protected BaseCar(String model,
                      int horsePower, double cubicCentimeters ){
        this.setModel(model);
        this.setHorsePower(horsePower);
        this.setCubicCentimeters(cubicCentimeters);
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setCubicCentimeters(double cubicCentimeters) {
        this.cubicCentimeters = cubicCentimeters;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public int getHorsePower() {
        return 0;
    }

    @Override
    public double getCubicCentimeters() {
        return 0;
    }

    @Override
    public double calculateRacePoints(int laps) {
        return 0;
    }
}
