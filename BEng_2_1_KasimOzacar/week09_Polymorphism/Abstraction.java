package BEng_2_1_KasimOzacar.week09_Polymorphism;


abstract class Animal {
    protected  String name;
    protected int age;

    public abstract void eat();  // Abstract method: Method with no body, just header.
}

class Dog extends Animal {
    public String breed;

    public void bark() {
        System.out.println("BARK! BARK!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is Eating!");
    }
}

class Cat extends Animal {
    public String color;

    public void meaw() {
        System.out.println("MEOWW");
    }

    @Override
    public void eat() {
        System.out.println("Cat is Eating!");
    }
}

class Horse extends Animal {
    public int speed;

    public void kick() {
        System.out.println("Kicked!");
    }

    @Override
    public void eat() {
        System.out.println("Horse is Eating!");
    }
}

public class Abstraction {
    // ! MAIN SECTION
    public static void main(String[] args) {
        Animal cat= new Cat();
        Animal dog= new Dog();
        Animal horse= new Horse();

        Animal[] animals= new Animal[]{cat, dog, horse};

        for(Animal a: animals) {
            a.eat();
        }
    }
    // ! MAIN SECTION
}
