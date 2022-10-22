package BEng_2_1_KasimOzacar.week03_Access_Modifiers;

import java.util.Objects;
import java.util.Scanner;


public class Account {
    Scanner input= new Scanner(System.in);
    private String password= "1234";
    private double balance;
    private String ownerName;

    public Account(String name, double balance){
        this.ownerName= name;
        this.balance= balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwnerName(String name){
        ownerName= name;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void add(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        int due= 3;
        double withdrawMoney;
        System.out.print("Please enter the 4-digit pass: ");
        String passwordIn= input.next();
        due--;

        while(due > 0){
            if (Objects.equals(passwordIn, password)) {
                System.out.print("Enter the amount you want to withdraw: ");
                withdrawMoney= input.nextDouble();
                balance -= withdrawMoney;
                break;
            }
            else{
                System.out.println("Wrong password. You have " + due + " more due!");
                System.out.print("Please enter the 4-digit pass: ");
                passwordIn= input.next();
            }
            due--;
        }
        if(due == 0)
            System.out.println("Your account has been blocked, please try again!");
    }
}
