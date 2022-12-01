package BEng_2_1_KasimOzacar.week08_Inheritance;

class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name= name;
        this.age= age;
    }
}

class Dog extends Animal {
    public String breed;

    public void bark() {
        System.out.println("BARK! BARK!");
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed= breed;
    }
}

class Cat extends Animal {
    public String color;

    public void meaw(){
        System.out.println("MEOWW");
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color= color;
    }
}


public class InheritanceAnimal {
    // ! MAIN SECTION
    public static void main(String[] args) {
        Animal animal= new Animal("Bird", 4);
        Cat cat= new Cat("Tekir", 7, "Yellow");
        Dog dog= new Dog("Dino", 3, "Bulldog");

        // * Parent Class
        System.out.println(animal.age);
        System.out.println(cat.age);
        System.out.println(dog.age);

        // * Child Class
        cat.meaw();
        dog.bark();
    }
    // ! MAIN SECTION
}
