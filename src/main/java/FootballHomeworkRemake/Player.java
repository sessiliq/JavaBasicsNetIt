package FootballHomeworkRemake;

public class Player {
    private String name;

    private double statsForCurrentPlayer;

    public String getName() {
        return name;
    }

    public double getStatsForCurrentPlayer() {
        return statsForCurrentPlayer;
    }

    public void setForCurrentPlayer(PlayersStats forCurrentPlayer) {
        statsForCurrentPlayer = forCurrentPlayer.getOverallSkill();
    }

    private void setName(String name) {
        if (name.isEmpty()){
            System.out.println("Name must be entered!");
        }
        else {
            this.name = name;
        }
    }

    public Player (String name, PlayersStats forCurrentPlayer){
        setName(name);
        forCurrentPlayer.getOverallSkill();
    }
}
