package BEng_2_1_NehadTARamaha.week02_Classes_and_Objects;


public class StudentCalculator {
    private float mid, fin;

    public StudentCalculator(float inMid, float inFin){
        this.mid= inMid;
        this.fin= inFin;
    }

    public void calculate(){
        if ((mid * 0.4f + fin * 0.6f) >= 50){
            System.out.println("\nYour Score: " + (mid * 0.4f + fin * 0.6f) + "\nYou Pass");
        }
        else{
            System.out.println("\nYour Score: " + (mid * 0.4f + fin * 0.6f) + "\nYou Fail");
        }
    }

    // ! MAIN SECTION
    public static void main(String[] args){
        StudentCalculator example= new StudentCalculator(40, 60);
        example.calculate();
    }
    // ! MAIN SECTION

}
