package abstractfactory.factory;

import abstractfactory.armor.Armor;
import abstractfactory.armor.HeavyArmor;
import abstractfactory.enemy.Enemy;
import abstractfactory.enemy.Warrior;
import abstractfactory.weapon.Axe;
import abstractfactory.weapon.Weapon;

public class WarriorFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new Axe();
    }
}
