package abstractfactory.factory;

import abstractfactory.armor.Armor;
import abstractfactory.enemy.Enemy;
import abstractfactory.weapon.Weapon;

public abstract class EnemyAbstractFactory {

    public abstract Enemy createEnemy();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}
