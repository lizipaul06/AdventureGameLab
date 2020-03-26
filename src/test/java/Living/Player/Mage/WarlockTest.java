package Living.Player.Mage;

import Game.Living.Enemy.Troll;
import Game.Living.Player.Knight;
import Game.Living.Player.Mage.Warlock;
import Game.NonLiving.Weapons.Sword;
import Game.NonLiving.Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class WarlockTest {

    Warlock warlock;
    Weapon weapon;
    Troll troll;

    @Before
    public void before(){
        warlock = new Warlock("Harry", 200);
        weapon = new Sword(20, "Tom");
    }

    @Test
    public void canGetHealthPoint(){
        assertEquals(200, warlock.getHealthPoints());
    }

    @Test
    public void canGetName(){
        assertEquals("Harry", warlock.getName());
    }

    @Test
    public void canGetWeapon(){
        assertNull(warlock.getWeapon());
    }

    @Test
    public void canSetWeapon() {

        warlock.setWeapon(weapon);
        assertEquals(weapon, warlock.getWeapon());
    }

    @Test
    public void canAttackTroll() {
        troll = new Troll(100);
        warlock.setWeapon(weapon);
        warlock.attack(troll);
        assertEquals(80, troll.getHealthPoints());
    }
}
