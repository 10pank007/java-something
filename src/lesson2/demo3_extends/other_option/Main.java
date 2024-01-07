package lesson2.demo3_extends.other_option;

public class Main {
    public static void main(String[] args) {
        Archer archer = new Archer(100, 20, TYPE.DISTANCE);
        GreenDragon greenDragon = new GreenDragon(200, 300, TYPE.FLY);
        Forest [] forests = {archer, greenDragon};

        Garpy garpy = new Garpy(140, 50, TYPE.FLY);
        BlackDragon blackDragon = new BlackDragon(220, 280, TYPE.FLY);
        Dungeon [] dungeons = {garpy, blackDragon};

        Unit [] units = {archer, greenDragon, blackDragon, garpy};


    }
}
