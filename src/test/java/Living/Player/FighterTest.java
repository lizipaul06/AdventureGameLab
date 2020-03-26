package Living.Player;

import Game.Living.Enemy.Troll;
import Game.Living.Player.Fighter;
import Game.Living.Player.Knight;
import Game.NonLiving.Weapons.Sword;
import Game.NonLiving.Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FighterTest {

    Fighter fighter;
    Weapon weapon;
    Troll troll;

    @Before
    public void before(){
        fighter = new Fighter("Harry", 200);
        weapon = new Sword(20, "Tom");
    }

    @Test
    public void canGetHealthPoint(){
        assertEquals(200, fighter.getHealthPoints());
    }

    @Test
    public void canGetName(){
        assertEquals("Harry",fighter.getName());
    }

    @Test
    public void canGetWeapon(){
        assertNull(fighter.getWeapon());
    }

    @Test
    public void canSetWeapon() {

        fighter.setWeapon(weapon);
        assertEquals(weapon, fighter.getWeapon());
    }

    @Test
    public void canAttackTroll() {
        troll = new Troll(100);
        fighter.setWeapon(weapon);
        fighter.attack(troll);
        assertEquals(80, troll.getHealthPoints());
    }
}
