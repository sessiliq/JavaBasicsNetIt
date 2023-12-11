package FootballHomeworkRemake;

public class Team {
    private String name;
    private double rating;

    private Player eachPlayer;

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
        this.rating += eachPlayer.getForCurrentPlayer();
    }

}
