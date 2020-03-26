package Game.Living.Player;

import Game.Behaviours.IWeapon;
import Game.Living.Enemy.Enemy;
import Game.NonLiving.Weapons.Weapon;

public class Player implements IWeapon{

    String name;
    int healthPoints;
    Weapon weapon;

    public Player(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
        this.weapon = null;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void chooseOrSwapWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        if(weapon != null) {
            enemy.takeDamage(weapon.getDamage());
        }
    }
}
