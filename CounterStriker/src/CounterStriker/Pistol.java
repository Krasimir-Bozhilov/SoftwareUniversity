package CounterStriker.repositories;

public class Pistol extends Gun {
    protected Pistol(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
       int temporaryCount= getBulletsCount()-1;
       setBulletsCount(temporaryCount);
        if (getBulletsCount()==0){
            return 0;
        }else {
            return 1;
        }
    }
}
