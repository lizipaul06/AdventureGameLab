package Living.Player;

import Game.Living.Enemy.Troll;
import Game.Living.Player.Barbarian;
import Game.Living.Player.Knight;
import Game.NonLiving.Weapons.Sword;
import Game.NonLiving.Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BarbarianTest {

    Barbarian barbarian;
    Weapon weapon;
    Troll troll;

    @Before
    public void before(){
        barbarian = new Barbarian("Harry", 200);
        weapon = new Sword(20, "Tom");
    }

    @Test
    public void canGetHealthPoint(){
        assertEquals(200, barbarian.getHealthPoints());
    }

    @Test
    public void canGetName(){
        assertEquals("Harry", barbarian.getName());
    }

    @Test
    public void canGetWeapon(){
        assertNull(barbarian.getWeapon());
    }

    @Test
    public void canSetWeapon() {

        barbarian.setWeapon(weapon);
        assertEquals(weapon, barbarian.getWeapon());
    }

    @Test
    public void canAttackTroll() {
        troll = new Troll(100);
        barbarian.setWeapon(weapon);
        barbarian.attack(troll);
        assertEquals(80, troll.getHealthPoints());
    }
}
