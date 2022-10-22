package BEng_2_1_NehadTARamaha.week03_Access_Modifiers;

import java.util.Objects;
import java.util.Scanner;


public class BankAccount {
    Scanner input= new Scanner(System.in);
    private double balance;
    private String name;
    private String password= "1234";

    public BankAccount(double inBalance, String inName){
        this.name= inName;
        this.balance= inBalance;
    }

    public void deposit(double depositAmount){
        balance += depositAmount;
    }

    public double getBalance(){
        return balance;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public void withdraw(){
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
            System.out.println("Your account has been blocked, please try again later!");
    }
}
