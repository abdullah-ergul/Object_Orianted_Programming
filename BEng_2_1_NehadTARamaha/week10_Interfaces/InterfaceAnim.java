package BEng_2_1_NehadTARamaha.week10_Interfaces;


public class InterfaceAnim {
    // ! MAIN SECTION
    public static void main(String[] args) {
        Duck duck = new Duck();
        Cat cat = new Cat();
        Eagle eagle = new Eagle();

        Animal[] animals = {duck, cat, eagle};

        for (Animal a: animals) {
            System.out.println(a);
        }
    }
    // ! MAIN SECTION
}

interface Moveable {
    void move();
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

abstract class Animal {
    protected String name;
}

class Duck extends Animal implements Moveable, Flyable, Swimmable {
    public void swim() {
        System.out.println("Duck Swimming!");
    }

    public void fly() {
        System.out.println("Duck Flying!");
    }

    public void move() {
        System.out.println("Duck Moving!");
    }
}

class Cat extends Animal implements Moveable, Swimmable {
    public void swim() {
        System.out.println("Cat Swimming!");
    }

    public void move() {
        System.out.println("Cat Moving!");
    }
}

class Eagle extends Animal implements Flyable {
    public void fly() {
        System.out.println("Eagle Flying!");
    }
}
