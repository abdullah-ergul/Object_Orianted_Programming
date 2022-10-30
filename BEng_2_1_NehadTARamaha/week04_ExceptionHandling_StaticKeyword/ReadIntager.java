package BEng_2_1_NehadTARamaha.week04_ExceptionHandling_StaticKeyword;

import java.util.Scanner;


public class ReadIntager {
    Scanner input= new Scanner(System.in);
    private int number;

    public ReadIntager(){
        setNumber();
    }

    public void setNumber(){
        try{
            System.out.print("Enter an intager value: ");
            int num= input.nextInt();
            number= num;
        }
        catch(Exception ex){
            System.out.println("Your input value isn't an intager number!\n(" + ex + ")");
        }
    }

    public int getNumber(){
        return number;
    }
}
