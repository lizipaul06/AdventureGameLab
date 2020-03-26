package Game.NonLiving.Spells;


public class AttackSpell extends Spell{

    int damage;

    public AttackSpell(String name, int damage){
        super(name);
        this.damage = damage;
    }
}

