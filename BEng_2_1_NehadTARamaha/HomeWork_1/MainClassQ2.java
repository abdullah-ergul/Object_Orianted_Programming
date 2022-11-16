package BEng_2_1_NehadTARamaha.HomeWork_1;

class EncapsulatedStudent{
    private int midterm;
    private int finalExam;

    public void setMidterm(int midterm){
        if(midterm<0 || midterm>100)
            throw  new IllegalArgumentException("Midterm result valule must be between [0,100]");
        this.midterm = midterm;
    }

    public void setFinalExam(int finalExam){
        if(finalExam<0 || finalExam>100)
            throw  new IllegalArgumentException("Final Exam result valule must be between [0,100]");
        this.finalExam = finalExam;
    }
    
    // public int getMidterm(){
    //     return midterm;
    // }
    // public int getFinalExam(){
    //     return finalExam;
    // }
    public double getAvarage(){
        return midterm*0.4f + finalExam*0.6f;
    }
}

public class MainClassQ2{
    public static void main(String[] args) {
        EncapsulatedStudent student1= new EncapsulatedStudent();
        try{
            student1.setMidterm(-3);
            student1.setFinalExam(108);
            System.out.println(student1.getAvarage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
