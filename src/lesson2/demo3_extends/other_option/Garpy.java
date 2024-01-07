package lesson2.demo3_extends.other_option;

public class Garpy extends Dungeon {


    public Garpy(int dmg, int def, TYPE type) {
        super(dmg, def, type);
    }

    @Override
    public void portal() {
        System.out.println("lost 10 unit");
    }
}
