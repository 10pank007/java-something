package lesson2.demo3_extends.other_option;

public class BlackDragon extends Dungeon{
    public BlackDragon(int dmg, int def, TYPE type) {
        super(dmg, def, type);
    }

    @Override
    public void portal() {
        System.out.println("lost 1 unit");
    }
}
