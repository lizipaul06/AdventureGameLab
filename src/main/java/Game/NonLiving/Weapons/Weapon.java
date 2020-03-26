package Game.NonLiving.Weapons;

import Game.Behaviours.IWeapon;

public abstract class Weapon implements IWeapon {
    int damage;
    String name;

    public Weapon(int damage, String name){
        this.damage = damage;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
