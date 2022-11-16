package BEng_2_1_NehadTARamaha.HomeWork_1;
enum AnimalTypes{
    MAMMAL,
    BIRD,
    REPTILE,
    FISH;
}

class Animal{
    private String name;
    private AnimalTypes type;

    public Animal(String name, AnimalTypes type){
        this.name= name;
        this.type= type;
    }

    public String toString(){
        return "Name: "+this.name+" Type: "+this.type;
    }
}

class Zoo{
    public Animal[] animals;

    public Zoo(Animal[] animals){
        this.animals= animals;
    }

    public void printAnimals(){
        int i=0;
        for(Animal a:animals){
            i++;
            System.out.println(i+"- Animal's ; "+a.toString());
        }
    }
}

public class MainClassQ1{
    public static void main(String[] args) {
        Animal a1= new Animal("Tekir", AnimalTypes.MAMMAL);
        Animal a2= new Animal("Fistik", AnimalTypes.BIRD);
        Animal a3= new Animal("Kobra", AnimalTypes.REPTILE);
        Animal a4= new Animal("Tontis", AnimalTypes.FISH);

        Animal[] animals= {a1,a2,a3,a4};
        Zoo myZoo= new Zoo(animals);

        myZoo.printAnimals();
    }
}
