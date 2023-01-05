package BEng_2_1_NehadTARamaha.week13_FileOperators.LabExamples;

public class Animals {
    // ! MAIN SECTION
    public static void main(String[] args) {
        Fish fish = new Fish();
        Duck duck = new Duck();

        fish.swim();
        duck.fly();
    }
    // ! MAIN SECTION
}

interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

abstract class Animal {
    abstract void move();
}

class Fish extends Animal implements Swimmable {
    public void swim() {
        System.out.println("fish swims");
    }

    void move() {
        System.out.println("fish moves");
    }
}

class Duck extends Animal implements Swimmable, Flyable {
    public void swim() {
        System.out.println("duck swims");
    }

    public void fly() {
        System.out.println("duck flies");
    }

    void move() {
        System.out.println("duck moves");
    }
}
