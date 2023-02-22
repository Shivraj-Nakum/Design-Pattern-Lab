
//this class lists all the e-sports available

public class Esports {

    //shows popularity of game
    private int popularity;

    //shows name of game
    private String gameName;


    //CREATING getter and setter for popularity and game-name

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    //creating to string method to pass object into string type
    @Override
    public String toString() {
        return "Esports{" + "gameName='" + gameName + '\'' + ", popularity=" + popularity + '}';
    }
}
