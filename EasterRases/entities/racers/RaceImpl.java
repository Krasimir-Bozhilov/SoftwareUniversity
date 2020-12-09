package easterRaces.entities.racers;

import easterRaces.entities.drivers.Driver;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class RaceImpl implements Race {
    private String name;
    private int laps;
    private ArrayList drivers;

    protected RaceImpl(String name, int laps) {
        this.setName(name);
        this.setLaps(laps);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    public void setDrivers(ArrayList drivers) {
        this.drivers = drivers;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getLaps() {
        return 0;
    }

    @Override
    public Collection<Driver> getDrivers() {
        return null;
    }

    @Override
    public void addDriver(Driver driver) {

    }
}
