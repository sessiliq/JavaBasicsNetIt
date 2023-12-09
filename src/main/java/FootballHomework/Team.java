package FootballHomework;

import java.util.ArrayList;

public class Team {
    private String name;
    private double rating;

    ArrayList<PlayersData> teamPlayers = new ArrayList<>();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            System.out.println("Name should be entered!");
        }
        else {
            this.name = name;
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating < 0){
            System.out.println("Rating cannot be negative!");
        }
        else {
            this.rating = rating;
        }
    }

    public Team (String name){
        setName(name);
    }

    public void addPlayerToTeam(){
        for (int i = 0; i < teamPlayers.size(); i++){

        }
    }
}
