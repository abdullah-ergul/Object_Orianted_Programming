package BEng_2_1_KasimOzacar.week02_Classes_and_Objects;

import java.util.Scanner;


public class Employee {
    Scanner input= new Scanner(System.in);
    String name;
    int socialSecurityNumber, workingHours;
    float wage;

    public Employee(){
        System.out.print("Enter Worker's Name: "); name= input.next();
        System.out.print("Enter Worker's Social Security Number: "); socialSecurityNumber= input.nextInt();
        System.out.print("Enter Worker's Working Hours: "); workingHours= input.nextInt();
        System.out.print("Enter Worker's Wage: "); wage= input.nextFloat();
    }

    public void displayInfo(){
        System.out.println("Name= " + name + "\nSocial Security Number= " + socialSecurityNumber);
    }

    public void displaySalary(){
        System.out.println("Salary= " + wage*workingHours);
    }

    // ! MAIN SECTION
    public static void main(String[] args){
        Employee example= new Employee();
        example.displayInfo();
        example.displaySalary();
    }
    // ! MAIN SECTION

}
