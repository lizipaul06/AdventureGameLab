package Living.Enemy;

import Game.Living.Enemy.Dragon;
import Game.Living.Enemy.Enemy;
import Game.Living.Enemy.Ogre;
import Game.NonLiving.Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {
    Ogre orge;

    @Before
    public void before(){
        orge = new Ogre(200);
    }

    @Test
    public void canGetHealth(){
        assertEquals(200, orge.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        orge.takeDamage(20);
        assertEquals(180, orge.getHealthPoints());
    }
}


