package abstractfactory.weapon;

public class Axe implements Weapon {

    @Override
    public void damage() {
        System.out.println("Axe damaged");
    }

}
