package Living.Player;

import Game.Living.Enemy.Troll;
import Game.Living.Player.Dwarf;
import Game.Living.Player.Knight;
import Game.NonLiving.Weapons.Sword;
import Game.NonLiving.Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DwarfTest {

    Dwarf dwarf;
    Weapon weapon;
    Troll troll;

    @Before
    public void before(){
        dwarf = new Dwarf("Harry", 200);
        weapon = new Sword(20, "Tom");
    }

    @Test
    public void canGetHealthPoint(){
        assertEquals(200, dwarf.getHealthPoints());
    }

    @Test
    public void canGetName(){
        assertEquals("Harry", dwarf.getName());
    }

    @Test
    public void canGetWeapon(){
        assertNull(dwarf.getWeapon());
    }

    @Test
    public void canSetWeapon() {

        dwarf.setWeapon(weapon);
        assertEquals(weapon, dwarf.getWeapon());
    }

    @Test
    public void canAttackTroll() {
        troll = new Troll(100);
        dwarf.setWeapon(weapon);
        dwarf.attack(troll);
        assertEquals(80, troll.getHealthPoints());
    }
}
