package BEng_2_1_NehadTARamaha.week09_Polymorphism;


abstract class Animal {
    public String name;
    public int age;

    public abstract void eat();
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


public class PolymorphedAnimals {
    // ! MAIN SECTION
    public static void main(String[] args) {
        Animal cat= new Cat();
        Animal dog= new Dog();
        Animal horse= new Horse();

        // * Upcasting
        Animal[] animals= new Animal[]{cat, dog, horse};

        for(Animal a: animals) {
            a.eat();
        }

        // * Downcasting
        ((Cat)cat).meaw();
    }
    // ! MAIN SECTION
}
