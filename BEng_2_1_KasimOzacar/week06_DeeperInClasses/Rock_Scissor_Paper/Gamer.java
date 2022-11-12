package BEng_2_1_KasimOzacar.week06_DeeperInClasses.Rock_Scissor_Paper;

import java.util.Scanner;


enum HandSign{
    ROCK,
    SCISSOR,
    PAPER
}

public class Gamer {
    String name;
    int numberOfWins;
    static int numberOfTrials;
    static  int numberOfDraws;
    HandSign handSign;

    Gamer(String name) {
        this.name = name;
    }

    void move(){
        if(Game.isGameOver) return;
        boolean isInputInvalid =false;
        Scanner userInput= new Scanner(System.in);
        System.out.println("please press q for quit, " +
                "r for rock, s for scissor, p for paper");

        do{
            String decision = userInput.next();

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
                    isInputInvalid=true;
                    break;
            }

        }while(isInputInvalid);
        
        userInput.close();
    }

}
