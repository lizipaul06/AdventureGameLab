package Living.Enemy;
import Game.Living.Enemy.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DragonTest {
    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon(200);
    }

    @Test
    public void canGetHealth(){
        assertEquals(200, dragon.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        dragon.takeDamage(20);
        assertEquals(180, dragon.getHealthPoints());
    }
}
