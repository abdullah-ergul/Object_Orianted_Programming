package BEng_2_1_KasimOzacar.Assigment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

class Person {
    int id;
    String firstName;
    String lastName;
    int age;
}

class User extends Person {
    String userName;
    String password;

    User(int id, String firstName, String lastName, String username, String password) {
        super.id = id;
        super.firstName = firstName;
        super.lastName = lastName;
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
}

abstract class Material {
    int id;
    String name;
    Collection<Integer> scores = new ArrayList<>();
    int release_year;
    Category category;
    int price;
    String type;

    Material(int id, String name, Collection scores, int release_year, int price, Category category, String type) {
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

    Book(int id, String name, Collection scores, int release_year, int price, Category category, String type, Person writer, int numberOfPages) {
        super(id, name, scores, release_year, price, category, type);
        this.writer = writer;
        this.numberOfPages = numberOfPages;
    }

    public void setWriter(Person writer) {
        this.writer = writer;
    }

    public void addScore(int score) {
        this.scores.add(score);
    }

    public double getAvgScore() {
        int count = 0;
        double avarage = 0;
        Iterator<Integer> iterator = scores.iterator();

        for (int num: scores) {
            avarage += num;
            count ++;
            iterator.next();
        }

        return avarage/count;
    }
}

class Movie extends Material {
    public Collection<Person> actors = new ArrayList<>();
    Person director;

    Movie(int id, String name, Collection scores, int release_year, int price, Category category, String type, Collection actors, Person director) {
        super(id, name, scores, release_year, price, category, type);
        this. actors = actors;
        this.director = director;
    }

    public void addActor(Person actor) {
        this.actors.add(actor);
    }

    @Override
    public void showDetail() {
        System.out.println(id + " " + name + " " + scores + " " + release_year + " " + price + " " + category + " " + type + " " + director);
    }

    public void addScore(int score) {
        this.scores.add(score);
    }

    public double getAvgScore() {
        int count = 0;
        double avarage = 0;
        Iterator<Integer> iterator = scores.iterator();

        for (int num: scores) {
            avarage += num;
            count ++;
            iterator.next();
        }

        return avarage/count;
    }
}

class Netflix {
    Collection<Material> materials = new ArrayList<>();
    User credantial;
    boolean isLogin = false;

    Netflix(Collection materials) {
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

            if(Objects.equals(uName, uNameIn) && Objects.equals(psw, pswIn))
                isLogin = true;
            
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
        Iterator<Material> iterator = materials.iterator();
        double score, maxScore = 0;
        Movie max = new Movie(0, null, materials, 0, 0, null, null, materials, credantial);

        for (Material m: materials) {
            score = m.getAvgScore();
            if(score > maxScore)
                maxScore= score;
            
            iterator.next();
        }

        max.showDetail();
    }

    void minScoreMovie() {
        Iterator<Material> iterator = materials.iterator();
        double score, minScore = 0;
        Movie min = new Movie(0, null, materials, 0, 0, null, null, materials, credantial);

        for (Material m: materials) {
            if(m instanceof Movie) {
                score = m.getAvgScore();
                if(score < minScore){
                    minScore= score;
                    min = (Movie)m;
                }
            }
            iterator.next();
        }

        min.showDetail();
    }

    void maxPrice(int categortId) {
        Iterator<Material> iterator = materials.iterator();
        int cId, maxPrice= 0;
        Movie max = new Movie(0, null, materials, 0, 0, null, null, materials, credantial);

        for (Material m: materials) {
            cId = m.category.id;
            if(cId == categortId) {
                if(m.price > maxPrice)
                    maxPrice = m.price;
            }
            
            iterator.next();
        }

        max.showDetail();
    }

    void showPlayedMovies(int id) {
        Iterator<Material> iterator = materials.iterator();
        Movie mov;

        for (Material m: materials) {
            if(m instanceof Movie) {
                mov= (Movie)m;
                for(Person p: mov.actors) {
                    if(p.id == id)
                        m.showDetail();
                }
            }
            iterator.next();
        }
    }
}


public class Question {
    // ! MAIN SECTION
    public static void main(String[] args) {

        // --------------- 1

        Person p1 = new Person();
        Person p2 = new Person();

        // --------------- 2

        Category c1 = new Category(11, "1234", "Fear");
        Category c2 = new Category(12, "5678", "Action");

        // --------------- 3

        Collection<Integer> scores = new ArrayList<>();
        scores.add(15); scores.add(48); scores.add(74); scores.add(25);

        Collection<Person> actors = new ArrayList<>();
        actors.add(p1); actors.add(p2);

        Movie m1 = new Movie(14, "Avatar", scores, 2015, 50, c2, "Type1", actors, p1);
        m1.addScore(5000);

        Movie m2 = new Movie(16, "Collector", scores, 2009, 60, c1, "Type2", actors, p2);
        m2.addScore(3500);

        // --------------- 4

        Book b1 = new Book(80, "Universe in Your Hand", scores, 2015, 40, c2, "Science", p1, 600);
        b1.addScore(6000);

        Book b2 = new Book(80, "Calikusu", scores, 1980, 30, c2, "Type3", p2, 450);
        b2.addScore(4000);

        // --------------- 5

        User u = new User(28, "Abdullah", "Ergul", "testUser", "123456");

        // --------------- 6

        Netflix n = new Netflix(null);

        // --------------- 7

        n.login(u);

        // --------------- 8

        Collection<Material> materials = new ArrayList<>();
        materials.add(m1);
        materials.add(m2);
        materials.add(b1);
        materials.add(b2);

        n.materials = materials;

        // --------------- 9

        n.maxScoreMaterial();
        n.minScoreMovie();
        n.maxPrice(12);
        n.showPlayedMovies(14);
    }
    // ! MAIN SECTION
}
