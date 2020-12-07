package CounterStriker.models.guns;

public class Pistol extends GunImpl {
    private static final int BULLETS_AVAILABLE=1;
    public Pistol(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
        if (super.getBulletsCount()<BULLETS_AVAILABLE){
            return 0;
        }
        super.decreaceBullets(BULLETS_AVAILABLE);
        return BULLETS_AVAILABLE;
    }
}
