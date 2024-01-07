package lesson2.demo3_extends.other_option;

public abstract class Forest extends Unit {
    public String buff = "def bonus 20%";
    public Forest(int dmg, int def, TYPE type) {
        super(dmg, def, type);
    }
    public abstract void castSpell();
}
