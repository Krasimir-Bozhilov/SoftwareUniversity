package CounterStriker.models.players;

import CounterStriker.models.guns.Gun;

import static CounterStriker.common.ExceptionMessages.*;

public  abstract   class PlayerImpl implements Player  {

    private String username;
    private int health;
    private int armor;
    private boolean isAlive;
    private Gun gun;

   protected PlayerImpl(String username, int health, int armor, Gun gun) {
        this.setUsername(username);
        this.setHealth(health);
        this.setArmor(armor);
        this.setGun(gun);
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
       if (username==null||username.trim().isEmpty()){
           throw new NullPointerException(INVALID_PLAYER_NAME);
       }
        this.username = username;
    }

    @Override
    public int getHealth() {

            return health;

    }

    public void setHealth(int health) {
        if (health < 0) {
            throw new IllegalArgumentException(INVALID_PLAYER_HEALTH);
        }
        this.health = health;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        if (armor < 0) {
            throw new IllegalArgumentException(INVALID_PLAYER_ARMOR);
        }
            this.armor = armor;

    }

    @Override
    public boolean isAlive() {
        return this.health>0;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
       if (gun==null){
           throw new NullPointerException(INVALID_GUN);
       }
        this.gun = gun;
    }
    @Override
    public void takeDamage(int points) {
        int damage = points;
        if (points > this.getArmor()) {
            damage -= this.getArmor();
            this.armor = 0;
            this.health -= damage;
        } else {
            this.armor -= damage;
        }
    }
}
