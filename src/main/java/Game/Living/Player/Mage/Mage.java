package Game.Living.Player.Mage;

import Game.Behaviours.IDefend;
import Game.Behaviours.ISpell;
import Game.Living.Player.Player;

public abstract class Mage extends Player implements ISpell, IDefend {
    public Mage(String name, int healthPoints) {
        super(name, healthPoints);
    }
}
