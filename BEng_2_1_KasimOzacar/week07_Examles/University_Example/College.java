package BEng_2_1_KasimOzacar.week07_Examles.University_Example;


public class College {
    String name;
    Teacher[] teachers;

    public College(String name, Teacher[] teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    void printAllTeachersName(){
        for(Teacher t : teachers){
            System.out.println(t.fullName);
        }
    }
}
