package BEng_2_1_NehadTARamaha.week05_NestedClasses_EnumTypes_DeeperInClasses;


enum Days{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}

enum Branch{
    Math(001,"Ali","Main computer science and engineering lesson."),
    Physics(002,"Nehad","Main engineering lesson."),
    Geomtery(003,"Canan","Graphical lesson.")
    ;
    private final int fieldId;
    private final String teacherName;
    private final String description;
    private Branch(int fieldId, String teacherName, String description){
        this.fieldId= fieldId;
        this.teacherName= teacherName;
        this.description= description;
    }

    public int getFieldId(){
        return fieldId;
    }
    public String getTeacherName(){
        return teacherName;
    }
    public String getDescription(){
        return description;
    }
}

public class Enums {
    // ! MAIN SECTION
    public static void main(String[] args){
        // * Variable
        Branch lesson= Branch.Math;
        System.out.println("\n1st example:\n"+lesson.getFieldId() + " - " + lesson.getTeacherName() + " - " + lesson.getDescription());

        // * Array
        Branch[] arrBranchs= Branch.values();
        System.out.println("\n2nd example:\n" + arrBranchs[0] + "\n" + arrBranchs[1] + "\n" + arrBranchs[2]);

        System.out.println("\n3rd example:\n" + arrBranchs[2].getFieldId() + " - " + arrBranchs[2].getTeacherName() + " - " + arrBranchs[2].getDescription());

        System.out.println("\n4th example:");
        for(Branch l:arrBranchs)
            System.out.println(l+" - Data: "+l.getFieldId()+" - "+l.getTeacherName()+" - "+l.getDescription());
    }
    // ! MAIN SECTION
}
