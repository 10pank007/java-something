package lesson2.demo3_extends.other_option;

public class Archer extends Forest{

    public Archer(int dmg, int def, TYPE type) {
        super(dmg, def, type);
    }

    @Override
    public void castSpell() {
        System.out.println("spell of double arrow");
    }
}
