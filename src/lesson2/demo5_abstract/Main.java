package lesson2.demo5_abstract;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Bird bird = new Bird();
        Horse horse = new Horse();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(bird);
        animals.add(horse);
    }
}
