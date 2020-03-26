package Game.NonLiving.Items;

public class HealthPotion {
    String name;
    int health;

    public HealthPotion(String name){
        this.name = name;
        this.health = 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
