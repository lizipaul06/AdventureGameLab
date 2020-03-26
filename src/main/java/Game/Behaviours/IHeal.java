package Game.Behaviours;

import Game.Living.Player.Player;

public interface IHeal {

    public void healSelf();

    public void healthPlayer(Player player);
}
