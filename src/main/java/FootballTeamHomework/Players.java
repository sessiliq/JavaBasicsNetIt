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
    private void setOverallSkill(double overallSkill) {
        //overall skill is average value of all statistics
        overallSkill = ( (endurance + sprint + dribble + passing + shooting) / 5);
        this.overallSkill = overallSkill;
    }
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

    private double getEndurance() {
        return endurance;
    }

    private void setEndurance(double endurance) {
        if (endurance < 0){
            System.out.println("The value of endurance cannot be less than 0!");
        }
        else if (endurance > 100){
            System.out.println("The value of endurance cannot be more than 100!");
        }
        else {
            this.endurance = endurance;
        }
    }

    private double getSprint() {
        return sprint;
    }

    private void setSprint(double sprint) {
        if (sprint < 0){
            System.out.println("The value of sprint cannot be less than 0!");
        }
        else if (sprint> 100){
            System.out.println("The value of sprint cannot be more than 100!");
        }
        else {
            this.sprint = sprint;
        }
    }

    private double getDribble() {
        return dribble;
    }

    private void setDribble(double dribble) {
        if (dribble < 0){
            System.out.println("The value of dribble cannot be less than 0!");
        }
        else if (dribble > 100){
            System.out.println("The value of dribble cannot be more than 100!");
        }
        else {
            this.dribble = dribble;
        }
    }

    private double getPassing() {
        return passing;
    }

    private void setPassing(double passing) {
        if (passing < 0){
            System.out.println("The value of passing cannot be less than 0!");
        }
        else if (passing > 100){
            System.out.println("The value of passing cannot be more than 100!");
        }
        else {
            this.passing = passing;
        }
    }

    private double getShooting() {
        return shooting;
    }

    private void setShooting(double shooting) {
        if (shooting < 0){
            System.out.println("The value of shooting cannot be less than 0!");
        }
        else if (shooting > 100){
            System.out.println("The value of shooting cannot be more than 100!");
        }
        else {
            this.shooting = shooting;
        }
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
