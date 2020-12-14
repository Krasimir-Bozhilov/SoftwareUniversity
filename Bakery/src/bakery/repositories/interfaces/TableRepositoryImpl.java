package bakery.repositories.interfaces;

import java.util.Collection;

public class TableRepositoryImpl<  T extends BaseRepository> implements TableRepository {
    @Override
    public Object getByNumber(int number) {
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
