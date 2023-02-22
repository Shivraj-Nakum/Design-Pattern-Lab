
//this class contain the list of e-sport games conducted by different country

import java.util.ArrayList;
import java.util.List;

public class EsportsCountry {

    //shows country name conducting e-sports
    public String countryName;

    //arraylist for dynamic allocation of games
    List<Esports> game =new ArrayList<>();



    //CREATING getter and setter for country-name and Arraylist of e-sports

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<Esports> getGame() {
        return game;
    }

    public void setGame(List<Esports> game) {
        this.game = game;
    }

    //Creating a method to load i number of data entries (works like database)
    public void loadData(){
        for (int i = 1; i <5 ; i++) {
            Esports esports = new Esports();
            esports.setPopularity(i);
            esports.setGameName("GameName-"+i);
            getGame().add(esports);
        }
    }

    //Creating to string method to pass object as string type
    @Override
    public String toString() {
        return "EsportsCountry{" +"countryName='" + countryName + '\'' + ", game=" + game + '}';
    }

    //Creating Clone method to deep copy objects

    public EsportsCountry clone() throws CloneNotSupportedException{
        EsportsCountry esportsCountry = new EsportsCountry();
        for (Esports esports : this.getGame()){
            esportsCountry.getGame().add(esports);
        }
        return esportsCountry;
    }
}