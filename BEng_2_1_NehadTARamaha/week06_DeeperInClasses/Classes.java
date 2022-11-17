package BEng_2_1_NehadTARamaha.week06_DeeperInClasses;


enum MyBranch{
    Math,
    Physics,
    Cs,
    Eng
}

class Teacher{
    public int id;
    public MyBranch branch;

    public Teacher(int id, MyBranch branch){
        this.id= id;
        this.branch= branch;
    }

    public int getId(){
        return this.id;
    }

    public MyBranch getBranch(){
        return this.branch;
    }
}

public class Classes {
    // ! MAIN SECTION
    public static void main(String[] args){
        Teacher t1= new Teacher(11, MyBranch.Math);
        Teacher t2= new Teacher(12, MyBranch.Physics);
        Teacher t3= new Teacher(13, MyBranch.Cs);
        Teacher t4= new Teacher(14, MyBranch.Eng);

        Teacher[] arr= {t1,t2,t3,t4};

        for(Teacher t:arr)
            System.out.println("Data: "+t.id+" - "+t.branch);
    }
    // ! MAIN SECTION
}
