package FootballTeamHomework;

public class Players {
    //Variables for each player
    private String name;
    private double endurance;
    private double sprint;
    private double dribble;
    private  double passing;
    private double shooting;
    private double overallSkill;

    //Setters and getters for the variables
    public double getOverallSkill() {
        return overallSkill;
    }
    public void setOverallSkill(double overallSkill) {
        //overall skill is average value of all statistics
        overallSkill = ( (endurance + sprint + dribble + passing + shooting) / 5);
        this.overallSkill = overallSkill;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEndurance() {
        return endurance;
    }

    public void setEndurance(double endurance) {
        this.endurance = endurance;
    }

    public double getSprint() {
        return sprint;
    }

    public void setSprint(double sprint) {
        this.sprint = sprint;
    }

    public double getDribble() {
        return dribble;
    }

    public void setDribble(double dribble) {
        this.dribble = dribble;
    }

    public double getPassing() {
        return passing;
    }

    public void setPassing(double passing) {
        this.passing = passing;
    }

    public double getShooting() {
        return shooting;
    }

    public void setShooting(double shooting) {
        this.shooting = shooting;
    }

    //Constructor for Player
    public Players (String name, double endurance, double sprint, double dribble, double passing, double shooting){
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
       //overall skill is set to 0 because is not accepted as a parameter. At the Set method will take appropriate value.
        setOverallSkill(0);
    }
}
