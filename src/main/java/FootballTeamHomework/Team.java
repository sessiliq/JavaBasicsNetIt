package FootballTeamHomework;

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

    public void setName(String name) {
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

    //mothod for adding members at the team. Here rating is set.
    public void addPlayerToTeam(Players eachPlayer){
        allPlayers.add(eachPlayer);
        currentRating+= eachPlayer.getOverallSkill();
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
