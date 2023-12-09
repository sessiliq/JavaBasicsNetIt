package FootballTeamHomework;

import java.util.ArrayList;

public class Team {
    private String name;
    private int teamSize;
    private double rating;

    ArrayList<Players> eachPlayer = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            System.out.println("Name must be entered!");
        }
        else {
            this.name = name;
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public Team (String name, int teamSize){
        setName(name);
        setTeamSize(teamSize);
    }

    public void addPlayerToTeam(Players eachPlayer){

    }
}
