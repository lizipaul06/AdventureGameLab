package NonLiving.Items;

import Game.NonLiving.Items.HealthPotion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealthPotionTest {

    HealthPotion healthPotion;

    @Before
    public void before(){
        healthPotion = new HealthPotion("Daisies");
    }

    @Test
    public void getHealth(){
        assertEquals(20, healthPotion.getHealth());
    }
}
