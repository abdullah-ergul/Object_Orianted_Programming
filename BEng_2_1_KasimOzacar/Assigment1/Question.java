/**
 * @file Question.java
 * @author Abdullah Ergul (abdullahergul23@gmail.com)
 * @brief 
 * @version 0.1
 * @date 23-12-2022
 * 
 * @copyright Copyright (c) 2022
 * 
 */
package BEng_2_1_KasimOzacar.Assigment1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Person {
    int id;
    String firstName;
    String lastName;
    int age;

    Person(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName + " " + age;
    }
}

class User extends Person {
    String userName;
    String password;

    User(int id, String firstName, String lastName, String username, String password) {
        super(id, firstName, lastName, 0);
        this.userName = username;
        this.password = password;
    }
}

class Category {
    int id;
    String categoryCode;
    String categoryName;

    Category(int id, String code, String name) {
        this.id = id;
        this.categoryCode = code;
        this.categoryName = name;
    }

    @Override
    public String toString() {
        return id + " " + categoryCode + " " + categoryName;
    }
}

abstract class Material {
    int id;
    String name;
    ArrayList<Integer> scores = new ArrayList<>();
    int release_year;
    Category category;
    int price;
    String type;

    Material(int id, String name, ArrayList<Integer> scores, int release_year, int price, Category category, String type) {
        this.id = id;
        this.name = name;
        this.scores = scores;
        this.release_year = release_year;
        this.price = price;
        this.category = category;
        this.type = type;
    }

    public abstract void addScore(int score);

    public abstract double getAvgScore();

    public void showDetail() {
        System.out.println(id + " " + name + " " + scores + " " + release_year + " " + price + " " + category + " " + type);
    }
}

class Book extends Material {
    Person writer;
    int numberOfPages;

    Book(int id, String name, ArrayList<Integer> scores, int release_year, int price, Category category, String type, Person writer, int numberOfPages) {
        super(id, name, scores, release_year, price, category, type);
        this.writer = writer;
        this.numberOfPages = numberOfPages;
    }

    public void setWriter(Person writer) {
        this.writer = writer;
    }

    public void addScore(int score) {
        super.scores.add(score);
    }

    public double getAvgScore() {
        int count = 0;
        double avarage = 0;
        // Iterator<Integer> iterator = scores.iterator();

        for (int num: scores) {
            avarage += num;
            count ++;
            // iterator.next();
        }

        return avarage/count;
    }
}

class Movie extends Material {
    public ArrayList<Person> actors = new ArrayList<>();
    Person director;

    Movie(int id, String name, ArrayList<Integer> scores, int release_year, int price, Category category, String type, ArrayList<Person> actors, Person director) {
        super(id, name, scores, release_year, price, category, type);
        this. actors = actors;
        this.director = director;
    }

    public void addActor(Person actor) {
        this.actors.add(actor);
    }

    @Override
    public void showDetail() {
        System.out.println(id + " - " + name + " - " + scores + " - " + release_year + " - " + price + " - " + super.category + " - " + type + " - " + this.director);
    }

    public void addScore(int score) {
        this.scores.add(score);
    }

    public double getAvgScore() {
        int count = 0;
        double avarage = 0;
        // Iterator<Integer> iterator = scores.iterator();

        for (int num: scores) {
            avarage += num;
            count ++;
            // iterator.next();
        }

        return avarage/count;
    }
}

class Netflix {
    ArrayList<Material> materials = new ArrayList<>();
    User credantial;
    boolean isLogin = false;

    Netflix(ArrayList<Material> materials) {
        this.materials = materials;
    }

    void login(User user) {
        String uName = user.userName, uNameIn;
        String psw= user.password, pswIn;
        Scanner input = new Scanner(System.in);
        int due = 3;

        while(due != 0) {
            System.out.println("Enter Username: "); uNameIn = input.next();
            System.out.println("Enter Password: "); pswIn = input.next();

            if(Objects.equals(uName, uNameIn) && Objects.equals(psw, pswIn)) {
                isLogin = true;
                break;
            }
            else
                System.out.println("Username or Password is Incorrect!\nPlease try again.\n");
            
            due--;
        }

        input.close();
    }

    public void addMovie(Movie m1) {
        if (!isLogin)
            return ;
        materials.add(m1);
    }

    public void addBook(Book b1) {
        if (!isLogin)
            return ;
        materials.add(b1);
    }

    public void addMaterial(Material m2) {
        if (!isLogin)
            return ;
        materials.add(m2);
    }

    void maxScoreMaterial() {
        // Iterator<Material> iterator = materials.iterator();
        double score, maxScore = 0;
        Movie max = new Movie(0, null, null, 0, 0, null, null, null, credantial);

        for (Material m: materials) {
            score = m.getAvgScore();
            if(score > maxScore)
                maxScore= score;
            
            // iterator.next();
        }

        max.showDetail();
    }

    void minScoreMovie() {
        // Iterator<Material> iterator = materials.iterator();
        double score, minScore = 0;
        Movie min = new Movie(0, null, null, 0, 0, null, null, null, credantial);
        boolean q = false;

        for (Material m: materials) {
            if(m instanceof Movie) {
                if(q == false)
                    minScore = m.getAvgScore();
                else{
                    score = m.getAvgScore();
                    if(score < minScore){
                        minScore= score;
                        min = (Movie)m;
                    }
                }
            }
            // iterator.next();
        }

        min.showDetail();
    }

