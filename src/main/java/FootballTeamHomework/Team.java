package FootballTeamHomework;
   /*
    A football team has variable number of players, a name and a rating.
A player has a name and stats which are the basis for his skill level.
The stats a player has are endurance, sprint, dribble, passing and shooting.
Each stat can be in the range [0..100].
The overall skill level of a player is calculated as the average of his stats.
Only the name of a player and his stats should be visible to all of the outside world.
 Everything else should be hidden.
A team should expose (term for giving an access where access would not otherwise be available) a name, a rating
(calculated by the average skill level of all players in the team) and methods for adding and removing players.
Model the team and the players following the proper principles of Encapsulation. Expose only the properties
 that needs to be visible and validate data appropriately.
     */
import java.util.ArrayList;

public class Team {
    //variables for team's name and total rating
    private String name;
    private double rating;
    //variable that keeps current sum of all skills of each player
    private double currentRating;

    //list with all the players
    ArrayList<Players> allPlayers = new ArrayList<>();

    //getter and setter for Name
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

    //getter for the Rating. Rating is set in Add Players Method
    public double getRating() {
        return rating;
    }

    //Constructor for the team
    public Team (String name){
        setName(name);
    }

    //method for adding members at the team. Here rating is set.
    public void addPlayerToTeam(Players eachPlayer){
        allPlayers.add(eachPlayer);
        currentRating+= eachPlayer.getOverallSkill();
        rating = currentRating / allPlayers.size();
    }

    //method for removing member of the team
    public void removePlayerFromTeam(Players currentPlayer){
        allPlayers.remove(currentPlayer);
        currentRating -= currentPlayer.getOverallSkill();
        rating = currentRating / allPlayers.size();
    }

    //Print count of team players
    public void printTeamCountOfPlayers(){
        System.out.printf("%s has %d players\n", getName(), allPlayers.size());
    }

    //Print the rating of the team
    public void printTeamRating(){
        System.out.printf("Rating of %s is %.2f\n", getName(), getRating());
    }

    //Print each player's skills.
    public void printEachPlayersSkills(){
        for (Players player: allPlayers) {
            System.out.printf("The statistic of %s ",player.getName());
            System.out.printf("is %.2f\n",player.getOverallSkill());
        }
    }
}
