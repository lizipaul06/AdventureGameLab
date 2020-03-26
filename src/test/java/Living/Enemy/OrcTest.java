package Living.Enemy;

import Game.Living.Enemy.Ogre;
import Game.Living.Enemy.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {
    Orc orc;

    @Before
    public void before(){
        orc = new Orc(200);
    }

    @Test
    public void canGetHealth(){
        assertEquals(200, orc.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        orc.takeDamage(20);
        assertEquals(180, orc.getHealthPoints());
    }
}
