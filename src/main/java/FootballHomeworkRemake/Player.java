package FootballHomeworkRemake;

public class Player {
    private String name;

    private PlayersStats forCurrentPlayer;

    public String getName() {
        return name;
    }

    public PlayersStats getForCurrentPlayer() {
        return forCurrentPlayer;
    }

    public void setForCurrentPlayer(PlayersStats forCurrentPlayer) {
        this.forCurrentPlayer = forCurrentPlayer;
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
