package Game.Living.Player;

import Game.Behaviours.IHeal;

public class Cleric extends Player implements IHeal {
    public Cleric(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public void healSelf() {
        setHealthPoints(getHealthPoints() + 20);
    }

    public void healthPlayer(Player player) {
        player.setHealthPoints(player.getHealthPoints() + 20);
    }
}
