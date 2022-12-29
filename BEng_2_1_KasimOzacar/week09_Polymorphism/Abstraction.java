package BEng_2_1_KasimOzacar.week09_Polymorphism;


abstract class AnimalAb {
    protected  String name;
    protected int age;

    public abstract void eat();  // Abstract method: Method with no body, just header.
}

class DogA extends AnimalAb {
    public String breed;

    public void bark() {
        System.out.println("BARK! BARK!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is Eating!");
    }
}

class CatA extends AnimalAb {
    public String color;

    public void meaw() {
        System.out.println("MEOWW");
    }

    @Override
    public void eat() {
        System.out.println("Cat is Eating!");
    }
}

class HorseA extends AnimalAb {
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
        AnimalAb cat= new CatA();
        AnimalAb dog= new DogA();
        AnimalAb horse= new HorseA();

        AnimalAb[] animals= new AnimalAb[]{cat, dog, horse};

        for(AnimalAb a: animals) {
            a.eat();
        }
    }
    // ! MAIN SECTION
}
