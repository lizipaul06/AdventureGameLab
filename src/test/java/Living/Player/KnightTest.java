package Living.Player;

import Game.Living.Enemy.Troll;
import Game.Living.Player.Knight;
import Game.NonLiving.Weapons.Sword;
import Game.NonLiving.Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class KnightTest {

    Knight knight;
    Weapon weapon;
    Troll troll;

    @Before
    public void before(){
        knight = new Knight("Harry", 200);
        weapon = new Sword(20, "Tom");
    }

    @Test
    public void canGetHealthPoint(){
        assertEquals(200, knight.getHealthPoints());
    }

    @Test
    public void canGetName(){
        assertEquals("Harry", knight.getName());
    }

    @Test
    public void canGetWeapon(){
        assertNull(knight.getWeapon());
    }

    @Test
    public void canSetWeapon() {

        knight.setWeapon(weapon);
        assertEquals(weapon, knight.getWeapon());
    }

    @Test
    public void canAttackTroll() {
        troll = new Troll(100);
        knight.setWeapon(weapon);
        knight.attack(troll);
        assertEquals(80, troll.getHealthPoints());
    }
}
