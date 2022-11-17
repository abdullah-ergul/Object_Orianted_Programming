package BEng_2_1_KasimOzacar.week07_Examles.Rock_Scissor_Paper;

public class Main {
    public static void main(String[] args) {
        Gamer gamer1= new Gamer("p1");
        gamer1.setName();
        Gamer gamer2= new Gamer("PC");
        // gamer2.setName();
        
        Game game = new Game(gamer1,gamer2);
        game.start();
    }
}
