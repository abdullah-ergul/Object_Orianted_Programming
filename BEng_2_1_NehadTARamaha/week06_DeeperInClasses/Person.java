package BEng_2_1_NehadTARamaha.week06_DeeperInClasses;

public class Person {
    int id;
    String firstName;
    String lastName;
    int age;

    public Person(int id, String firstName, String lastName, int age){
        this.id= id;
        this.firstName= firstName;
        this.lastName= lastName;
        this.age= age;
    }

    public Person(String firstName, String lastName){
        this(0,firstName,lastName,0);
    }

    public Person(int id){
        this(id,"Name","Surname",0);
    }

    @Override
    public String toString(){
        return firstName+" "+lastName+"'s:\nid: "+id+" age:"+age+"\n";
    }

    // ! MAIN SECTION
    public static void main(String[] args){
        Person p1= new Person(11, "Abdullah", "Ergül", 20);
        Person p2= new Person("Emre", "Ercan");
        Person p3= new Person(13);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
    // ! MAIN SECTION
}
