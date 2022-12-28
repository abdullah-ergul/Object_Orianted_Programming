package BEng_2_1_KasimOzacar.week07_Examles.University_Example;


public class Teacher {
    String fullName;
    Branch branch;
    Student[] students;

    Teacher(String fn, Branch b){
        this.fullName = fn;
        this.branch =b;
    }

    void setStudents(Student[] students){
        this.students = students;
    }

    public String getBranchDescription() {
        return branch.getDescription();
    }

    void printStudentsScores(){
        for (Student s: students){
            System.out.println("name: "+ s.getFullName()+" score: "+s.computeAverage());
        }
    }

    int getNumberOFStudents(){
        return Student.numberOfStudents;
    }
}
