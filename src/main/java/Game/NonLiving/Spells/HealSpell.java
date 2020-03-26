package Game.NonLiving.Spells;

public class HealSpell extends Spell{


    int health;

    public HealSpell(String name, int health){
        super(name);
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
