package easterRaces.repositories.interfaces;

import easterRaces.entities.cars.BaseCar;

import java.util.Collection;

public class BaseCarRepository<T extends BaseCar> implements Repository<T> {

    @Override
    public T getByName(String name) {
        return null;
    }

    @Override
    public Collection<T> getAll() {
        return null;
    }

    @Override
    public void add(T model) {

    }

    @Override
    public boolean remove(T model) {
        return false;
    }
}
