package CounterStriker.repositories;

import CounterStriker.models.guns.Gun;

public abstract class Player implements CounterStriker.models.players.Player {

    private String username;
    private int health;
    private int armor;
    private boolean isAlive = true;
    private CounterStriker.repositories.Gun gun;

    protected Player(String username, int health, int armor,
                     CounterStriker.repositories.Gun gun) {
        this.username = username;
        this.health = health;
        this.armor = armor;
        this.gun = gun;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public int getArmor() {
        return 0;
    }

    @Override
    public Gun getGun() {
        return null;
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public void takeDamage(int points) {

    }
}
