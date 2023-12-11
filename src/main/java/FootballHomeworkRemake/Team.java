package FootballHomeworkRemake;

import java.util.ArrayList;

public class Team {
    private String name;
    private double rating;
    private Player eachPlayer;

    ArrayList<Player> teamsPlayers = new ArrayList<>();

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.isEmpty()){
            System.out.println("Name must be entered!");
        }
        else {
            this.name = name;
        }
    }

    public double getRating() {
        return rating;
    }

    private void setRating(double rating){
        rating += eachPlayer.getStatsForCurrentPlayer();
        this.rating = rating / teamsPlayers.size();
    }

    public void addPlayerToTheTeam(Player newPlayer){
        teamsPlayers.add(newPlayer);
        setRating(newPlayer.getStatsForCurrentPlayer());
    }

    public void removePlayerFromTheTeam(Player oldPlayer){
        teamsPlayers.remove(oldPlayer);
        rating -= oldPlayer.getStatsForCurrentPlayer();
    }

}
