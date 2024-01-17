package lesson2.demo3_extends.other_option;

public class GreenDragon extends Forest{


    public GreenDragon(int dmg, int def, TYPE type) {
        super(dmg, def, type);
    }

    @Override
    public void castSpell() {
        System.out.println("hit armagedon");
    }
}
