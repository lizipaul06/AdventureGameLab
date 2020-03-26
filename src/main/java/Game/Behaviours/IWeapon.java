package Game.Behaviours;

import Game.Living.Enemy.Enemy;
import Game.NonLiving.Weapons.Weapon;

public interface IWeapon {

    public void attack(Enemy enemy);
}
