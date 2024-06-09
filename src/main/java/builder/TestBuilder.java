package builder;

public class TestBuilder {

    public static void main(String[] args) {
        Enemy trollHunters = Enemy.builder()
                .name("Jim")
                .type("mage")
                .health(100)
                .damage(100)
                .enduranceLevel(100)
                .build();

        System.out.println(trollHunters.toString());

        Enemy enemy = Enemy.builder()
                .name("NotEnrique")
                .type("mage")
                .health(100)
                .enduranceLevel(10)
                .build();

        System.out.println(enemy.toString());
    }
}
