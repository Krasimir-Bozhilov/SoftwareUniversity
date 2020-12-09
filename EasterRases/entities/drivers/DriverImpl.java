package easterRaces.entities.drivers;

import easterRaces.entities.cars.Car;

public  class DriverImpl implements Driver {

    private String name;
    private Car car;
    private int numberOfWins;
    private boolean canParticipate;

    protected DriverImpl(String name){
        this.name=name;
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public Car getCar() {
        return null;
    }

    @Override
    public int getNumberOfWins() {
        return 0;
    }

    @Override
    public void addCar(Car car) {

    }

    @Override
    public void winRace() {

    }

    @Override
    public boolean getCanParticipate() {
        return false;
    }
}
