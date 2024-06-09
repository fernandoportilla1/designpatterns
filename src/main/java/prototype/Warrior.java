package prototype;

public class Warrior extends Enemy{

    private int enduranceLevel;

    public Warrior(int health, int damage, int enduranceLevel) {
        super(health, damage);
        this.enduranceLevel = enduranceLevel;
    }

    public Warrior(Warrior warrior) {
        super(warrior);
        if(warrior != null) {
            setEnduranceLevel(warrior.getEnduranceLevel());
        }
    }

    public Warrior(Enemy enemy, int enduranceLevel) {
        super(enemy);
        this.enduranceLevel = enduranceLevel;
    }

    @Override
    public Enemy clone() {
        return new Warrior(this);
    }

    public int getEnduranceLevel() {
        return enduranceLevel;
    }

    public Warrior setEnduranceLevel(int enduranceLevel) {
        this.enduranceLevel = enduranceLevel;
        return this;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "enduranceLevel=" + enduranceLevel +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
