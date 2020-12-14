package bakery.repositories.interfaces;

import java.util.Collection;

public class DrinkRepositoryImpl < T extends BaseRepository> implements DrinkRepository {
    @Override
    public Object getByNameAndBrand(String drinkName, String drinkBrand) {
        return null;
    }

    @Override
    public Collection getAll() {
        return null;
    }

    @Override
    public void add(Object o) {

    }
}
