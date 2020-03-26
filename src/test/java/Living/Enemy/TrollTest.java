package Living.Enemy;

import Game.Living.Enemy.Ogre;
import Game.Living.Enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;

    @Before
    public void before(){
        troll = new Troll(200);
    }

    @Test
    public void canGetHealth(){
        assertEquals(200, troll.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        troll.takeDamage(20);
        assertEquals(180, troll.getHealthPoints());
    }

}
