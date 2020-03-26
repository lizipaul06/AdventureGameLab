package Living.Player.Mage;

import Game.Living.Enemy.Troll;
import Game.Living.Player.Knight;
import Game.Living.Player.Mage.Wizard;
import Game.NonLiving.Weapons.Sword;
import Game.NonLiving.Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class WizardTest {

    Wizard wizard;
    Weapon weapon;
    Troll troll;

    @Before
    public void before(){
        wizard = new Wizard("Harry", 200);
        weapon = new Sword(20, "Tom");
    }

    @Test
    public void canGetHealthPoint(){
        assertEquals(200, wizard.getHealthPoints());
    }

    @Test
    public void canGetName(){
        assertEquals("Harry", wizard.getName());
    }

    @Test
    public void canGetWeapon(){
        assertNull(wizard.getWeapon());
    }

    @Test
    public void canSetWeapon() {

        wizard.setWeapon(weapon);
        assertEquals(weapon, wizard.getWeapon());
    }

    @Test
    public void canAttackTroll() {
        troll = new Troll(100);
        wizard.setWeapon(weapon);
        wizard.attack(troll);
        assertEquals(80, troll.getHealthPoints());
    }
}
