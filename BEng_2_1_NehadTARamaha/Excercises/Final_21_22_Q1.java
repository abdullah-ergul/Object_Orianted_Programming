package BEng_2_1_NehadTARamaha.Excercises;


interface ArticleScoreBehaviour {
    float articleScore();
}

interface ConferenceScoreBehaviour {
    float conferenceScore();
}

interface ProjectScoreBehaviour {
    float projectScore();
}

abstract class Student {
    private int id;
    private float mid;
    private float fin;

    public Student(int id, float mid, float fin) {
        this.id = id;
        this.mid = mid;
        this.fin = fin;
    }

    abstract float computeTotalScore();

    float computeBaseScore() {
        return mid*0.4f + fin*0.6f;
    }

    @Override
    public String toString() {
        return this.id + " : " + this.mid + " " + this.fin;
    }
}

class BachelourStudent extends Student implements ProjectScoreBehaviour{

    public BachelourStudent(int id, float mid, float fin) {
        super(id, mid, fin);
    }

    @Override
    public float projectScore() {
        return 20.0f;
    }

    @Override
    float computeTotalScore() {
        return computeBaseScore() + projectScore();
    }
}

class MasterStudent extends Student implements ConferenceScoreBehaviour {
    protected int numberOfConf;

    public MasterStudent(int id, float mid, float fin, int numberOfConf) {
        super(id, mid, fin);
        this.numberOfConf = numberOfConf;
    }

    @Override
    public float conferenceScore() {
        return numberOfConf * 5;
    }

    @Override
    float computeTotalScore() {
        return computeBaseScore() + conferenceScore();
    }
}

class PhDStudent extends MasterStudent implements ArticleScoreBehaviour {
    int numberOfArticles;

    PhDStudent(int id, float mid, float fin, int conf, int numberOfArticles) {
        super(id, mid, fin, conf);
        this.numberOfArticles = numberOfArticles;
    }

    @Override
    public float articleScore() {
        return numberOfArticles * 8;
    }

    @Override
    public float computeTotalScore() {
        return super.computeTotalScore() + articleScore();
    }
}

public class Final_21_22_Q1 {
    public static void main(String[] args) {
        
    }
}