    void maxPrice(int categortId) {
        // Iterator<Material> iterator = materials.iterator();
        int cId, maxPrice= 0;
        Movie maxM = new Movie(categortId, null, null, 0, maxPrice, null, null, null, credantial);
        Book maxB = new Book(categortId, null, null, 0, maxPrice, null, null, credantial, maxPrice);

        for (Material m: materials) {
            cId = m.category.id;
            if(cId == categortId) {
                if(m.price > maxPrice) {
                    maxPrice = m.price;
                    if(m instanceof Movie)
                        maxM = (Movie)m;
                    else if(m instanceof Book)
                        maxB = (Book)m;
                }
            }
            
            // iterator.next();
        }

        if(maxM.price > maxB.price)
            maxM.showDetail();
        else
            maxB.showDetail();
    }

    void showPlayedMovies(int id) {
        // Iterator<Material> iterator = materials.iterator();
        Movie mov;

        for (Material m: materials) {
            if(m instanceof Movie) {
                mov= (Movie)m;
                for(Person p: mov.actors) {
                    if(p.id == id)
                        m.showDetail();
                }
            }
            // iterator.next();
        }
    }
}


public class Question {
    // ! MAIN SECTION
    public static void main(String[] args) {

        // ? Q1 - Create multiple Person objects. You will use them when defining objects such as Movie, Book.
        // ? -------------------------------------------------------------------------------------------------
        Person p1 = new Person(278674168, "Zulal", "Ergul", 22);
        Person p2 = new Person(354168287, "Adem", "Ergul", 54);
        Person p3 = new Person(768662642, "Munevver", "Ergul", 54);
        Person p4 = new Person(687282972, "Emre", "Ercan", 19);
        Person p5 = new Person(716726465, "Huseyin", "Erdem", 52);
        Person p6 = new Person(462868326, "Zeynep", "Erdem", 46);


        // ? Q2 - Create multiple Category objects. You will use them when defining objects such as Movie, Book.
        // ? ---------------------------------------------------------------------------------------------------
        Category c1 = new Category(11, "1234", "Fear");
        Category c2 = new Category(12, "5678", "Action");
        Category c3 = new Category(13, "2529", "Science");


        // ? Q3 - Create multiple Movie objects and add some scores to them.
        // ? ---------------------------------------------------------------
        ArrayList<Integer> scores1 = new ArrayList<>();
        int[] list1 = {15, 48, 74, 25, 95, 83};
        for(int i : list1) {
            scores1.add(i);
        }
        ArrayList<Person> actors1 = new ArrayList<>();
        actors1.add(p3); actors1.add(p4);

        ArrayList<Integer> scores2 = new ArrayList<>();
        int[] list2 = {43, 63, 13, 84, 23, 72};
        for(int i : list2) {
            scores2.add(i);
        }
        ArrayList<Person> actors2 = new ArrayList<>();
        actors1.add(p4); actors2.add(p5); actors2.add(p6);


        Movie m1 = new Movie(4869, "Avatar", scores1, 2015, 50, c2, "Type1", actors1, p1);
        m1.addScore(5978);
        Movie m2 = new Movie(7623, "Collector", scores1, 2009, 60, c1, "Type2", actors2, p2);
        m2.addScore(3981);


        // ? Q4 - Create multiple Book objects and add some scores to them.
        // ? --------------------------------------------------------------
        ArrayList<Integer> scores3 = new ArrayList<>();
        int[] list3 = {26, 84, 76, 82, 66, 11};
        for(int i : list3) {
            scores3.add(i);
        }

        ArrayList<Integer> scores4 = new ArrayList<>();
        int[] list4 = {36, 43, 18, 62, 93, 20};
        for(int i : list4) {
            scores4.add(i);
        }


        Book b1 = new Book(80, "Universe in Your Hand", scores3, 2015, 40, c3, "Novel", p4, 600);
        b1.addScore(6486);
        Book b2 = new Book(80, "The Story of an Hour", scores4, 1894, 30, c2, "Story", p6, 450);
        b2.addScore(4503);


        // ? Q5 - Create a User object.
        // ? --------------------------
        User u = new User(24864, "Abdullah", "Ergul", "testUser", "123456");


        // ? Q6 - Create a Netflix object.
        // ? -----------------------------
        ArrayList<Material> materials = new ArrayList<>();
        Netflix n = new Netflix(materials);


        // ? Q7 - Login for netflix object.
        // ? ------------------------------
        n.login(u);


        // ? Q8 - Add the objects you created in steps 3 and 4 to the Netflix object.
        // ? ------------------------------------------------------------------------
        n.addBook(b1); n.addBook(b2);
        n.addMovie(m1); n.addMovie(m2);


        // ? Q9 - Finally, runnig the N1-N2-N3-N4 functions mentioned in the Netflix section, then ensure that their outputs are displayed separately.
        // ? -----------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nMax Score Material: "); n.maxScoreMaterial();

        System.out.println("\nMin Score Movie: "); n.minScoreMovie();
        
        System.out.println("\nMax Price: "); n.maxPrice(12);
        
        System.out.println("\nShow Played Movies for Who has 78 id: "); n.showPlayedMovies(78);
    }
    // ! MAIN SECTION
}
