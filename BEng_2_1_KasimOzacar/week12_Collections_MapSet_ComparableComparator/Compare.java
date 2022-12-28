package BEng_2_1_KasimOzacar.week12_Collections_MapSet_ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Compare {
    // ! MAIN SECTION
    public static void main(String[] args) {
        Engineer en1 = new Engineer(12, "Mert", Major.TEST);
        Engineer en2 = new Engineer(12, "Mert", Major.TEST);

        System.out.println(en1 == en2);  // Compare by RAM adress
        System.out.println(en1.equals(en2));  // Compare by all of parameters


        Engineer en3 = new Engineer(26, "Ali", Major.PRODUCT);
        Engineer en4 = new Engineer(78, "Omer", Major.DEVELOPER);
        Engineer en5 = new Engineer(34, "Fatma", Major.TEST);
        Engineer en6 = new Engineer(51, "Ayse", Major.PRODUCT);

        ArrayList<Engineer> engineers = new ArrayList<>();
        engineers.add(en3); engineers.add(en4); engineers.add(en5); engineers.add(en6);


        Comparator<Engineer> comparator = null;
        SSNComparator ssnComparator = new SSNComparator();
        MajorComparator majorComparator = new MajorComparator();

        Scanner input = new Scanner(System.in);
        System.out.println("1 to compare by ssn, 2 to compare by major");
        int userChoice = input.nextInt();

        if (userChoice == 1){
            comparator = ssnComparator;
        }
        else if (userChoice == 2)
            comparator = majorComparator;

        Collections.sort(engineers, comparator);
        System.out.println(engineers);
        input.close();
    }
    // ! MAIN SECTION
}


enum Major {
    PRODUCT,
    TEST,
    DEVELOPER
}

class Engineer implements Comparable<Engineer> {
    int ssn;
    String name;
    Major major;

    Engineer(int ssn, String name, Major major) {
        this.ssn = ssn;
        this.name = name;
        this.major = major;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        else if(o == null || this.getClass() != o.getClass())
            return false;
        else {
            Engineer oEngineer = (Engineer)o;
            return this.ssn == oEngineer.ssn && this.name == oEngineer.name && this.major == oEngineer.major;
        }
    }

    public int compareTo(Engineer other) {
        return  this.name.compareTo(other.name);
        // return this.ssn - other.ssn;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Major: %s", this.ssn, this.name, this.major);
    }
}

class SSNComparator implements Comparator<Engineer>{
    @Override
    public int compare(Engineer e1, Engineer e2) {
       return e1.ssn - e2.ssn;
    }
}

class MajorComparator implements Comparator<Engineer>{
    @Override
    public int compare(Engineer e1, Engineer e2) {
        return e1.major.compareTo(e2.major);
    }
}
