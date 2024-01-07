package lesson2.demo3_extends.other_option;

public abstract class Dungeon extends Unit {
    public String bonus = "hit forest unit twice";

    public Dungeon(int dmg, int def, TYPE type) {
        super(dmg, def, type);
    }
    public abstract void portal();
}
