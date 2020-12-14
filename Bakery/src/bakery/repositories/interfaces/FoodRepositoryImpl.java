package bakery.repositories.interfaces;

import bakery.entities.bakedFoods.interfaces.BakedFood;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public  class FoodRepositoryImpl<T extends BakedFood> implements FoodRepository<T> {
    private List<T>models;

    public FoodRepositoryImpl(){
        this.models=new ArrayList<>();
    }
    @Override
    public T getByName(String name) {
        T food =null;
        for (T model : models) {
            if (model.getName().equals(name)){
                food =model;
            }
        }
        return food;
    }

    @Override
    public Collection<T> getAll() {
        return this.models;
    }

    @Override
    public void add(T t) {
        models.add(t);

    }
}
