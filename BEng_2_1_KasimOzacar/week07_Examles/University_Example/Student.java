package BEng_2_1_KasimOzacar.week07_Examles.University_Example;


public class Student {
    public final static  String deptName="CE";

    private int registrationNumber;
    
    private String fNname;
    private String lName;
    float midTerm;
    float finExam;
    static  int numberOfStudents;


    Student(int rN, String fn, String ln){
        this(rN,fn,ln,0,0);
    }

    Student(int rN, String fn, String ln, float mid, float fin){
        setRegistrationNumber(rN);
        setfNname(fn);
        setlName(ln);
        setMidTerm(mid);
        setFinExam(fin);
        numberOfStudents++;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setfNname(String fNname) {
        this.fNname = fNname;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setMidTerm(float midTerm) {
        this.midTerm = midTerm;
    }

    public void setFinExam(float finExam) {
        this.finExam = finExam;
    }

    float computeAverage(){
        return midTerm*0.4f + finExam *0.6f;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getFullName() {
        return fNname +" "+lName;
    }
}
