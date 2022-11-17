package BEng_2_1_NehadTARamaha.Homework_1;

class Student{
    public int midterm;
    public int finalExam;
}

class EncapsulatedStudent{
    // private int midterm;
    // private int finalExam;
    private Student s= new Student();

    public EncapsulatedStudent(int midterm, int finalExam){
        setMidterm(midterm);
        setFinalExam(finalExam);
    }

    public void setMidterm(int midterm){
        if(midterm<0 || midterm>100)
            throw  new IllegalArgumentException("Midterm result valule must be between [0,100]");
        this.s.midterm = midterm;
    }

    public void setFinalExam(int finalExam){
        if(finalExam<0 || finalExam>100)
            throw  new IllegalArgumentException("Final Exam result valule must be between [0,100]");
        this.s.finalExam = finalExam;
    }
    
    // public int getMidterm(){
    //     return midterm;
    // }
    // public int getFinalExam(){
    //     return finalExam;
    // }
    public double getAvarage(){
        return s.midterm*0.4f + s.finalExam*0.6f;
    }
}

public class MainClassQ2{
    public static void main(String[] args) {
        try{
            EncapsulatedStudent student1= new EncapsulatedStudent(-3,105);
            System.out.println(student1.getAvarage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
