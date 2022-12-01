package BEng_2_1_NehadTARamaha.week08_Inheritance;


class Animal {
    public String name;
    public int age;

    public void eat() {
        System.out.println("Eating...");
    }
}

class Cat extends Animal {
    public String color;

    public void meow() {
        System.out.println("MEOWW");
    }
}

class Dog extends Animal {
    public String breed;

    public void bark() {
        System.out.println("BARK! BARK!");
    }
}

public class Animals {
    // ! MAIN SECTION
    public static void main(String[] args) {
        Animal animal= new Animal();
        Cat cat= new Cat();
        Dog dog= new Dog();

        // * Parent Class Examples
        animal.eat();   animal.age= 6;
        cat.eat();      cat.age= 3;
        dog.eat();      dog.age= 8;

        // * Child Class Examples
        cat.meow();     cat.color= "Yellow";
        dog.bark();     dog.breed= "Beagle";
    }
    // ! MAIN SECTION
}
