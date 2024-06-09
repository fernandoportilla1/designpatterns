package builder;

public class Enemy {
    private String name;
    private String type;
    private int health;
    private int damage;
    private int enduranceLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getEnduranceLevel() {
        return enduranceLevel;
    }

    public void setEnduranceLevel(int enduranceLevel) {
        this.enduranceLevel = enduranceLevel;
    }

    public static EnemyBuilder  builder() {
        return new EnemyBuilder();
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                ", enduranceLevel=" + enduranceLevel +
                '}';
    }
}
