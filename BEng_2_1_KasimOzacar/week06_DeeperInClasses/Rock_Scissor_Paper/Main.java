package BEng_2_1_KasimOzacar.week06_DeeperInClasses.Rock_Scissor_Paper;

public class Main {
    public static void main(String[] args) {
        Gamer gamer1= new Gamer("ilyas");
        Gamer gamer2= new Gamer("hamid");
        
        Game game = new Game(gamer1,gamer2);
        game.start();
    }
}
