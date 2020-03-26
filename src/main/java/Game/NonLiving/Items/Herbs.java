package Game.NonLiving.Items;

public class Herbs {

    String name;
    int health;

    public Herbs(String name, int health){
        this.name = name;
        this.health = health;
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

    public Herbs(String name){
        this.name = name;
        this.health = 10;
    }
}
