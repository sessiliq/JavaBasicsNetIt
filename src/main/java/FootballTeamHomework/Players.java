package FootballTeamHomework;

public class Players {
    private String name;
    private double endurance;
    private double sprint;
    private double dribble;
    private  double passing;
    private double shooting;

    private double currentRating;
    private double overallSkill;

    public double getOverallSkill() {
        return overallSkill;
    }

    public void setOverallSkill(double overallSkill) {
        overallSkill = ( (endurance + sprint + dribble + passing + shooting) / 5);
        this.overallSkill = overallSkill;
    }

    public double getCurrentRating() {
        return currentRating;
    }

    public void setCurrentRating(double currentRating) {
        currentRating += overallSkill;
        this.currentRating = currentRating;
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

    public Players (String name, double endurance, double sprint, double dribble, double passing, double shooting){
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }
}
