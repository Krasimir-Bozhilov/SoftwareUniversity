package CounterStriker.repositories;

import static CounterStriker.common.ExceptionMessages.INVALID_GUN_BULLETS_COUNT;
import static CounterStriker.common.ExceptionMessages.INVALID_GUN_NAME;

public abstract class Gun implements CounterStriker.models.guns.Gun {
    private String name;
    private int bulletsCount;

    protected Gun(String name, int bulletsCount) {
        this.name = name;
        this.bulletsCount = bulletsCount;
    }

    public void setName(String name) {
        if ("".equals(name) || "\\s+".equals(name))
            throw new NullPointerException(INVALID_GUN_NAME);
        this.name = name;
    }

    public void setBulletsCount(int bulletsCount) {
        if (bulletsCount < 0) {
            throw new IllegalArgumentException(INVALID_GUN_BULLETS_COUNT);
        }
        this.bulletsCount = bulletsCount;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getBulletsCount() {

        return this.bulletsCount;
    }


}
