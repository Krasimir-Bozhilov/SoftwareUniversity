package CounterStriker.core;

import CounterStriker.models.field.Field;
import CounterStriker.models.field.FieldImpl;
import CounterStriker.models.guns.Gun;
import CounterStriker.models.guns.Pistol;
import CounterStriker.models.guns.Rifle;
import CounterStriker.models.players.Player;
import CounterStriker.repositories.GunRepository;
import CounterStriker.repositories.PlayerRepository;
import CounterStriker.repositories.Repository;

import java.util.Collection;

import static CounterStriker.common.ExceptionMessages.INVALID_GUN_TYPE;

public class ContollerImp implements Controller {
    private Repository<Gun> guns;
    private Repository<Player> players;
    private Field field;

    public ContollerImp() {
        this.guns = new GunRepository<>();
        this.players = new PlayerRepository<>();
        this.field = new FieldImpl();


    }

    @Override
    public String addGun(String type, String name, int bulletsCount) {
        Gun gun;
        if ("Pistol".equals(type)){
            gun=new Pistol(name, bulletsCount);
        }else if ("Rifle".equals(type)){
            gun=new Rifle(name, bulletsCount);
        }else {
            throw new IllegalArgumentException(INVALID_GUN_TYPE);
        }
        this.guns.add(gun);
        return guns.toString();
    }

    @Override
    public String addPlayer(String type, String username, int health, int armor, String gunName) {
        return null;
    }

    @Override
    public String startGame() {
        return null;
    }

    @Override
    public String report() {
        return null;
    }
}

