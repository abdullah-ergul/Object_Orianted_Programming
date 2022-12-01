package BEng_2_1_KasimOzacar.week08_Inheritance;

class Animal {
    public String name;
    public int age;
}

class Dog extends Animal {
    public String breed;

    public void bark() {
        System.out.println("BARK! BARK!");
    }
}

class Cat extends Animal {
    public String color;

    public void meaw(){
        System.out.println("MEOWW");
    }
}


public class InheritanceAnimal {
    // ! MAIN SECTION
    public static void main(String[] args) {
        Animal animal= new Animal();
        Cat cat= new Cat();
        Dog dog= new Dog();

        // * Parent Class
        animal.age= 4;
        cat.age= 7;
        dog.age= 3;

        // * Child Class
        cat.meaw();
        dog.bark();
    }
    // ! MAIN SECTION
}
