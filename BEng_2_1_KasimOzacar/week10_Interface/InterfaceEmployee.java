package BEng_2_1_KasimOzacar.week10_Interface;


interface Salary {
    double calculateSalary();
}

abstract class Employee implements Salary{
    String name;
    double wage;

    public Employee(String name, double wage) {
        this.name= name;
        this.wage= wage;
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, double wage) {
        super(name, wage);
    }

    @Override
    public double calculateSalary() {
        return wage;
    }
}

class PartTimeEmployee extends Employee {
    int hours;

    public PartTimeEmployee(String name, double wage) {
        super(name, wage);
    }

    @Override
    public double calculateSalary() {
        return wage*hours;
    }
}

public class InterfaceEmployee {
    // ! MAIN SECTION
    public static void main(String[] args) {
        
    }
    // ! MAIN SECTION
}
