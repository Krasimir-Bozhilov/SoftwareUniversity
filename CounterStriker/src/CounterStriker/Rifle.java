package CounterStriker.repositories;

public class Rifle extends Gun {
    protected Rifle(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
        int temporaryCount = getBulletsCount() - 10;
        setBulletsCount(temporaryCount);
        if (getBulletsCount() == 0) {
            return 0;
        } else {
            return 10;
        }
    }
}
