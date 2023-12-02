package FootballHomework;

public class PlayerStatistic {
    private double endurance;
    private double sprint;
    private double dribble;
    private  double passing;
    private double shooting;

    public void PlayerStatistic(double endurance, double sprint, double dribble, double passing, double shooting){
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public double getEndurance() {
        return endurance;
    }

    private void setEndurance(double endurance) {
       if (endurance < 0 && endurance > 100){
           System.out.println("Invalid endurance value!");
       }
       else {
           this.endurance = endurance;
       }
    }

    public double getSprint() {
        return sprint;
    }

    private void setSprint(double sprint) {
        if (sprint < 0 && sprint > 100){
            System.out.println("Invalid sprint value!");
        }
        else {
            this.sprint = sprint;
        }
    }

    public double getDribble() {
        return dribble;
    }

    private void setDribble(double dribble) {
        if (dribble < 0 && dribble > 100){
            System.out.println("Invalid dribble value!");
        }
        else {
            this.dribble = dribble;
        }
    }

    public double getPassing() {
        return passing;
    }

    private void setPassing(double passing) {
        if (passing < 0 && passing > 100){
            System.out.println("Invalid passing value!");
        }
        else {
            this.passing = passing;
        }
    }

    public double getShooting() {
        return shooting;
    }

    public void setShooting(double shooting) {
        if (shooting < 0 && shooting > 100){
            System.out.println("Invalid shooting value!");
        }
        else {
            this.shooting = shooting;
        }
    }

    //method that calculate overall skill
    public double overallSkill(double endurance, double sprint, double dribble, double passing, double shooting){
        return (endurance + sprint + dribble + passing + shooting) / 5;
    }
}
