package BEng_2_1_NehadTARamaha.week12_Java_Collections_SetMap_Compare;


public class Comparing {
    // ! MAIN SECTION
    public static void main(String[] args) {
        Cat c1 = new Cat("Tom");
        Cat c2 = new Cat("Tom");

        if(c1 == c2)
            System.out.println("Same");
        else
            System.out.println("Not Same");

        
        Worker w1 = new Worker("Jassie", 23);
        Worker w2 = new Worker("Jessie", 23);

        if(w1.equals(w2))
            System.out.println("Same");
        else
            System.out.println("Not Same");   
    }
    // ! MAIN SECTION
}

class Worker {
    private String name;
    private int age;

    Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;

        if(o == null || getClass() != o.getClass()) return false;

        else {
            Worker obj = (Worker)o;
            return this.age == obj.age && this.name.equals(obj);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Animal {
    public String name;
    public int age;

    Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Eating...");
    }
}

class Cat extends Animal {
    public String color;

    Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("MEOWW");
    }
}

class Dog extends Animal {
    public String breed;

    Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("BARK! BARK!");
    }
}
