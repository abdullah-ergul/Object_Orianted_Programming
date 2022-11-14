package BEng_2_1_KasimOzacar.week06_DeeperInClasses.Rock_Scissor_Paper;


public class Game {
    Gamer gamer1;
    Gamer gamer2;
    static boolean isGameOver;

    Game(Gamer g1, Gamer g2){
        this.gamer1 = g1;
        this.gamer2 = g2;
    }

    void start(){
        while(!isGameOver){
            gamer1.move();
            if(Game.isGameOver)
                return;
            // gamer2.move();  // * Manuel
            gamer2.autoMove();  // * Random
            processMoves();
            displayScores();
        }
    }

    void processMoves(){

        if (gamer1 == null || gamer2 == null || isGameOver==true)
            return;
        else if(gamer1.handSign == gamer2.handSign)
            Gamer.numberOfDraws++;
        else if(gamer1.handSign==HandSign.PAPER && gamer2.handSign==HandSign.ROCK)
            gamer1.numberOfWins++;
        else if(gamer1.handSign==HandSign.SCISSOR && gamer2.handSign==HandSign.PAPER)
            gamer1.numberOfWins++;
        else if(gamer1.handSign==HandSign.ROCK && gamer2.handSign==HandSign.SCISSOR)
            gamer1.numberOfWins++;
        else
            gamer2.numberOfWins++;

        Gamer.numberOfTrials++;
    }

    void displayScores(){
        System.out.println(gamer1.name +" wins: "+ gamer1.numberOfWins+" | number of trials: "+Gamer.numberOfTrials+" | number of draws: "+Gamer.numberOfDraws);
        System.out.println(gamer2.name +" wins: "+ gamer2.numberOfWins+" | number of trials: "+Gamer.numberOfTrials+" | number of draws: "+Gamer.numberOfDraws+"\n");
    }
}
