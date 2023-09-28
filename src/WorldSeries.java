import java.util.Random;

public class WorldSeries {

public static final int GAMES_TO_WIN = 4;
public static int gameNum = 0;

public static final int MILIDelay = 1200;
    public static void main(String[] args) {
        BaseBallTeam b1 = new BaseBallTeam("Pirates");
        BaseBallTeam b2 = new BaseBallTeam("Astros");
        System.out.println("Arpan Uprety \n");
SimulateSeries(b1,b2);

    }


    public static void SimulateGame(BaseBallTeam b1, BaseBallTeam b2, int num){
        //gameNum +=1 ;
        String result = "";
        Random rand = new Random();
        int oneWin = rand.nextInt(10);
        int TwoWin = rand.nextInt(10);
        if (oneWin > TwoWin){
            b1.winGame();
            result = "The " + b1 + " Won!!" ;

        }
        else {
            b2.winGame();
            result = "The " + b2 + " Won!!" ;
        }


        System.out.println("Game: " + num);
        Pause();
        System.out.println("Game " + num + " Result: " + result );

        System.out.println("Series Score:" + b1.getName() + " " + b1.getGamesWon() + " - " + b2.getName() + " " + b2.getGamesWon() + "\n")  ;
        Pause();
    }
    public static void SimulateSeries(BaseBallTeam b1, BaseBallTeam b2){
        System.out.println("World Series Simulation");
        System.out.println(b1.getName() + " vs. " + b2.getName() + "\n");
        int n = 1;
            while (b1.getGamesWon() < 4 && b2.getGamesWon() < 4){
                SimulateGame(b1,b2, n);
                n+= 1;
            }

            if (b1.getGamesWon() == 4){
                System.out.println("the " + b1.getName() + " are the World Series Champions!!!");
            } else {
                System.out.println("the " + b2.getName() + " are the World Series Champions!!!");
            }
    }








    public static void Pause(){
        try {
            Thread.sleep(MILIDelay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
