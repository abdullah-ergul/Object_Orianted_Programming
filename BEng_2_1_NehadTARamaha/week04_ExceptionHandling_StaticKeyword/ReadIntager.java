package BEng_2_1_NehadTARamaha.week04_ExceptionHandling_StaticKeyword;

import java.util.InputMismatchException;
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
        catch(InputMismatchException e){
            System.out.println("Your input value isn't an intager number!");
        }
        catch(Exception e){
            System.out.println("Error! " + e.getMessage());
        }
    }

    public int getNumber(){
        return number;
    }

    // ! MAIN SECTION
    public static void main(String[] args){
        ReadIntager example= new ReadIntager();
        System.out.println(example.getNumber());
    }
    // ! MAIN SECTION

}
