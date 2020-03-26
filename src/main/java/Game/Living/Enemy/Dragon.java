package Game.Living.Enemy;

import Game.Behaviours.IDefend;
import Game.Behaviours.IHeal;

public class Dragon extends Enemy implements IDefend {
    public Dragon(int healthPoints) {
        super(healthPoints);
    }

    public void defendSelf() {

    }
}
