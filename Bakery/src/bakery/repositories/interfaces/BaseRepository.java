package bakery.repositories.interfaces;

import bakery.entities.bakedFoods.interfaces.BaseFood;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BaseRepository<T> implements Repository<T> {
    public List<T>models;
    protected BaseRepository(){
        this.models=new ArrayList<>();
    }

    @Override
    public Collection<T> getAll() {
        return Collections.unmodifiableList(models);
    }

    @Override
    public void add(T t) {
        models.add(t);


    }
}
