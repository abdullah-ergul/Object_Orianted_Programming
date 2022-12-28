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
