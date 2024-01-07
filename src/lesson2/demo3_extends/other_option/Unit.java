package lesson2.demo3_extends.other_option;

public abstract class Unit {
    public int dmg;
    public int def;
    public TYPE type;

    public Unit(int dmg, int def, TYPE type) {
        this.dmg = dmg;
        this.def = def;
        this.type = type;
    }
}
