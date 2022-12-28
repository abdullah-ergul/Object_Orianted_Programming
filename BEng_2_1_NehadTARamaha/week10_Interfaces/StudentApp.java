package BEng_2_1_NehadTARamaha.week10_Interfaces;


public class StudentApp {
    // ! MAIN SECTION
    public static void main(String[] args) {
        BachelourStudent bStudent = new BachelourStudent(10205305, 80, 60);
        MasterStudent mStudent = new MasterStudent(10205304, 85, 75, 15);
        PhDStudent pStudent = new PhDStudent(10205303, 80, 85, 20, 3);

        Student[] students = {bStudent, mStudent, pStudent};

        for(Student s: students) {
            System.out.println(s);
        }
    }
    // ! MAIN SECTION
}

interface ArticleScoreBehaviour {
    float articleScore();
}

interface ConferanceScoreBehaviour {
    float conferanceScore();
}

interface ProjectScoreBehaviour {
    float projectScore();
}

abstract class Student {

    private int id;
    private float mid;
    private float fin;

    Student(int id, float mid, float fin) {
        this.id = id;
        this.mid = mid;
        this.fin = fin;
    }

    protected float computeTotalScore() {
        return mid + fin;
    }

    protected float computeBaseScore() {
        return mid*0.4f + fin*0.6f;
    }

    public int getId() {
        return id;
    }
}

class BachelourStudent extends Student implements ProjectScoreBehaviour {
    
    BachelourStudent(int id, float mid, float fin) {
        super(id, mid, fin);
    }

    @Override
    protected float computeTotalScore() {
        return super.computeTotalScore();
    }

    public float projectScore()  {
        return computeTotalScore();
    }
}

class MasterStudent extends Student implements ConferanceScoreBehaviour {
    protected int numberOfConf;

    MasterStudent(int id, float mid, float fin, int numberOfConf) {
        super(id, mid, fin);
        this.numberOfConf = numberOfConf;
    }

    protected float computeTotalScore() {
        return super.computeTotalScore();
    }

    public float conferanceScore() {
        return numberOfConf * computeTotalScore();
    }
}

class PhDStudent extends MasterStudent implements ArticleScoreBehaviour {
    int numberOfArticles;

    PhDStudent(int id, float mid, float fin, int conf, int numberOfArticles) {
        super(id, mid, fin, numberOfArticles);
        this.numberOfArticles = numberOfArticles;
    }

    @Override
    public float computeTotalScore() {
        return super.computeTotalScore();
    }

    public float articleScore() {
        return numberOfArticles * computeTotalScore();
    }
}
