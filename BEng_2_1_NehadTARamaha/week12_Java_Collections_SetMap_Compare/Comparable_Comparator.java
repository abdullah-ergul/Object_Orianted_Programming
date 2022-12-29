package BEng_2_1_NehadTARamaha.week12_Java_Collections_SetMap_Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Comparable_Comparator {
    // ! MAIN SECTION
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(10205305, "Abdullah", 20));
        students.add(new Student(10206062, "Rookie", 19));
        students.add(new Student(866, "Innocent", 17));


        // COMPARABLE class objects compare by ID number
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);


        // Objects compare by COMPARATOR
        System.out.println(students);
        Collections.sort(students, new AgeComparator());
        System.out.println(students);
    }
    // ! MAIN SECTION
}


// * Comparable Class

class Student implements Comparable<Student> {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
        // return this.age - o.age;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.age;
    }
}

// * Comparator
// Don't need to implements a Comparable Class

class IDComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.id - o2.id;
    }
}

class NameComparator implements Comparator<Student> {
    
    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}

class AgeComparator implements Comparator<Student> {
    
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}
