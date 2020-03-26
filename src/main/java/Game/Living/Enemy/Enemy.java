package Game.Living.Enemy;

public abstract class Enemy {

    int healthPoints;

    public Enemy(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public void takeDamage(int damage){
        healthPoints -= damage;
    }

    public int getHealthPoints(){
        return healthPoints;
    }
}
