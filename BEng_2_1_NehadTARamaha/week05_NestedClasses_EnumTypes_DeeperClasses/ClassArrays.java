package BEng_2_1_NehadTARamaha.week05_NestedClasses_EnumTypes_DeeperClasses;


class Employee{
    public int id;
}

class Company{
    private String companyName;
    public Employee[] emp;

    public Company(Employee[] emp, String cName){
        this.companyName= cName;
        this.emp= emp;
    }

    public String getCompanyName(){
        return this.companyName;
    }
}

public class ClassArrays {
    // ! MAIN SECTION
    public static void main(String[] args){
        Employee emp1= new Employee();
        Employee emp2= new Employee();
        Employee emp3= new Employee();
        Employee emp4= new Employee();

        Employee[] emp= {emp1,emp2,emp3,emp4};
        Company cmp= new Company(emp, "Microsoft");
        System.out.println(cmp.emp[3]);
        System.out.println(cmp.getCompanyName());
    }
    // ! MAIN SECTION
}
