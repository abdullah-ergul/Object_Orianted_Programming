package BEng_2_1_KasimOzacar.week09_Polymorphism;


abstract class Employee {
    String firstName;
    String lastName;
    int SSN;
    abstract double earning(); 

    public Employee(String firstName, String lastName, int SSN) {
        this.firstName= firstName;
        this.lastName= lastName;
        this.SSN= SSN;
    }

    @Override
    public String toString() {
        return String.format("First: %s  Last: %s  SSN: %d", firstName, lastName, SSN);
    }
}

class SalariedEmployee extends Employee {
    double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, int SSN, double weeklySalary) {
        super(firstName, lastName, SSN);
        this.weeklySalary= weeklySalary;
    }

    @Override
    double earning() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("First: %s  Last: %s  SSN: %d  Weekly Salary: %lf", firstName, lastName, SSN, weeklySalary);
    }
}

class HourlyEmployee extends Employee {
    double wage;
    int hours;

    public HourlyEmployee(String firstName, String lastName, int SSN, double wage, int hours) {
        super(firstName, lastName, SSN);
        this.wage= wage;
        this.hours= hours;
    }

    @Override
    double earning() {
        if(hours <= 40)
            return wage*hours;
        else
            return 40*wage + (hours-40) * wage * 1.5f;
    }

    @Override
    public String toString() {
        return String.format("First: %s  Last: %s  SSN: %d  Wage: %lf", firstName, lastName, SSN, wage);
    }
}

class CommisionEmployee extends Employee {
    int grossSale;
    float comissionRate;

    public CommisionEmployee(String firstName, String lastName, int SSN, int grossSale, float comissionRate) {
        super(firstName, lastName, SSN);
        this.grossSale= grossSale;
        this.comissionRate= comissionRate;
    }

    public float bonus() {
        return 1000;
    }

    @Override
    double earning() {
        return grossSale*comissionRate;
    }

    @Override
    public String toString() {
        return String.format("First: %s  Last: %s  SSN: %d  Commision Rate: %f", firstName, lastName, SSN, comissionRate);
    }
}

class BasePlusCommisionEmployee extends CommisionEmployee {
    double baseSalary;

    public BasePlusCommisionEmployee(String firstName, String lastName, int SSN, int grossSale, float comissionRate, double baseSalary) {
        super(firstName, lastName, SSN, grossSale, comissionRate);
        this.baseSalary= baseSalary;
    }

    @Override
    double earning() {
        return super.earning() + baseSalary;
    }

    @Override
    public String toString() {
        return String.format("First: %s  Last: %s  SSN: %d  Base Salary: %lf", firstName, lastName, SSN, baseSalary);
    }
}

public class EmployeeExample {
    // ! MAIN SECTION
    public static void main(String[] args) {
        SalariedEmployee se= new SalariedEmployee("Adem", "Ergul", 1968, 1200);
        HourlyEmployee he= new HourlyEmployee("Munevver", "Ergul", 1969, 15, 30);
        CommisionEmployee ce= new CommisionEmployee("Zulal", "Ergul", 2000, 120, 50);
        BasePlusCommisionEmployee bpce= new BasePlusCommisionEmployee("Abdullah", "Ergul", 2002, 30, 28.76f, 57.52);

        Employee[] employees= new Employee[]{se,he,ce,bpce};


        for(Employee e: employees) {
            System.out.println(e.earning());  // Print all employees earnings.

            if(e instanceof CommisionEmployee)
                System.out.println("Bonus: "+((CommisionEmployee)e).bonus());  // If e is a Comission Employee (also it can be BasePlusComissinEmployee) run bonus function with DOWNCASTING.
        }
    }
    // ! MAIN SECTION
}
