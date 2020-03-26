package NonLiving.Items;

import Game.NonLiving.Items.HealthPotion;
import Game.NonLiving.Items.Herbs;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbsTest {
    Herbs herbs;

    @Before
    public void before(){
        herbs = new Herbs("Daisies");
    }

    @Test
    public void getHealth(){
        assertEquals(10, herbs.getHealth());
    }
}
