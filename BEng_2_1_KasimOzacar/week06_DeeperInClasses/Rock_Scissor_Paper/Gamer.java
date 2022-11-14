package BEng_2_1_KasimOzacar.week06_DeeperInClasses.Rock_Scissor_Paper;

import java.util.Random;
import java.util.Scanner;


enum HandSign{
    ROCK,
    SCISSOR,
    PAPER
}

public class Gamer {
    Scanner userInput= new Scanner(System.in);
    static int playerCount;
    String name;
    int numberOfWins;
    static int numberOfTrials;
    static  int numberOfDraws;
    HandSign handSign;
    String decision;

    Gamer(String name) {
        this.name = name;
        playerCount++;
    }

    public void setName(){
        System.out.print("Please Enter a Name for Player "+playerCount+": ");
        this.name= userInput.next();
    }

    void move(){
        if(Game.isGameOver) return;
        boolean isInputInvalid= false;
        System.out.print("Press;\n'q' for quit, 'r' for rock, 's' for scissor, 'p' for paper\nYour chooice: ");

        do{
            isInputInvalid= false;
            decision = userInput.next();

            switch (decision){

                case "q":
                    Game.isGameOver=true;
                    break;
                case "r":
                    this.handSign =HandSign.ROCK;
                    break;
                case "s":
                    this.handSign =HandSign.SCISSOR;
                    break;
                case "p":
                    this.handSign =HandSign.PAPER;
                    break;
                default:
                    System.out.println("Undefined argument. Please use 'q','r','s','p'");
                    isInputInvalid=true;
                    break;
            }

        }while(isInputInvalid);
    }

    void autoMove(){
        Random random= new Random();
        int decision= random.nextInt(2);  // 0 or 1 or 2

        switch(decision){
            case 0:
                this.handSign= HandSign.PAPER;
                break;
            case 1:
                this.handSign= HandSign.ROCK;
                break;
            case 2:
                this.handSign= HandSign.SCISSOR;
                break;
        }
        System.out.println("PC's choice is "+this.handSign);
    }
}
