public class BaseBallTeam {

    private String name ;
    private int gamesWon;
    private int gamesLost;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public BaseBallTeam(String name){
       setName(name);
        setGamesLost(0);
        setGamesWon(0);
    }

    public int winGame(){
        return this.gamesWon += 1;
    }

    public int loseGame(){
        return  this.gamesLost += 1;
    }

    @Override
    public   String toString(){
        return this.name;
    }
}
